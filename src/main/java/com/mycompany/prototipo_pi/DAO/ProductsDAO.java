package com.mycompany.prototipo_pi.DAO;

import DBConnection.ConnectionDB;
import com.mycompany.prototipo_pi.Models.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 * 
 * @author Grupo - Loja de calçados
 * Classe com métodos e funções para manipulação dos produtos do sistema
 * @version 1.2
 */
public class ProductsDAO {
    /**
     * Método responsável por adicionar produto ao banco de dados
     * @param product
     * @return product 
     */
    
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
    
    /**
     * Método responsável por resgatar produto pelo Id
     * @param id
     * @return _product
     */
    public Product getProduct(int id) {
        PreparedStatement stmt = null;
        ResultSet rs;
        Product _product = new Product();
        String sql = "SELECT * FROM produto WHERE id = ? ";

        try {
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                _product.setId(rs.getInt(1));
                _product.setNomeProduto(rs.getString(2));
                _product.setEstoque(rs.getInt(4));
            }
            return _product;
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
    /** 
     * Método responsável por retornar uma lista com todos os produtos cadastrados
     * @return lsProducts
     * 
     */
    public List<Product> getProducts() {
        ResultSet rs;
        List<Product> lsProducts = new ArrayList<>();
        String sql = "SELECT * FROM produto WHERE qtd_estoque > 0";
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
    /**
     * Método responsável por atualizar produto na base de dados
     * @param product 
     * 
     */
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
    /**
     * Método responsável por deletar produto da base de dados
     * @param id
     * @return boolean true: Produto deletado, Falha: Erro
     */
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
    /**
     * Método para buscar produtos pelo nome 
     * @param name
     * @return lsProducts
     */
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
    /**
     * Método para atualizar estoque dos produtos na base da dados
     * @param lsProducts
     * @return boolean true: Produto atualizado com sucesso, Falha: Erro ao atualizar produto
     */
    public boolean updateStock(List<Product> lsProducts) {
        for (Product product : lsProducts) {
            Product _product = getProduct(product.getId());
            int stock = _product.getEstoque() - product.getEstoque();
            if (stock < 0) {
                JOptionPane.showMessageDialog(null, "Erro", "A quantidade requerida é maior que o estoque do produto", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (_product != null) {
                PreparedStatement stmt = null;
                String sql = "UPDATE produto SET qtd_estoque = ? WHERE id = ?";
                try {
                    stmt = ConnectionDB.connDB().prepareStatement(sql);
                    stmt.setInt(1, stock);
                    stmt.setInt(2, product.getId());
                    stmt.executeUpdate();
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
        return true;
    }
}
