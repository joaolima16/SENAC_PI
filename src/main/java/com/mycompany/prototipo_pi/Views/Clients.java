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
        jBtnRelatorio = new javax.swing.JButton();
        jBtnAdd1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        JtfBusca.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista De Clientes");

        jBtnAdd.setBackground(new java.awt.Color(0, 0, 0));
        jBtnAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAdd.setText("Inserir");
        jBtnAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnAlt.setBackground(new java.awt.Color(0, 0, 0));
        jBtnAlt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAlt.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAlt.setText("Alterar");
        jBtnAlt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAltActionPerformed(evt);
            }
        });

        jBtnExc.setBackground(new java.awt.Color(0, 0, 0));
        jBtnExc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnExc.setForeground(new java.awt.Color(255, 255, 255));
        jBtnExc.setText("Excluir");
        jBtnExc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        btnProduts.setBackground(new java.awt.Color(0, 0, 0));
        btnProduts.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnProduts.setForeground(new java.awt.Color(255, 255, 255));
        btnProduts.setText("Produtos");
        btnProduts.setBorder(null);
        btnProduts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutsActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(0, 0, 0));
        btnVendas.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.setText("Venda");
        btnVendas.setBorder(null);
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        jBtnRelatorio.setBackground(new java.awt.Color(0, 0, 0));
        jBtnRelatorio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jBtnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRelatorio.setText("Relátorio");
        jBtnRelatorio.setBorder(null);
        jBtnRelatorio.setBorderPainted(false);
        jBtnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRelatorioActionPerformed(evt);
            }
        });

        jBtnAdd1.setBackground(new java.awt.Color(204, 204, 204));
        jBtnAdd1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBtnAdd1.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProduts)
                        .addGap(53, 53, 53)
                        .addComponent(btnVendas)
                        .addGap(39, 39, 39)
                        .addComponent(jBtnRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnAlt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnExc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                        .addComponent(jBtnRelatorio)))
                .addGap(40, 40, 40)
                .addComponent(jBtnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAlt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnExc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
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
        Sales salesForm = new Sales();
        salesForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVendasActionPerformed

    private void jBtnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdd1ActionPerformed
        filterUsers();
    }//GEN-LAST:event_jBtnAdd1ActionPerformed

    private void jBtnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRelatorioActionPerformed
        SyntheticReport report = new SyntheticReport();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRelatorioActionPerformed
    public void filterUsers() {
        List<User> lsUsers = _userDao.findUsersForNameOrCpf(JtfBusca.getText());
        clearTable();
        for (User user : lsUsers) {
            _userTableModel.addRow(user);
            
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
                if ("Windows classic".equals(info.getName())) {
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
    private javax.swing.JButton jBtnRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUsuarios;
    // End of variables declaration//GEN-END:variables
}
