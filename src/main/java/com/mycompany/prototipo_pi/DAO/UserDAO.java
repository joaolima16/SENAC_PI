package com.mycompany.prototipo_pi.DAO;

import DBConnection.ConnectionDB;
import com.mycompany.prototipo_pi.Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserDAO {

    public User addUser(User user) {

        try {
            ResultSet userExists = findUser(user.getCpf());
            if (userExists == null) {
                String sql = "INSERT INTO cliente(nome,cpf,email,sexo,estado_civil, telefone, dataNascimento, cep, bairro, logradouro, cidade, numero) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt = ConnectionDB.connDB().prepareStatement(sql);
                pstmt.setString(1, user.getNome());
                pstmt.setString(2, user.getCpf());
                pstmt.setString(3, user.getEmail());
                pstmt.setString(4, user.getSexo());
                pstmt.setString(5, user.getEstadoCivil());
                pstmt.setString(6, user.getTelefone());
                pstmt.setDate(7, new java.sql.Date(user.getDataNascimento().getTime()));
                pstmt.setString(8, user.getCep());
                pstmt.setString(9, user.getBairro());
                pstmt.setString(10, user.getLogradouro());
                pstmt.setString(11, user.getCidade());
                pstmt.setString(12, user.getNumero());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário registrado");
                return user;
            } else {
                return null;
            }

        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }

    ;
    public ResultSet findUser(String cpf) {
        try {
            String sql = "SELECT * FROM cliente WHERE cpf=?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs;
            }
            return null;
        } catch (SQLException ex) {
            throw new Error(ex.getMessage());
        }
    }

    public boolean updateUser(User user, String cpf) {
        try {
            String sql = "UPDATE cliente SET nome =?, cpf = ?, telefone = ?, email = ?, "
                    + "dataNascimento = ?, cep = ?,bairro = ?,cidade = ?, "
                    + "logradouro = ?, numero = ?,sexo = ?, "
                    + "estado_civil = ?  WHERE cpf = ?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getCpf());
            stmt.setString(3, user.getTelefone());
            stmt.setString(4, user.getEmail());
            stmt.setDate(5, new java.sql.Date(user.getDataNascimento().getTime()));
            stmt.setString(6, user.getCep());
            stmt.setString(7, user.getBairro());
            stmt.setString(8, user.getCidade());
            stmt.setString(9, user.getLogradouro());
            stmt.setString(10, user.getNumero());
            stmt.setString(11, user.getSexo());
            stmt.setString(12, user.getEstadoCivil());
            stmt.setString(13, cpf);
            stmt.executeUpdate();
            System.out.println("Usuário atualizado");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public ResultSet findUsers() {
        try {
            String sql = "SELECT id,nome,cpf,email,telefone,dataNascimento FROM cliente";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            return rs;

        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }

    public String loginUser(String email, String password) {
        try {
            String sql = "SELECT * FROM cliente WHERE email = ? AND senha = ?";

            PreparedStatement stmt = ConnectionDB.connDB().prepareCall(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return "Usuário encontrado";
            }
            return "Usuário não encontrado";
        } catch (SQLException ex) {
            throw new Error(ex);

        }
    }

    public boolean deleteUser(String cpf) {
        try {
            String sql = "DELETE FROM cliente WHERE cpf = ? ";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.executeUpdate();
            System.out.println("Usuário deletado");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;

        }
    }

    public ResultSet findUsersForNameOrCpf(String value) {
        try {
            ResultSet rs;
            String sql = "SELECT id,nome,cpf,email,telefone,dataNascimento FROM cliente WHERE nome LIKE ? OR cpf LIKE ?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, "%" + value + "%");
            stmt.setString(2, "%" + value + "%");
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }
}
