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

public class SaleDAO {

    UserDAO _userDao = new UserDAO();

    public List<Sale> getSales(Date dtInitial, Date dtEnd) {
        PreparedStatement stmt = null;
        ResultSet rs;
        List<Sale> lsSales = new ArrayList<>();
        String sql = "SELECT * FROM venda WHERE data_venda BETWEEN ? AND ?";
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
                _sale.setId_cliente(rs.getInt(4));
                lsSales.add(_sale);

            }
            return lsSales;
        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }

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

    public void updateEstoque() {

    }
}
