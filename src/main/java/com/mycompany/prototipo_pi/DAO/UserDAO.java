package com.mycompany.prototipo_pi.DAO;

import DBConnection.ConnectionDB;
import com.mycompany.prototipo_pi.Models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe responsável pelos métodos e manipulação das ações do usuário no Banco de dados 
 * @author Grupo - Loja de calçados
 */

public class UserDAO {
    /**
     * Método responsável por adicionar usuário na base de dados
     * @param user
     * @return user
     */
    public User addUser(User user) {
        PreparedStatement pstmt = null;
        try {
            User userExists = findUser(user.getCpf());
            if (userExists == null) {
                String sql = "INSERT INTO cliente(nome,cpf,email,sexo,estado_civil, telefone, dataNascimento, cep, bairro, logradouro, cidade, numero) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                pstmt = ConnectionDB.connDB().prepareStatement(sql);
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
    /**
     * Método responsável por buscar usuário pelo CPF
     * @param cpf
     * @return _user
     */
    public User findUser(String cpf) {
        PreparedStatement stmt = null;
        User _user = new User();

        try {
            String sql = "SELECT * FROM cliente WHERE cpf=?";
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                _user.setId(rs.getInt(1));
                _user.setNome(rs.getString(2));
                _user.setCpf(rs.getString(3));
                _user.setEmail(rs.getString(4));
                _user.setSexo(rs.getString(5));
                _user.setEstadoCivil(rs.getString(6));
                _user.setTelefone(rs.getString(7));
                _user.setDataNascimento(rs.getDate(8));
                _user.setCep(rs.getString(9));
                _user.setBairro(rs.getString(10));
                _user.setLogradouro(rs.getString(11));
                _user.setCidade(rs.getString(12));
                _user.setNumero(rs.getString(13));
                return _user;
            }

            return null;
        } catch (SQLException ex) {
            throw new Error(ex.getMessage());
        }
    }
    /**
     * Método responsável por atualizar dados do usuário com base no CPF
     * @param user
     * @param cpf
     * @return boolean, true: Usuário atualizado com sucesso, false: Ocorreu um erro ao atualizar o usuário
     */
    public boolean updateUser(User user, String cpf) {
        PreparedStatement stmt = null;
        try {
            String sql = "UPDATE cliente SET nome =?, cpf = ?, telefone = ?, email = ?, "
                    + "dataNascimento = ?, cep = ?,bairro = ?,cidade = ?, "
                    + "logradouro = ?, numero = ?,sexo = ?, "
                    + "estado_civil = ?  WHERE cpf = ?";
            stmt = ConnectionDB.connDB().prepareStatement(sql);
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
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    /**
     * Método responsável por buscar todos os usuários cadastrados na base de dados
     * @return lsUsers 
     */
    public List<User> findUsers() {
        PreparedStatement stmt = null;
        List<User> lsUsers = new ArrayList<>();
        try {
            String sql = "SELECT id,nome,cpf,email,telefone,dataNascimento FROM cliente";
            stmt = ConnectionDB.connDB().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                User _user = new User();
                _user.setId(rs.getInt(1));
                _user.setNome(rs.getString(2));
                _user.setCpf(rs.getString(3));
                _user.setEmail(rs.getString(4));
                _user.setTelefone(rs.getString(5));
                _user.setDataNascimento(rs.getDate(6));
                lsUsers.add(_user);
            }
            return lsUsers;

        } catch (SQLException ex) {
            throw new Error(ex);
        }

    }
    /**
     * 
     * @param email
     * @param password
     * @return 
     */
    public String loginUser(String email, String password) {
        PreparedStatement stmt = null;
        try {
            String sql = "SELECT * FROM cliente WHERE email = ? AND senha = ?";
            stmt = ConnectionDB.connDB().prepareCall(sql);
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
    /**
     * Método responsável por deletar usuário da base de dados com base no seu CPF
     * @param cpf
     * @return boolean, true: Usuário deletado, false: Ocorreu um erro ao deletar o usuário
     */
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
    /**
     * Método para retornar usuários com base no nome ou cpf
     * @param value
     * @return 
     */
    public List<User> findUsersForNameOrCpf(String value) {
        List<User> lsUsers = new ArrayList<User>();
        try {
            ResultSet rs;
            String sql = "SELECT id,nome,cpf,email,telefone,dataNascimento FROM cliente WHERE nome LIKE ? OR cpf LIKE ?";
            PreparedStatement stmt = ConnectionDB.connDB().prepareStatement(sql);
            stmt.setString(1, "%" + value + "%");
            stmt.setString(2, "%" + value + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                User _user = new User();
                _user.setId(rs.getInt(1));
                _user.setNome(rs.getString(2));
                _user.setCpf(rs.getString(3));
                _user.setEmail(rs.getString(4));
                _user.setTelefone(rs.getString(5));
                _user.setDataNascimento(rs.getDate(6));
                lsUsers.add(_user);
                
            }
         return lsUsers;
        } catch (SQLException ex) {
            throw new Error(ex);
        }
    }
}
