package com.mycompany.prototipo_pi.DAO;

import DBConnection.ConnectionDB;
import com.mycompany.prototipo_pi.Models.Product;
import com.mycompany.prototipo_pi.Models.Sale;
import com.mycompany.prototipo_pi.Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


/**
 * Classe responsável pela manipulação e inserção de dados da tabela de vendas
 * @author Grupo - Loja de calçados
 */
public class SaleDAO {

    UserDAO _userDao = new UserDAO();
    /**
     * Método responsável por filtrar as vendas por uma data
     * @param dtInitial
     * @param dtEnd
     * @return lsSales
     */
    public List<Sale> getSales(Date dtInitial, Date dtEnd) {
        PreparedStatement stmt = null;
        ResultSet rs;
        List<Sale> lsSales = new ArrayList<>();

        String sql = "SELECT v.id_venda, v.data_venda, valor_venda, c.cpf FROM venda AS v INNER JOIN cliente AS c "
                + "ON v.id_cliente = c.id "
                + "WHERE v.data_venda BETWEEN ? AND ?";

        try {
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(dtInitial.getTime()));
            stmt.setDate(2, new java.sql.Date(dtEnd.getTime()));
            rs = stmt.executeQuery();
            while (rs.next()) {
                Sale _sale = new Sale();
                _sale.setId_venda(rs.getInt(1));
                _sale.setData_venda(rs.getDate(2));
                _sale.setValor_venda(rs.getDouble(3));
                _sale.setCpf(rs.getString(4));
                lsSales.add(_sale);

            }
            return lsSales;
        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }
    /**
     * Método responsável por registrar venda e itens da venda na base de dados
     * @param lsProducts
     * @param sale
     * @param cpf
     * @return boolean, true: venda registrada, false: erro ao registrar venda
     */
    
    public boolean registerSale(List<Product> lsProducts, Sale sale, String cpf) {
        User _user = _userDao.findUser(cpf);
        PreparedStatement stmt = null;
        if (_user != null) {
            sale.setId_cliente(_user.getId());

            try {
                String sql = "INSERT INTO VENDA (data_venda, valor_venda, id_cliente) VALUES (?,?,?)";
                stmt = ConnectionDB.connDB().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setDate(1, new java.sql.Date(sale.getData_venda().getTime()));
                stmt.setDouble(2, sale.getValor_venda());
                stmt.setInt(3, sale.getId_cliente());
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    ResultSet rs = stmt.getGeneratedKeys();
                    if (rs.next()) {
                        registerItensSale(lsProducts, rs.getInt(1));
                    } else {
                        return false;
                    }
                }

            } catch (SQLException ex) {
                throw new Error(ex);
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException ex) {
                    throw new Error(ex);
                }

            }
        }
        return true;
    }
    /**
     * 
     * Método responsável por retornar detalhes dos produtos da venda realizada
     * @param id_venda
     * @return lsProducts
     */
    public List<Product> getSaleProduct(int id_venda) {
        PreparedStatement stmt = null;
        ResultSet rs;
        List<Product> lsProducts = new ArrayList<>();
        String sql = "SELECT p.nome_produto, p.preco_unitario, v.qtd_produto "
           + "FROM item_venda AS v INNER JOIN produto AS p "
           + "ON v.id_produto = p.id "
           + "WHERE id_venda = ?";
        try {
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setInt(1, id_venda);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Product _product = new Product();
                _product.setNomeProduto(rs.getString(1));
                _product.setPreco(rs.getDouble(2));
                _product.setEstoque(rs.getInt(3));
                lsProducts.add(_product);
            }
            return lsProducts;
        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }
    /**
     * Método responsável por registar os itens da venda realizada na base de dados
     * @param lsProducts
     * @param idSale
     * @return boolean, true: Item da venda registrado, false: Ocorreu um erro ao registrar o item de venda
     */
    public boolean registerItensSale(List<Product> lsProducts, int idSale) {
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO item_venda(qtd_produto,id_venda,id_produto) VALUES(?,?,?)";
            for (Product products : lsProducts) {
                stmt = ConnectionDB.connDB().prepareStatement(sql);
                stmt.setInt(1, products.getEstoque());
                stmt.setInt(2, idSale);
                stmt.setInt(3, products.getId());
                stmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Venda registrada");
            return true;

        } catch (SQLException ex) {
            throw new Error(ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                throw new Error(ex);
            }

        }
    }

}
