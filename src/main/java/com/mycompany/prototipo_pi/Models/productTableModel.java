package com.mycompany.prototipo_pi.Models;

import com.mycompany.prototipo_pi.DAO.ProductsDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


/**
 * 
 * @author João e Bruno
 */
public class productTableModel extends AbstractTableModel {

    private List<Product> products = new ArrayList<>();
    private String[] columns = {"Id", "Nome", "Preço", "Tamanho", "Estoque"};
    ProductsDAO _productDao = new ProductsDAO();

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                products.get(linha).setId(Integer.parseInt((String) valor));
                break;
            case 1:
                products.get(linha).setNomeProduto((String) valor);
                break;
            case 2:
                products.get(linha).setPreco(Double.parseDouble((String) valor));
                break;
            case 3:
                products.get(linha).setTamanho(Integer.parseInt((String) valor));
                break;
            case 4:
                products.get(linha).setEstoque(Integer.parseInt((String) valor));
                break;
        }
        _productDao.updateProduct(products.get(linha));
        this.fireTableRowsUpdated(linha, linha);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return products.get(rowIndex).getId();
            case 1:
                return products.get(rowIndex).getNomeProduto();
            case 2:
                return products.get(rowIndex).getPreco();
            case 3:
                return products.get(rowIndex).getTamanho();
            case 4:
                return products.get(rowIndex).getEstoque();
        }
        return null;
    }

    public void addRow(Product produto) {
        this.products.add(produto);
        this.fireTableDataChanged();

    }

    public void deleteRow(int id, int row) {
        boolean deleteExists = _productDao.deleteProduct(id);
        if (deleteExists == true) {
            removeRow(row);
        }
    }

    public void removeRow(int row) {
        this.products.remove(row);
        this.fireTableRowsDeleted(row, row);
    }
}
