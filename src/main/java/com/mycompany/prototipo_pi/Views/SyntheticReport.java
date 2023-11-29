package com.mycompany.prototipo_pi.Views;

import com.mycompany.prototipo_pi.DAO.SaleDAO;
import com.mycompany.prototipo_pi.Models.Sale;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SyntheticReport extends javax.swing.JFrame {

    DefaultTableModel defaultModel = new DefaultTableModel();
    List<Sale> lsSales = new ArrayList<>();
    SaleDAO _saleDao = new SaleDAO();

    public SyntheticReport() {
        initComponents();
        configureTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JlSales = new javax.swing.JLabel();
        JlClient = new javax.swing.JLabel();
        JlProduct = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtSales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JbtnDetails = new javax.swing.JButton();
        JdInicio = new com.toedter.calendar.JDateChooser();
        JdEnd = new com.toedter.calendar.JDateChooser();
        JbnSearch = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Relatório");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Clientes");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Produtos");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14mouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        JlSales.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        JlSales.setForeground(new java.awt.Color(255, 255, 255));
        JlSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlSales.setText("Vendas");
        JlSales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JlSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlSalesMouseClicked(evt);
            }
        });

        JlClient.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        JlClient.setForeground(new java.awt.Color(255, 255, 255));
        JlClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlClient.setText("Clientes");
        JlClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlClientMouseClicked(evt);
            }
        });

        JlProduct.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        JlProduct.setForeground(new java.awt.Color(255, 255, 255));
        JlProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlProduct.setText("Produtos");
        JlProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JlProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlProductmouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(JlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(JlClient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JlSales, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JlSales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JlClient))
                    .addComponent(JlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        JtSales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JtSales);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Data Inicial");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Data final");

        JbtnDetails.setBackground(new java.awt.Color(0, 0, 0));
        JbtnDetails.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        JbtnDetails.setForeground(new java.awt.Color(255, 255, 255));
        JbtnDetails.setText("Detalhes");
        JbtnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDetailsActionPerformed(evt);
            }
        });

        JbnSearch.setBackground(new java.awt.Color(0, 0, 0));
        JbnSearch.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        JbnSearch.setForeground(new java.awt.Color(255, 255, 255));
        JbnSearch.setText("Buscar");
        JbnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JdInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JdEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JbtnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JdEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JbtnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JbnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JdInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private void populateTable() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        clearTable();

        if (lsSales.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum dado encontrado!");
        }
        for (Sale sale : lsSales) {
            String id_sale = String.valueOf(sale.getId_venda());
            String data = sdf.format(sale.getData_venda());
            String value_sale = String.valueOf(sale.getValor_venda());
            String cpf_client = sale.getCpf();

            defaultModel.addRow(new String[]{
                id_sale,
                data,
                value_sale,
                cpf_client

            });

        }

    }
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Clients clientForm = new Clients();
        clientForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked
    private void clearTable() {
        while (defaultModel.getRowCount() > 0) {
            defaultModel.removeRow(0);
        }

    }
    private void jLabel14mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14mouseClicked
        Products productForm = new Products();
        productForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14mouseClicked

    private void JlClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlClientMouseClicked
        Clients clientForm = new Clients();
        clientForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JlClientMouseClicked

    private void JlProductmouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlProductmouseClicked
        Products productsForm = new Products();
        productsForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JlProductmouseClicked

    private void JbtnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDetailsActionPerformed
        if (JtSales.getSelectedRow() != -1) {
            int id_sale = Integer.parseInt(defaultModel.getValueAt(JtSales.getSelectedRow(), 0).toString());
            AnalyticalReport report = new AnalyticalReport(id_sale);
            report.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_JbtnDetailsActionPerformed

    private void JbnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbnSearchActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        lsSales.clear();
        lsSales = _saleDao.getSales(JdInicio.getDate(), JdEnd.getDate());
        populateTable();
    }//GEN-LAST:event_JbnSearchActionPerformed

    private void JlSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlSalesMouseClicked
        Sales vendaForm = new Sales();
        vendaForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JlSalesMouseClicked
    private void configureTable() {
        defaultModel.addColumn("Id_venda");
        defaultModel.addColumn("data_venda");
        defaultModel.addColumn("valor_venda");
        defaultModel.addColumn("Cpf_cliente");
        JtSales.setModel(defaultModel);
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
            java.util.logging.Logger.getLogger(SyntheticReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SyntheticReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SyntheticReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SyntheticReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SyntheticReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbnSearch;
    private javax.swing.JButton JbtnDetails;
    private com.toedter.calendar.JDateChooser JdEnd;
    private com.toedter.calendar.JDateChooser JdInicio;
    private javax.swing.JLabel JlClient;
    private javax.swing.JLabel JlProduct;
    private javax.swing.JLabel JlSales;
    private javax.swing.JTable JtSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
