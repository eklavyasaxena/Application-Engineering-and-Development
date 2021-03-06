/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SMAdminInterface.CompanyPerformanceInterface;

import Business.Sales.Order;
import Business.Sales.OrderCatalog;
import Business.Sales.OrderItem;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author eklav
 */
public class TotalRevenueGeneratedJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    OrderCatalog orderCatalog;
    DecimalFormat dF;

    /**
     * Creates new form PlacedOrderJPanel
     */
    public TotalRevenueGeneratedJPanel(JPanel userProcessContainer, OrderCatalog orderCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orderCatalog = orderCatalog;
        
        this.dF = new DecimalFormat("#0.00");
        
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblOrderList.getModel();
        dtm.setRowCount(0);
        
        try{
            double totalRevenue = 0;
            double rewardsEarned = 0;
            int countAboveTarget = 0;
            int countBelowTarget = 0;
            for(Order order : orderCatalog.getOrderList()){
                Object[] row = new Object[8];
                row[0] = order;
                row[1] = order.getCustomer().getCustomerName();
                row[2] = order.getMarket().getMarketType();
                row[3] = order.getPerson().getFirstName()+" "+order.getPerson().getLastName();
                row[4] = order.getRewardsEarned();
                row[5] = order.getTotalCostPrice();
                row[6] = order.getTotalSellingPrice();
                row[7] = order.getTotalSellingPrice() - order.getTotalCostPrice();

                dtm.addRow(row);

                totalRevenue += order.getTotalSellingPrice();
                rewardsEarned += order.getRewardsEarned();

                if(order.getTotalSellingPrice()>=order.getTotalTargetPrice()){
                    countAboveTarget++;
                }
                else{
                    countBelowTarget++;
                }
            }
            txtTotalRevenue.setText(String.valueOf(totalRevenue));
            txtRewardsEarned.setText(dF.format(rewardsEarned));
            txtCountAboveTarget.setText(String.valueOf(countAboveTarget));
            txtCountBelowTarget.setText(String.valueOf(countBelowTarget));
            
        }catch(Exception e){
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageProducts = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderItemList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtTotalRevenue = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRewardsEarned = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblOrderLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGrandTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCountBelowTarget = new javax.swing.JTextField();
        txtCountAboveTarget = new javax.swing.JTextField();
        btnDisplayOrderItem1 = new javax.swing.JButton();

        lblManageProducts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManageProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageProducts.setText("Company's Revenue Totals");

        tblOrderItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderItemID", "Item Name", "Quantity", "Unit Price", "Total Sales Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderItemList);
        if (tblOrderItemList.getColumnModel().getColumnCount() > 0) {
            tblOrderItemList.getColumnModel().getColumn(0).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(1).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(2).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(3).setResizable(false);
            tblOrderItemList.getColumnModel().getColumn(4).setResizable(false);
        }

        tblOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Customer", "Market Type", "Sold By", "Rewards", "Cost Price", "Selling Price", "Profit/Loss"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderList);
        if (tblOrderList.getColumnModel().getColumnCount() > 0) {
            tblOrderList.getColumnModel().getColumn(0).setResizable(false);
            tblOrderList.getColumnModel().getColumn(1).setResizable(false);
            tblOrderList.getColumnModel().getColumn(2).setResizable(false);
            tblOrderList.getColumnModel().getColumn(3).setResizable(false);
            tblOrderList.getColumnModel().getColumn(4).setResizable(false);
            tblOrderList.getColumnModel().getColumn(5).setResizable(false);
            tblOrderList.getColumnModel().getColumn(6).setResizable(false);
            tblOrderList.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Total Revenue");

        txtTotalRevenue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalRevenue.setForeground(new java.awt.Color(255, 0, 0));
        txtTotalRevenue.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtTotalRevenue.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Order Count Below Target");

        txtRewardsEarned.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtRewardsEarned.setForeground(new java.awt.Color(255, 0, 0));
        txtRewardsEarned.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtRewardsEarned.setEnabled(false);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrderLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Order Total:");

        txtGrandTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtGrandTotal.setForeground(new java.awt.Color(255, 0, 0));
        txtGrandTotal.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtGrandTotal.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Order Count Above Target");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Sales Rewards Earned");

        txtCountBelowTarget.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCountBelowTarget.setForeground(new java.awt.Color(255, 0, 0));
        txtCountBelowTarget.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtCountBelowTarget.setEnabled(false);

        txtCountAboveTarget.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCountAboveTarget.setForeground(new java.awt.Color(255, 0, 0));
        txtCountAboveTarget.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtCountAboveTarget.setEnabled(false);

        btnDisplayOrderItem1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDisplayOrderItem1.setText("Display Order Details");
        btnDisplayOrderItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayOrderItem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCountBelowTarget, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(txtCountAboveTarget)
                                            .addComponent(txtRewardsEarned))
                                        .addGap(187, 187, 187)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnDisplayOrderItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lblOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(154, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(68, 68, 68)
                                .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblManageProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCountBelowTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountAboveTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRewardsEarned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplayOrderItem1))
                .addGap(30, 30, 30)
                .addComponent(lblOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
                 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDisplayOrderItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayOrderItem1ActionPerformed
        // TODO add your handling code here:        
        int selectedRow = tblOrderList.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row from the TABLE to View Details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order = (Order)tblOrderList.getValueAt(selectedRow, 0);
            
            DefaultTableModel dtm = (DefaultTableModel)tblOrderItemList.getModel();
            dtm.setRowCount(0);
            
            for(OrderItem orderItem : order.getOrderItemList()){

                Object[] row = new Object[5];
                row[0] = orderItem;
                row[1] = orderItem.getProduct().getProdName();
                row[2] = orderItem.getQuantity();
                row[3] = orderItem.getSellingPrice();
                row[4] = orderItem.getQuantity()*orderItem.getSellingPrice();

                dtm.addRow(row);
            }
            txtGrandTotal.setText(dF.format(order.getTotalSellingPrice()));
            
            lblOrderLabel.setText("OrderNumber: "+order.getOrderNumber()+"                       Customer: "+order.getCustomer().getCustomerName());
        }
    }//GEN-LAST:event_btnDisplayOrderItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDisplayOrderItem1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageProducts;
    private javax.swing.JLabel lblOrderLabel;
    private javax.swing.JTable tblOrderItemList;
    private javax.swing.JTable tblOrderList;
    private javax.swing.JTextField txtCountAboveTarget;
    private javax.swing.JTextField txtCountBelowTarget;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JTextField txtRewardsEarned;
    private javax.swing.JTextField txtTotalRevenue;
    // End of variables declaration//GEN-END:variables
}
