package com.mycompany.prototipo_pi.DAO;

import DBConnection.ConnectionDB;
import com.mycompany.prototipo_pi.Models.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAO {

    public Product insertProduct(Product product) {
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO produto (nome_produto,preco_unitario,qtd_estoque, tamanho) VALUES(?,?,?,?)";
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, product.getNomeProduto());
            stmt.setDouble(2, product.getPreco());
            stmt.setInt(3, product.getEstoque());
            stmt.setInt(4, product.getTamanho());
            stmt.executeUpdate();
            System.out.println("Produto adicionado");
            return product;
        } catch (SQLException ex) {
            throw new Error(ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {

            }
        }
    }

    public List<Product> getProducts() {
        ResultSet rs;
        List<Product> lsProducts = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        PreparedStatement stmt = null;
        try {
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                lsProducts.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(5), rs.getInt(4)));

            }
            return lsProducts;
        } catch (SQLException ex) {
            throw new Error(ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {

            }
        }
    }

    public void updateProduct(Product product) {
        PreparedStatement stmt = null;
        try {
            String sql = "UPDATE produto SET nome_produto = ?, preco_unitario = ?, qtd_estoque = ?, tamanho = ? WHERE id =?";
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, product.getNomeProduto());
            stmt.setDouble(2, product.getPreco());
            stmt.setInt(3, product.getEstoque());
            stmt.setInt(4, product.getTamanho());
            stmt.setInt(5, product.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public boolean deleteProduct(int id) {
        PreparedStatement stmt = null;
        try {
            String sql = "DELETE FROM produto WHERE id =?";
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public List<Product> findProductsByName(String name) {
        PreparedStatement stmt = null;
        List<Product> lsProducts = new ArrayList<Product>();
        try {
            ResultSet rs;
            String sql = "SELECT * FROM produto WHERE nome_produto LIKE ? ORDER BY ID";
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, "%" + name + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                lsProducts.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(5), rs.getInt(4)));
            }
            return lsProducts;
        } catch (SQLException ex) {
            throw new Error(ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {

            }
        }
    }
}
