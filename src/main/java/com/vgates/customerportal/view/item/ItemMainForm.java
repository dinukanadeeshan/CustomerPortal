/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vgates.customerportal.view.item;

/**
 *
 * @author Chamith
 */
public class ItemMainForm extends javax.swing.JPanel {

    /**
     * Creates new form ItemMainForm
     */
    public ItemMainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblItemMain = new javax.swing.JLabel();
        tabItemMain = new javax.swing.JTabbedPane();
        panelNewItem = new javax.swing.JPanel();
        lblNewItemMain = new javax.swing.JLabel();
        lblNewItemName = new javax.swing.JLabel();
        txtNewItemName = new javax.swing.JTextField();
        lblNewItemCategory = new javax.swing.JLabel();
        txtNewCategory = new javax.swing.JTextField();
        lblNewItemDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNewDesc = new javax.swing.JTextArea();
        lblNewCost = new javax.swing.JLabel();
        lblNewDiscount = new javax.swing.JLabel();
        txtNewCost = new javax.swing.JFormattedTextField();
        txtNewDiscount = new javax.swing.JFormattedTextField();
        btnCancelAdd = new javax.swing.JButton();
        btnCancelAdd1 = new javax.swing.JButton();

        lblItemMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItemMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItemMain.setText("Item Details");

        tabItemMain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblNewItemMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewItemMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewItemMain.setText("New Item Details");

        lblNewItemName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewItemName.setText("Item Name");

        txtNewItemName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNewItemName.setEnabled(false);
        txtNewItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewItemNameActionPerformed(evt);
            }
        });

        lblNewItemCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewItemCategory.setText("Item Category");

        txtNewCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNewCategory.setEnabled(false);
        txtNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewCategoryActionPerformed(evt);
            }
        });

        lblNewItemDesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewItemDesc.setText("Description");

        txtNewDesc.setColumns(20);
        txtNewDesc.setRows(5);
        jScrollPane1.setViewportView(txtNewDesc);

        lblNewCost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewCost.setText("Cost");

        lblNewDiscount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNewDiscount.setText("Discount");

        txtNewCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtNewCost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNewDiscount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtNewDiscount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCancelAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelAdd.setText("Cancel");
        btnCancelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAddActionPerformed(evt);
            }
        });

        btnCancelAdd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelAdd1.setText("Save Item");
        btnCancelAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAdd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNewItemLayout = new javax.swing.GroupLayout(panelNewItem);
        panelNewItem.setLayout(panelNewItemLayout);
        panelNewItemLayout.setHorizontalGroup(
            panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewItemMain, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addGroup(panelNewItemLayout.createSequentialGroup()
                        .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNewItemLayout.createSequentialGroup()
                                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNewDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(lblNewCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNewCost, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNewDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelNewItemLayout.createSequentialGroup()
                                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNewItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNewItemCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(lblNewItemDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtNewCategory)
                                    .addComponent(txtNewItemName))))
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNewItemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelNewItemLayout.setVerticalGroup(
            panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewItemMain, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewItemName)
                    .addComponent(txtNewItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewItemCategory)
                    .addComponent(txtNewCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewItemDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewCost)
                    .addComponent(txtNewCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNewItemLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNewDiscount))
                    .addGroup(panelNewItemLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNewDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(panelNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelAdd)
                    .addComponent(btnCancelAdd1))
                .addContainerGap())
        );

        tabItemMain.addTab("New Item Details", panelNewItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblItemMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(tabItemMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblItemMain, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabItemMain))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewItemNameActionPerformed
     
    }//GEN-LAST:event_txtNewItemNameActionPerformed

    private void txtNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewCategoryActionPerformed

    private void btnCancelAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAddActionPerformed
       
    }//GEN-LAST:event_btnCancelAddActionPerformed

    private void btnCancelAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelAdd1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelAdd;
    private javax.swing.JButton btnCancelAdd1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemMain;
    private javax.swing.JLabel lblNewCost;
    private javax.swing.JLabel lblNewDiscount;
    private javax.swing.JLabel lblNewItemCategory;
    private javax.swing.JLabel lblNewItemDesc;
    private javax.swing.JLabel lblNewItemMain;
    private javax.swing.JLabel lblNewItemName;
    private javax.swing.JPanel panelNewItem;
    private javax.swing.JTabbedPane tabItemMain;
    private javax.swing.JTextField txtNewCategory;
    private javax.swing.JFormattedTextField txtNewCost;
    private javax.swing.JTextArea txtNewDesc;
    private javax.swing.JFormattedTextField txtNewDiscount;
    private javax.swing.JTextField txtNewItemName;
    // End of variables declaration//GEN-END:variables
}