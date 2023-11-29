package com.mycompany.prototipo_pi.Views;

import com.mycompany.prototipo_pi.DAO.SaleDAO;
import com.mycompany.prototipo_pi.Models.Product;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AnalyticalReport extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    SaleDAO _saleDao = new SaleDAO();
    List<Product> lsProducts;

    public AnalyticalReport() {
        initComponents();
    }

    public AnalyticalReport(int id_sale) {
        initComponents();
        configureTable();
        populateTable(id_sale);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JlSale = new javax.swing.JLabel();
        JlClient = new javax.swing.JLabel();
        JlProduct = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        JlSale.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        JlSale.setForeground(new java.awt.Color(255, 255, 255));
        JlSale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlSale.setText("Venda");
        JlSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(JlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(JlClient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JlSale, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JlSale, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JlClient))
                    .addComponent(JlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        JtProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JtProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void JlClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlClientMouseClicked
        Clients clientForm = new Clients();
        clientForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JlClientMouseClicked
    private void populateTable(int id_venda) {
        lsProducts = _saleDao.getSaleProduct(id_venda);
        for (Product product : lsProducts) {
            String nameProduct = product.getNomeProduto();
            String unit_price = String.valueOf(product.getPreco());
            String qtd = String.valueOf(product.getEstoque());
            defaultTableModel.addRow(new String[]{
                nameProduct,
                unit_price,
                qtd

            });
        }

    }

    private void configureTable() {
        defaultTableModel.addColumn("Nome_Produto");
        defaultTableModel.addColumn("Preço_unitário");
        defaultTableModel.addColumn("Quantidade");
        JtProduto.setModel(defaultTableModel);
    }
    private void JlProductmouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlProductmouseClicked
        Products productForm = new Products();
        productForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JlProductmouseClicked

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
            java.util.logging.Logger.getLogger(AnalyticalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalyticalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalyticalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalyticalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalyticalReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlClient;
    private javax.swing.JLabel JlProduct;
    private javax.swing.JLabel JlSale;
    private javax.swing.JTable JtProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
