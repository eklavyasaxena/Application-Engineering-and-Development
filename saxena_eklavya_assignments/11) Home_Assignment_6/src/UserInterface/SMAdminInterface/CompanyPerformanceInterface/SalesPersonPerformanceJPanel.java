/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SMAdminInterface.CompanyPerformanceInterface;

import Business.PersonPackage.Person;
import Business.PersonPackage.SalesPerson;
import Business.Sales.Order;
import Business.Sales.OrderCatalog;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eklav
 */
public class SalesPersonPerformanceJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    OrderCatalog orderCatalog;
    ArrayList<SalesPerson> salesPersonList;
    ArrayList<SalesPerson> top10SalesPersonList;
    ArrayList<SalesPerson> consistentSalesPersonList;
    ArrayList<SalesPerson> poorSalesPersonList;
    ArrayList<Person> personList;
    SalesPerson salesPerson;
    DecimalFormat dF;
    
    
    
    /**
     * Creates new form TopTenSalesPersonJPanel
     */
    public SalesPersonPerformanceJPanel(JPanel userProcessContainer, OrderCatalog orderCatalog, SalesPerson salesPerson) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orderCatalog = orderCatalog;
        this.salesPersonList = new ArrayList<>();
        this.personList = new ArrayList<>();
        this.salesPerson = salesPerson;
        this.dF = new DecimalFormat("#0.00");
        
        generateUniqueSalesPerson();
        calculateSalesPersonMetrics();
        populateTable();
    }

    public void generateUniqueSalesPerson(){
        for(Order order : orderCatalog.getOrderList()){
            System.out.println("checking Orders"+order);
            Person person = order.getPerson();
            if(!(personList.contains(person))){
                personList.add(person);
            }
        }
        
        for(Person person : personList){
            System.out.println("checking person added "+person+" "+person.getFirstName());
            SalesPerson salesPerson = new SalesPerson();
            salesPerson.setPerson(person);
            
            salesPersonList.add(salesPerson);
        }
    }
    
    public void calculateSalesPersonMetrics(){
        for(SalesPerson salesPerson : salesPersonList){
            double totalRevenueBySalesPerson = 0;
            double totalTargetForSalesPerson = 0;
            double totalCostPriceForSalesPerson = 0;
            int totalOrdersBooked = 0;
            int totalAboveTarget = 0;
            int totalBelowTarget = 0;
            for(Order order : orderCatalog.getOrderList()){
                if(order.getPerson().getPersonID()==salesPerson.getPerson().getPersonID()){
                    totalRevenueBySalesPerson += order.getTotalSellingPrice();
                    totalTargetForSalesPerson += order.getTotalTargetPrice();
                    totalCostPriceForSalesPerson += order.getTotalCostPrice();
                    totalOrdersBooked++;
                    if(order.getTotalSellingPrice()>order.getTotalTargetPrice()){
                        totalAboveTarget++;
                    }
                    else{
                        totalBelowTarget++;
                    }
                }
            }
            salesPerson.setTotalAboveTarget(totalAboveTarget);
            salesPerson.setTotalBelowTarget(totalBelowTarget);
            salesPerson.setTotalCostPriceForSalesPerson(totalCostPriceForSalesPerson);
            salesPerson.setTotalOrdersBooked(totalOrdersBooked);
            salesPerson.setTotalRevenueBySalesPerson(totalRevenueBySalesPerson);
            salesPerson.setTotalTargetForSalesPerson(totalTargetForSalesPerson);   
        }
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblSalesPersonMetrics.getModel();
        dtm.setRowCount(0);
        
        try{
            double totalRevenue = 0;
            for(SalesPerson salesPerson : salesPersonList){
                Object[] row = new Object[9];
                row[0] = salesPerson.getPerson().getPersonID();
                row[1] = salesPerson.getPerson().getFirstName()+" "+salesPerson.getPerson().getLastName();
                row[2] = salesPerson.getTotalOrdersBooked();
                row[3] = salesPerson.getTotalAboveTarget();
                row[4] = salesPerson.getTotalBelowTarget();
                row[5] = salesPerson.getTotalCostPriceForSalesPerson();
                row[6] = salesPerson.getTotalTargetForSalesPerson();
                row[7] = salesPerson.getTotalRevenueBySalesPerson();
                row[8] = salesPerson.getTotalRevenueBySalesPerson() - salesPerson.getTotalCostPriceForSalesPerson();

                dtm.addRow(row);

                totalRevenue += salesPerson.getTotalRevenueBySalesPerson();
            }
            txtTotalRevenue.setText(dF.format(totalRevenue));
            
        }
        catch(Exception e){   
        }
    }
    
    public void refreshTable(ArrayList<SalesPerson> refreshSalesPersonList){
        DefaultTableModel dtm = (DefaultTableModel)tblSalesPersonMetrics.getModel();
        dtm.setRowCount(0);
        
        try{
            double totalRevenue = 0;
            for(SalesPerson salesPerson : refreshSalesPersonList){
                Object[] row = new Object[9];
                row[0] = salesPerson.getPerson().getPersonID();
                row[1] = salesPerson.getPerson().getFirstName()+" "+salesPerson.getPerson().getLastName();
                row[2] = salesPerson.getTotalOrdersBooked();
                row[3] = salesPerson.getTotalAboveTarget();
                row[4] = salesPerson.getTotalBelowTarget();
                row[5] = salesPerson.getTotalCostPriceForSalesPerson();
                row[6] = salesPerson.getTotalTargetForSalesPerson();
                row[7] = salesPerson.getTotalRevenueBySalesPerson();
                row[8] = salesPerson.getTotalRevenueBySalesPerson() - salesPerson.getTotalCostPriceForSalesPerson();

                dtm.addRow(row);

                totalRevenue += salesPerson.getTotalRevenueBySalesPerson();
            }
            txtTotalRevenue.setText(dF.format(totalRevenue));
            
        }
        catch(Exception e){   
        }
    }
    
    public void bubbleSortByTotalRevenue(ArrayList<SalesPerson> salesPersonList){
        ArrayList top10SalesPersonList = new ArrayList<>();
        int n = salesPersonList.size();
        System.out.println("element at zeroth pos "+salesPersonList.get(n-1));
        System.out.println("element at last pos "+salesPersonList.get(0));
        
        SalesPerson salesPerson = new SalesPerson();
        
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                SalesPerson salesPerson1 = salesPersonList.get(j);
                SalesPerson salesPerson2 = salesPersonList.get(j-1);
                
                if(salesPerson2.getTotalRevenueBySalesPerson()>salesPerson1.getTotalRevenueBySalesPerson()){
                    
                    salesPerson = salesPerson2;
                    
                    salesPersonList.set(j-1, salesPerson1);
                    salesPersonList.set(j, salesPerson);                  
                    
                }
            }
        }
        
        
        for(int i=(n-1); i > (n-11) ; i--){
             SalesPerson salesPersonFilter = salesPersonList.get(i);
             top10SalesPersonList.add(salesPersonFilter);
        }
        refreshTable(top10SalesPersonList);
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
        btnBack = new javax.swing.JButton();
        btnTopTenSalesPerson = new javax.swing.JButton();
        btnSalesConsistentTarget = new javax.swing.JButton();
        btnSalesBelowTotal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesPersonMetrics = new javax.swing.JTable();
        txtTotalRevenue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        lblManageProducts.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblManageProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageProducts.setText("Sales Person Performance Review");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnTopTenSalesPerson.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTopTenSalesPerson.setText("Top Ten Sales Person");
        btnTopTenSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopTenSalesPersonActionPerformed(evt);
            }
        });

        btnSalesConsistentTarget.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalesConsistentTarget.setText("Sales Person with Consistent Above Target");
        btnSalesConsistentTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesConsistentTargetActionPerformed(evt);
            }
        });

        btnSalesBelowTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalesBelowTotal.setText("Sales Person with Below Total Order Target");
        btnSalesBelowTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesBelowTotalActionPerformed(evt);
            }
        });

        tblSalesPersonMetrics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PersonID", "Name", "Count Orders Booked", "Count Above Target", "Count Below Target", "Cost to Company", "Target Given", "Revenue Generated", "Profit/Loss"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSalesPersonMetrics);
        if (tblSalesPersonMetrics.getColumnModel().getColumnCount() > 0) {
            tblSalesPersonMetrics.getColumnModel().getColumn(0).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(1).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(2).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(3).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(4).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(5).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(6).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(7).setResizable(false);
            tblSalesPersonMetrics.getColumnModel().getColumn(8).setResizable(false);
        }

        txtTotalRevenue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalRevenue.setForeground(new java.awt.Color(255, 0, 0));
        txtTotalRevenue.setDisabledTextColor(new java.awt.Color(204, 0, 51));
        txtTotalRevenue.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Total Revenue");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalesBelowTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalesConsistentTarget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTopTenSalesPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                    .addComponent(lblManageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTopTenSalesPerson)
                .addGap(18, 18, 18)
                .addComponent(btnSalesConsistentTarget)
                .addGap(18, 18, 18)
                .addComponent(btnSalesBelowTotal)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTopTenSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopTenSalesPersonActionPerformed
        // TODO add your handling code here:
        bubbleSortByTotalRevenue(salesPersonList);
    }//GEN-LAST:event_btnTopTenSalesPersonActionPerformed

    private void btnSalesConsistentTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesConsistentTargetActionPerformed
        // TODO add your handling code here:
        ArrayList consistentSalesPersonList = new ArrayList<>();
        for(SalesPerson salesPerson : salesPersonList){
            if((salesPerson.getTotalBelowTarget()==0)){
                consistentSalesPersonList.add(salesPerson);
            }
        }
        refreshTable(consistentSalesPersonList);
    }//GEN-LAST:event_btnSalesConsistentTargetActionPerformed

    private void btnSalesBelowTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesBelowTotalActionPerformed
        // TODO add your handling code here:
        ArrayList poorSalesPersonList = new ArrayList<>();
        for(SalesPerson salesPerson : salesPersonList){
            if((salesPerson.getTotalRevenueBySalesPerson()<salesPerson.getTotalTargetForSalesPerson())){
                poorSalesPersonList.add(salesPerson);
            }
        }
        refreshTable(poorSalesPersonList);
    }//GEN-LAST:event_btnSalesBelowTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSalesBelowTotal;
    private javax.swing.JButton btnSalesConsistentTarget;
    private javax.swing.JButton btnTopTenSalesPerson;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageProducts;
    private javax.swing.JTable tblSalesPersonMetrics;
    private javax.swing.JTextField txtTotalRevenue;
    // End of variables declaration//GEN-END:variables
}
