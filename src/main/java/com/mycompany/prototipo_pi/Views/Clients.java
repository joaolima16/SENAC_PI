package com.mycompany.prototipo_pi.Views;

import com.mycompany.prototipo_pi.DAO.UserDAO;
import com.mycompany.prototipo_pi.Models.User;
import com.mycompany.prototipo_pi.Models.userTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Clients extends javax.swing.JFrame {

    userTableModel _userTableModel = new userTableModel();
    UserDAO _userDao = new UserDAO();

    public Clients() {
        initComponents();
        jtUsuarios.setModel(_userTableModel);
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JtfBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnAdd = new javax.swing.JButton();
        jBtnAlt = new javax.swing.JButton();
        jBtnExc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        btnProduts = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBtnAdd1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        JtfBusca.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lista De Clientes");

        jBtnAdd.setBackground(new java.awt.Color(204, 204, 204));
        jBtnAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAdd.setForeground(new java.awt.Color(0, 0, 0));
        jBtnAdd.setText("Inserir");
        jBtnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnAlt.setBackground(new java.awt.Color(204, 204, 204));
        jBtnAlt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAlt.setForeground(new java.awt.Color(0, 0, 0));
        jBtnAlt.setText("Alterar");
        jBtnAlt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAltActionPerformed(evt);
            }
        });

        jBtnExc.setBackground(new java.awt.Color(204, 204, 204));
        jBtnExc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnExc.setForeground(new java.awt.Color(0, 0, 0));
        jBtnExc.setText("Excluir");
        jBtnExc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcActionPerformed(evt);
            }
        });

        jtUsuarios.setBackground(new java.awt.Color(153, 153, 153));
        jtUsuarios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jtUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jtUsuarios);

        btnProduts.setBackground(new java.awt.Color(204, 204, 204));
        btnProduts.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        btnProduts.setForeground(new java.awt.Color(0, 0, 0));
        btnProduts.setText("Produtos");
        btnProduts.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnProduts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutsActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(204, 204, 204));
        btnVendas.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(0, 0, 0));
        btnVendas.setText("Venda");
        btnVendas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Relátorio");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jBtnAdd1.setBackground(new java.awt.Color(204, 204, 204));
        jBtnAdd1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAdd1.setForeground(new java.awt.Color(0, 0, 0));
        jBtnAdd1.setText("Buscar");
        jBtnAdd1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnProduts)
                .addGap(18, 18, 18)
                .addComponent(btnVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(JtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExc, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jBtnAdd1)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProduts)
                        .addComponent(btnVendas)
                        .addComponent(jButton3)))
                .addGap(36, 36, 36)
                .addComponent(jBtnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAlt)
                .addGap(12, 12, 12)
                .addComponent(jBtnExc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fillTable() {
        List<User> lsUsers = _userDao.findUsers();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (User user : lsUsers) {
            _userTableModel.addRow(user);

        }
    }
    private void jBtnExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcActionPerformed
        if (jtUsuarios.getSelectedRow() != -1) {
            String cpf = _userTableModel.getValueAt(jtUsuarios.getSelectedRow(), 1).toString();
            _userTableModel.deleteRow(cpf, jtUsuarios.getSelectedRow());
        }

    }//GEN-LAST:event_jBtnExcActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        Register registerForm = new Register();
        registerForm.setVisible(true);
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAltActionPerformed
        String cpf = _userTableModel.getValueAt(jtUsuarios.getSelectedRow(), 1).toString();
        System.out.println(cpf);
        Update updateUserForm = new Update(cpf);
        updateUserForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnAltActionPerformed

    private void btnProdutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutsActionPerformed
        Products productForm = new Products();
        productForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnProdutsActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        Sales vendasForm = new Sales();
        vendasForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVendasActionPerformed

    private void jBtnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdd1ActionPerformed
        filterUsers();
    }//GEN-LAST:event_jBtnAdd1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed
    public void filterUsers() {
        ResultSet rs = _userDao.findUsersForNameOrCpf(JtfBusca.getText());
        clearTable();
        try {
            while (rs.next()) {
                User _user = new User();
                _user.setNome(rs.getString(2));
                _user.setCpf(rs.getString(3));
                _user.setEmail(rs.getString(4));
                _user.setTelefone(rs.getString(5));
                _user.setDataNascimento(rs.getDate(6));
                _userTableModel.addRow(_user);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void clearTable() {
        int rowCount = _userTableModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            _userTableModel.removeRow(i);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Clients.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtfBusca;
    private javax.swing.JButton btnProduts;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnAdd1;
    private javax.swing.JButton jBtnAlt;
    private javax.swing.JButton jBtnExc;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUsuarios;
    // End of variables declaration//GEN-END:variables
}
