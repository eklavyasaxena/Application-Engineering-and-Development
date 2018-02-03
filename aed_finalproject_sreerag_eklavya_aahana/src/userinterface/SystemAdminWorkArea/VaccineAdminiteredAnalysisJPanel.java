/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.ChildPortfolio;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Customer.VaccineAdministered;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import Business.Mail;
import java.awt.Component;

/**
 *
 * @author eklav
 */
public class VaccineAdminiteredAnalysisJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    private ArrayList<ChildPortfolio> childWithLapseVaccinationList;
    private ArrayList<ChildPortfolio> childOnTimeVaccinationList;
    
    private Mail mail;
    /**
     * Creates new form VaccineAdminiteredAnalysisJPanel
     */
    public VaccineAdminiteredAnalysisJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        childWithLapseVaccinationList = new ArrayList<>();
        childOnTimeVaccinationList = new ArrayList<>();
        
        mail = new Mail();
        
        calculateChildVaccinationLapse();
        calculateChildVaccinationOnTime();
        
    }
    
    public void populateChildWithLapsedVaccines(ArrayList<ChildPortfolio> childPortfolioList){
        DefaultTableModel model = (DefaultTableModel) tblChildData.getModel();

        model.setRowCount(0);

        for (ChildPortfolio childPortfolio : childPortfolioList) {

            Object[] row = new Object[7];
            
            row[0] = childPortfolio.getChildID();
            row[1] = childPortfolio.getChildName();
            row[2] = childPortfolio.getDateOfBirth();
            row[3] = childPortfolio.getFather().getName();
            row[4] = childPortfolio.getMother().getName();
            row[5] = childPortfolio.getFather().getEmail();
            
            System.out.println(childPortfolio.getNetwork());
            row[6] = childPortfolio.getNetwork().getName();
            
            model.addRow(row);
        }
    }
    
    public void calculateChildVaccinationLapse(){
        Date todayDate = new Date();
        for(ChildPortfolio childPortfolio : system.getChildDirectory().getChildPortfolioList()){
            System.out.println("Entry in for1111  "+childPortfolio.getChildName());           
            for(VaccineAdministered vaccineAdministered : childPortfolio.getVaccineHistoryCard().getVaccineAdministeredList()){
                System.out.println("Entry in for222  "+childPortfolio.getChildName());
                if(todayDate.compareTo(vaccineAdministered.getVaccineDueDate())>0){
                    System.out.println("Entry in for333  "+childPortfolio.getChildName());
                    System.out.println(vaccineAdministered.getVaccination().getName());
                    System.out.println(vaccineAdministered.getVaccineAdministeredDate());
                    if(vaccineAdministered.getVaccineAdministeredDate()==null){
                        childWithLapseVaccinationList.add(childPortfolio);
                        System.out.println("Print the entry "+childPortfolio.getChildName());
                        break;
                    }
                }
            }
        }
    }
    
    public void calculateChildVaccinationOnTime(){
        Date todayDate = new Date();
        int i = 0;
        for(ChildPortfolio childPortfolio : system.getChildDirectory().getChildPortfolioList()){
            for(VaccineAdministered vaccineAdministered : childPortfolio.getVaccineHistoryCard().getVaccineAdministeredList()){
                if(todayDate.compareTo(vaccineAdministered.getVaccineDueDate())>0){
                    if(vaccineAdministered.getVaccineAdministeredDate()==null){
                        i++;
                    }
                }
            }
            if(i==0){
                childOnTimeVaccinationList.add(childPortfolio);
            }
        }
    }
    
    private CategoryDataset createDataset( ) {
      
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       int childOnTime =0;
       int childWithLapse = 0;
       
       
       for(ChildPortfolio childPortfolio : childWithLapseVaccinationList){
           childWithLapse++;
       }
       dataset.addValue(childWithLapse, "Child With Lapsed Vaccinations", "");
       
       for(ChildPortfolio childPortfolio : childOnTimeVaccinationList){
           childOnTime++;
       }
       dataset.addValue(childOnTime, "Child With On Time Vaccinations", "");       

      return dataset; 
   }

    
    public void BarChart_AWT( String applicationTitle , String chartTitle ){
     JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Category",            
         "Count",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
        ChartFrame frame = new ChartFrame(applicationTitle, barChart);
        frame.pack();
        frame.setVisible(true);
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChildData = new javax.swing.JTable();
        btnWithLapsedVaccine = new javax.swing.JButton();
        btnWithOnTimeVaccine = new javax.swing.JButton();
        stockbarjButton = new javax.swing.JButton();
        btnSEAlert = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 229, 229));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vaccine Administered by Customers Analysis");

        backjButton.setBackground(new java.awt.Color(203, 203, 255));
        backjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        tblChildData.setBackground(new java.awt.Color(255, 203, 203));
        tblChildData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblChildData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Child Name", "DOB", "Father's Name", "Mother's Name", "EmailID", "Network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblChildData);

        btnWithLapsedVaccine.setBackground(new java.awt.Color(203, 203, 255));
        btnWithLapsedVaccine.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnWithLapsedVaccine.setText("With Lapsed Vaccination");
        btnWithLapsedVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithLapsedVaccineActionPerformed(evt);
            }
        });

        btnWithOnTimeVaccine.setBackground(new java.awt.Color(203, 203, 255));
        btnWithOnTimeVaccine.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnWithOnTimeVaccine.setText("With On Time Vaccination");
        btnWithOnTimeVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithOnTimeVaccineActionPerformed(evt);
            }
        });

        stockbarjButton.setBackground(new java.awt.Color(203, 203, 255));
        stockbarjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        stockbarjButton.setText("Bar Chart");
        stockbarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockbarjButtonActionPerformed(evt);
            }
        });

        btnSEAlert.setBackground(new java.awt.Color(203, 203, 255));
        btnSEAlert.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSEAlert.setText("Send SEAlert");
        btnSEAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEAlertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSEAlert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnWithLapsedVaccine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWithOnTimeVaccine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stockbarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton)
                    .addComponent(btnWithLapsedVaccine)
                    .addComponent(btnWithOnTimeVaccine)
                    .addComponent(stockbarjButton)
                    .addComponent(btnSEAlert))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel sysAdminwjp = (UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void btnWithLapsedVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithLapsedVaccineActionPerformed
        // TODO add your handling code here:
        populateChildWithLapsedVaccines(childWithLapseVaccinationList);
        
    }//GEN-LAST:event_btnWithLapsedVaccineActionPerformed

    private void btnWithOnTimeVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithOnTimeVaccineActionPerformed
        // TODO add your handling code here:
        populateChildWithLapsedVaccines(childOnTimeVaccinationList);
    }//GEN-LAST:event_btnWithOnTimeVaccineActionPerformed

    private void stockbarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockbarjButtonActionPerformed
        BarChart_AWT( "Vaccine Administered Bar Chart" , "Vaccine Administered Bar Chart" );
    }//GEN-LAST:event_stockbarjButtonActionPerformed

    private void btnSEAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEAlertActionPerformed
        // TODO add your handling code here:
        for(ChildPortfolio childPortfolio : childWithLapseVaccinationList){
            String emailID = childPortfolio.getFather().getEmail();
            
            mail.sendMail(emailID, 
                    "URGENT SEAlert : You Child Vaccination is Due", 
                    "Please note that your child vaccine has lapsed. "
                   + "Contact your nearest doctor for futher support. "
                    + "Thank You for using Our Services. From SEAlert");
            
        }
    }//GEN-LAST:event_btnSEAlertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton btnSEAlert;
    private javax.swing.JButton btnWithLapsedVaccine;
    private javax.swing.JButton btnWithOnTimeVaccine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton stockbarjButton;
    private javax.swing.JTable tblChildData;
    // End of variables declaration//GEN-END:variables
}

