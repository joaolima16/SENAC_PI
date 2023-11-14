package com.mycompany.prototipo_pi.DAO;

import DBConnection.ConnectionDB;
import com.mycompany.prototipo_pi.Models.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductsDAO {

    public Product insertProduct(Product product) {
        try {
            String sql = "INSERT INTO produto (nome_produto,preco_unitario,qtd_estoque, tamanho) VALUES(?,?,?,?)";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, product.getNomeProduto());
            stmt.setDouble(2, product.getPreco());
            stmt.setInt(3, product.getEstoque());
            stmt.setInt(4, product.getTamanho());
            stmt.executeUpdate();
            System.out.println("Produto adicionado");
            return product;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public ResultSet getProducts() {
        try {
            ResultSet rs;
            String sql = "SELECT * FROM produto";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public void updateProduct(Product product) {
        try {
            String sql = "UPDATE produto SET nome_produto = ?, preco_unitario = ?, qtd_estoque = ?, tamanho = ? WHERE id =?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
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

    public void deleteProduct(int id) {
        try {
            
            String sql = "DELETE FROM produto WHERE id =?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }
    public ResultSet findProductsByName(String name){
    try{
        ResultSet rs;
        String sql = "SELECT * FROM produto WHERE nome_produto LIKE ?";
        PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
        stmt.setString(1, "%"+name+"%");
        rs = stmt.executeQuery();
        return rs;
    }
    catch(SQLException ex){
    throw new Error(ex);
    }
    
    }
}
