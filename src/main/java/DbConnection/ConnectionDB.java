/*
 * The MIT License
 *
 * Copyright 2023 Grupo - Loja de calçados.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Grupo - Loja de calçados
 * @version 1.5
 *
 */
public class ConnectionDB {

    /**
     * Método responsável pela conexão com banco de dados
     *
     * @return conn
     * @throws SQLException
     */
    public static Connection connDB() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pi", "root", "");
            System.out.println("Conectado");
        } catch (ClassNotFoundException ex) {
            throw new Error(ex);
        }
        return conn;
    }
    /**
     * Método responsável por criar as tabelas do banco de dados
     * @throws SQLException 
     */
    public void createTables() throws SQLException {
        Statement stmt = connDB().createStatement();

        String tableUsers = """
                    CREATE TABLE IF NOT EXISTS cliente (
                    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL, nome VARCHAR(60), cpf  CHAR(11) UNIQUE,
                    email VARCHAR(50),sexo ENUM('M','F'), estado_civil ENUM('casado', 'solteiro'), telefone CHAR(11), dataNascimento DATE,
                    cep CHAR(8), bairro VARCHAR(40), logradouro VARCHAR(50), cidade VARCHAR(20), numero VARCHAR(5)
                         );""";

        String tableProducts = """
                    CREATE TABLE IF NOT EXISTS produto(
                    id INT AUTO_INCREMENT PRIMARY KEY, nome_produto VARCHAR(40),
                    preco_unitario DECIMAL(10,4), qtd_estoque INT, tamanho INT          
                        )
                        """;
        String tableSale = """
                    CREATE TABLE IF NOT EXISTS venda(
                    id_venda INT AUTO_INCREMENT PRIMARY KEY, 
                    data_venda DATE,
                    valor_venda DECIMAL(10,4),
                    id_cliente INT,
                    FOREIGN KEY(id_cliente) REFERENCES cliente(id)
                    )
                    """;
        String tableProductsSales = """
            CREATE TABLE IF NOT EXISTS item_venda(
               id_item_venda INT AUTO_INCREMENT PRIMARY KEY,
               qtd_produto INT,
               id_venda INT,
               id_produto INT,
               CONSTRAINT FOREIGN KEY(id_venda) REFERENCES VENDA(id_venda),
               CONSTRAINT FOREIGN KEY(id_produto) REFERENCES produto(id)  
                );
                """;

        stmt.executeUpdate(tableUsers);
        stmt.executeUpdate(tableProducts);
        stmt.execute(tableProductsSales);
        stmt.executeUpdate(tableSale);
        System.out.println("Tabela criada");
    }
;
}
