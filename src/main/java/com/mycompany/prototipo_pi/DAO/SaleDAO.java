package com.mycompany.prototipo_pi.DAO;

import DBConnection.ConnectionDB;
import com.mycompany.prototipo_pi.Models.Product;
import com.mycompany.prototipo_pi.Models.Sale;
import com.mycompany.prototipo_pi.Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class SaleDAO {

    UserDAO _userDao = new UserDAO();

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
                    }
                }
                return true;

            } 
            catch (SQLException ex) {
                throw new Error(ex);
            } 
            finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException ex) {
                    throw new Error(ex);
                }

            }
        }
        return false;
    }

    public boolean registerItensSale(List<Product> lsProducts, int idSale) {;
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

        } 
        catch (SQLException ex) {
            throw new Error(ex);
        } 
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                throw new Error(ex);
            }

        }
    }
;
}
