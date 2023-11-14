package com.mycompany.prototipo_pi.Models;

import com.mycompany.prototipo_pi.DAO.UserDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class userTableModel extends AbstractTableModel {

    private List<User> users = new ArrayList<>();
    private String[] columns = {"Nome", "CPF", "Email", "Telefone", "Data de nascimento"};
    UserDAO _userDao = new UserDAO();

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return users.get(rowIndex).getNome();
            case 1:
                return users.get(rowIndex).getCpf();
            case 2:
                return users.get(rowIndex).getEmail();
            case 3:
                return users.get(rowIndex).getTelefone();
            case 4:
                return users.get(rowIndex).getDataNascimento();
        }
        return null;
    }

    public void addRow(User user) {
        this.users.add(user);
        this.fireTableDataChanged();

    }

    public void deleteRow(String cpf, int row) {
        boolean deleteExists = _userDao.deleteUser(cpf);
        if (deleteExists == true) {
               removeRow(row);
        }
    }

    public void removeRow(int row) {
        this.users.remove(row);
        this.fireTableRowsDeleted(row, row);
    }

}
