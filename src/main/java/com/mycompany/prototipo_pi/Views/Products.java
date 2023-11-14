package com.mycompany.prototipo_pi.Views;

import com.mycompany.prototipo_pi.DAO.ProductsDAO;
import com.mycompany.prototipo_pi.Models.Product;
import com.mycompany.prototipo_pi.Models.User;
import com.mycompany.prototipo_pi.Models.productTableModel;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.text.PlainDocument;

public class Products extends javax.swing.JFrame {

    Clients clients = new Clients();
    Venda _venda = new Venda();
    ProductsDAO _productDao = new ProductsDAO();
    productTableModel _productTableModel = new productTableModel();

    public Products() {
        initComponents();
        jtProdutos.setModel(_productTableModel);
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JtfBusca = new javax.swing.JTextField();
        jbtAdd = new javax.swing.JButton();
        jtnAlt = new javax.swing.JButton();
        jtbExc = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JtfPreco = new javax.swing.JTextField();
        JcbTamanho = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JtfEstoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista de produtos");

        JtfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfBuscaActionPerformed(evt);
            }
        });

        jbtAdd.setBackground(new java.awt.Color(204, 204, 204));
        jbtAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbtAdd.setForeground(new java.awt.Color(0, 0, 0));
        jbtAdd.setText("Adicionar");
        jbtAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jtnAlt.setBackground(new java.awt.Color(204, 204, 204));
        jtnAlt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jtnAlt.setForeground(new java.awt.Color(0, 0, 0));
        jtnAlt.setText("Alterar");
        jtnAlt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnAltActionPerformed(evt);
            }
        });

        jtbExc.setBackground(new java.awt.Color(204, 204, 204));
        jtbExc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jtbExc.setForeground(new java.awt.Color(0, 0, 0));
        jtbExc.setText("Deletar");
        jtbExc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbExcActionPerformed(evt);
            }
        });

        btnCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnCliente.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnCliente.setText("Clientes");
        btnCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        btnRelatorio.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(0, 0, 0));
        btnRelatorio.setText("Relátorio");
        btnRelatorio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnVendas.setBackground(new java.awt.Color(204, 204, 204));
        btnVendas.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(0, 0, 0));
        btnVendas.setText("Venda");
        btnVendas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        btnPesquisa.setText("Buscar");
        btnPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(JtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtnAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtbExc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente)
                    .addComponent(btnRelatorio)
                    .addComponent(btnVendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAdd)
                    .addComponent(jtnAlt)
                    .addComponent(jtbExc)))
        );

        jtProdutos.setBackground(new java.awt.Color(51, 51, 51));
        jtProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProdutos);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        JtfNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfNomeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Preço");

        JtfPreco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JtfPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfPrecoFocusGained(evt);
            }
        });
        JtfPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfPrecoKeyTyped(evt);
            }
        });

        JcbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "33", "34", "35", "36", "37", "39" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Tamanho");

        JtfEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfEstoqueFocusLost(evt);
            }
        });
        JtfEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtfEstoqueKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Estoque");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JcbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JcbTamanho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(JtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean validarCampos() {
        if (JtfNome.getText().equals("") || JtfPreco.getText().equals("") || JtfEstoque.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Para realizar o cadastro preencha todos os campos");
            return false;
        } else {
            return true;
        }
    }

    private void fillTable() {
        try {
            ResultSet rs;
            rs = _productDao.getProducts();
            while (rs.next()) {
                Product _product = new Product(rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getInt(5));
                _product.setId(rs.getInt(1));
                _productTableModel.addRow(_product);
            }
        } catch (SQLException ex) {

        }

    }
    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        boolean validacao = validarCampos();
        if (validacao == true) {
            int tamanho = Integer.parseInt(JcbTamanho.getSelectedItem().toString());
            int estoque = Integer.parseInt(JtfEstoque.getText());
            var produto = new Product(JtfNome.getText(), Double.parseDouble(JtfPreco.getText()), tamanho, estoque);
            _productTableModel.addRow(produto);
            registerProduct(produto);
        }


    }//GEN-LAST:event_jbtAddActionPerformed
    private void registerProduct(Product product) {
        _productDao.insertProduct(product);
    }
    private void jtbExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExcActionPerformed
        if (jtProdutos.getSelectedRow() != -1) {
            _productTableModel.removeRow(jtProdutos.getSelectedRow());

        }
    }//GEN-LAST:event_jtbExcActionPerformed

    private void JtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfNomeKeyTyped
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        int limite = 20;
        if (text.length() >= limite) {
            evt.consume();

        }
    }//GEN-LAST:event_JtfNomeKeyTyped

    private void JtfPrecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfPrecoFocusGained
        JTextField textField = (JTextField) evt.getSource();
        PlainDocument document = (PlainDocument) textField.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {

                if (string.matches("[0-9.]+")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {

                if (text.matches("[0-9.]+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }//GEN-LAST:event_JtfPrecoFocusGained

    private void JtfEstoqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfEstoqueFocusLost
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();

        try {
            int valor = Integer.parseInt(text);
            if (valor <= 0) {
                JOptionPane.showMessageDialog(this, "O valor não pode ser menor ou igual a 0.", "Erro", JOptionPane.ERROR_MESSAGE);
                textField.setText("");
            }
        } catch (NumberFormatException ex) {

        }
    }//GEN-LAST:event_JtfEstoqueFocusLost

    private void JtfPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfPrecoKeyTyped
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();
        int limite = 15;
        if (text.length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_JtfPrecoKeyTyped

    private void JtfEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfEstoqueKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_JtfEstoqueKeyTyped

    private void jtnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnAltActionPerformed
        validarCampos();
        Object id = _productTableModel.getValueAt(jtProdutos.getSelectedRow(), 0);
        String _id = id.toString();
        if (jtProdutos.getSelectedRow() != -1) {
            _productTableModel.setValueAt(_id, jtProdutos.getSelectedRow(), 0);
            _productTableModel.setValueAt(JtfNome.getText(), jtProdutos.getSelectedRow(), 1);
            _productTableModel.setValueAt(JtfPreco.getText(), jtProdutos.getSelectedRow(), 2);
            _productTableModel.setValueAt(JcbTamanho.getSelectedItem().toString(), jtProdutos.getSelectedRow(), 3);
            _productTableModel.setValueAt(JtfEstoque.getText(), jtProdutos.getSelectedRow(), 4);
        }
    }//GEN-LAST:event_jtnAltActionPerformed

    private void JtfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfBuscaActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        Clients clients = new Clients();
        clients.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        _venda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVendasActionPerformed
    private void clearTable() {
        int rowCount = _productTableModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            _productTableModel.removeRow(i);
        }
    }

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        ResultSet rs = _productDao.findProductsByName(JtfBusca.getText());
        clearTable();
        try {
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum cliente com essas informações");
                fillTable();
            } else {
                while (rs.next()) {
                    User _user = new User();
                    _user.setNome(rs.getString(2));
                    _user.setCpf(rs.getString(3));
                    _user.setEmail(rs.getString(4));
                    _user.setTelefone(rs.getString(5));
                    _user.setDataNascimento(rs.getDate(6));
                    _userTableModel.addRow(_user);
                }
            }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    

    

    

    

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcbTamanho;
    private javax.swing.JTextField JtfBusca;
    private javax.swing.JTextField JtfEstoque;
    private javax.swing.JTextField JtfNome;
    private javax.swing.JTextField JtfPreco;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JButton jtbExc;
    private javax.swing.JButton jtnAlt;
    // End of variables declaration//GEN-END:variables
}
