/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPersonInterface;

import Business.Market.Customer;
import Business.MarketOffers.MarketOffer;
import Business.MarketOffers.MarketOfferCatalog;
import Business.Sales.Order;
import Business.Sales.OrderCatalog;
import Business.Sales.OrderItem;
import Business.SupplierPackage.SupplierDirectory;
import Business.UserAccountPackage.UserAccount;
import UserInterface.SalesPersonInterface.BookNewOrderInterface.BookOrderJPanel;
import UserInterface.SalesPersonInterface.BookNewOrderInterface.SalesPersonPerformanceReviewJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class SalesPersonWorkAreaJPanel extends javax.swing.JPanel {

    UserAccount userAccount;
    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    MarketOfferCatalog marketOfferCatalog;
    OrderCatalog orderCatalog;
    ArrayList<Order> salesPersonBookedOrder;
    /**
     * Creates new form SalesPersonWorkAreaJPanel
     */
    public SalesPersonWorkAreaJPanel(UserAccount userAccount, JPanel userProcessContainer, 
            SupplierDirectory supplierDirectory, MarketOfferCatalog marketOfferCatalog, OrderCatalog orderCatalog) {
        initComponents();
        
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.marketOfferCatalog = marketOfferCatalog;
        this.orderCatalog = orderCatalog;
        this.salesPersonBookedOrder = new ArrayList<>();
        
        txtSalesPersonID.setText(String.valueOf(userAccount.getUserID()));
        txtSalesPersonName.setText(userAccount.getPerson().getFirstName()+" "+userAccount.getPerson().getLastName());
        
        populateComboBox();
    }
    
    public void populateComboBox(){
        cmbCustomer.removeAllItems();
        
        for(MarketOffer marketOffer : marketOfferCatalog.getMarketOfferList()){
            for(Customer customer : marketOffer.getMarket().getCustomerDirectory()){
                String s = customer.getCustomerName();
                cmbCustomer.addItem(s);
            }
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

        lblWelcome = new javax.swing.JLabel();
        lblSalesPersonID = new javax.swing.JLabel();
        lblSalesPersonName = new javax.swing.JLabel();
        txtSalesPersonID = new javax.swing.JTextField();
        txtSalesPersonName = new javax.swing.JTextField();
        btnLogOut = new javax.swing.JButton();
        lblSalesPersonWorkArea = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        btnBookNewOrder = new javax.swing.JButton();
        lblFor = new javax.swing.JLabel();
        cmbCustomer = new javax.swing.JComboBox<>();
        btnViewOrderPlaced = new javax.swing.JButton();

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("      Welcome to Erox Sales");

        lblSalesPersonID.setText("Sales Person User ID:");

        lblSalesPersonName.setText("Sales Person Name:");

        txtSalesPersonID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSalesPersonID.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtSalesPersonID.setEnabled(false);

        txtSalesPersonName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSalesPersonName.setDisabledTextColor(new java.awt.Color(0, 0, 149));
        txtSalesPersonName.setEnabled(false);

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblSalesPersonWorkArea.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblSalesPersonWorkArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesPersonWorkArea.setText("Sales Person Work Area");

        btnBookNewOrder.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBookNewOrder.setText("Booking New Order >>");
        btnBookNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNewOrderActionPerformed(evt);
            }
        });

        lblFor.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblFor.setText("IS");

        cmbCustomer.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        btnViewOrderPlaced.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnViewOrderPlaced.setText("Review Performance >>");
        btnViewOrderPlaced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderPlacedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogOut))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSalesPersonWorkArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblSalesPersonID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSalesPersonName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSalesPersonID)
                                .addComponent(txtSalesPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(174, 174, 174))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(lblFor)
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnViewOrderPlaced, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBookNewOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(lblWelcome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalesPersonID)
                    .addComponent(txtSalesPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalesPersonName)
                    .addComponent(txtSalesPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSalesPersonWorkArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookNewOrder)
                    .addComponent(lblFor)
                    .addComponent(cmbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnViewOrderPlaced)
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBookNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNewOrderActionPerformed
        // TODO add your handling code here:
        String s = (String)cmbCustomer.getSelectedItem();
        System.out.println(s);
        for(MarketOffer marketOffer : marketOfferCatalog.getMarketOfferList()){
            for(Customer customer : marketOffer.getMarket().getCustomerDirectory()){
                if(customer.getCustomerName().compareTo(s)==0){
                    BookOrderJPanel panel = new BookOrderJPanel(userProcessContainer, marketOffer, orderCatalog, 
                            supplierDirectory, userAccount, customer);
                    userProcessContainer.add("BookOrderJPanel", panel);
                    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    System.out.println("Passing");
                }
            }
        }
    }//GEN-LAST:event_btnBookNewOrderActionPerformed

    private void btnViewOrderPlacedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderPlacedActionPerformed
        // TODO add your handling code here:
        
        for(Order order : orderCatalog.getOrderList()){
            if(order.getPerson().getPersonID()==userAccount.getPerson().getPersonID()){
                salesPersonBookedOrder.add(order);
            }
        }
        SalesPersonPerformanceReviewJPanel panel = new SalesPersonPerformanceReviewJPanel(userProcessContainer, salesPersonBookedOrder, 
                supplierDirectory, userAccount, orderCatalog);
        userProcessContainer.add("BookedOrderJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        System.out.println("Passing");
    }//GEN-LAST:event_btnViewOrderPlacedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookNewOrder;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnViewOrderPlaced;
    private javax.swing.JComboBox<String> cmbCustomer;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblFor;
    private javax.swing.JLabel lblSalesPersonID;
    private javax.swing.JLabel lblSalesPersonName;
    private javax.swing.JLabel lblSalesPersonWorkArea;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtSalesPersonID;
    private javax.swing.JTextField txtSalesPersonName;
    // End of variables declaration//GEN-END:variables
}
