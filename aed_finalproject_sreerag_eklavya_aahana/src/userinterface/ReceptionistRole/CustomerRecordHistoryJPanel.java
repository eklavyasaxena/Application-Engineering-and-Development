/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceptionistRole;

import Business.Customer.ChildPortfolio;
import Business.Customer.VaccineAdministered;
import Business.DiseasesDrugs.Vaccination;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Inventory.InventoryItem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Mail;

/**
 *
 * @author eklav
 */
public class CustomerRecordHistoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ReceptionistOrganization receptionistOrganization;
    private Enterprise enterprise;
    private Network network;
    private UserAccount account;
    private ChildPortfolio childPortfolio;
    private Mail mail;
    /**
     * Creates new form NewJPanel
     */
    public CustomerRecordHistoryJPanel(JPanel userProcessContainer, 
                    UserAccount account, Organization organization, 
                    Enterprise enterprise, Network network, EcoSystem business, ChildPortfolio childPortfolio) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.receptionistOrganization = (ReceptionistOrganization)organization;
        this.network = network;
        this.account = account;
        this.childPortfolio = childPortfolio;
        
        mail = new Mail();
        
        populateEnterpriseComboBox();
        populateDoctorComboBox();
        populateChildData();
        populateVaccineScheduleTable();
    }
    
    private void populateEnterpriseComboBox(){
    }
    
    public void populateDoctorComboBox() {
        cmbDoctor.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            System.out.println("Printing Enterprise Org"+organization);
            if(organization.getName().compareTo("Doctor Organization")==0){
                System.out.println("Printing Org"+organization);
                for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                    System.out.println("Print Emp"+employee);
                    cmbDoctor.addItem(employee);
                }
            }
        }
    }
    
    public void populateChildData(){
        txtChildName.setText(childPortfolio.getChildName());
        txtFathersName.setText(childPortfolio.getFather().getName());
        txtMotherName.setText(childPortfolio.getMother().getName());
        
        DateFormat df = new SimpleDateFormat("MMM dd, yyyy");
        txtChildsDOB.setText(String.valueOf(df.format(childPortfolio.getDateOfBirth())));
        
        txtEmailID.setText(childPortfolio.getFather().getUserName());
        
        profileImageLabel.setIcon(childPortfolio.getImage());
    }
    
    public void populateVaccineScheduleTable() {
        DefaultTableModel model = (DefaultTableModel) tblVaccineHistoryCard.getModel();

        model.setRowCount(0);

        for (VaccineAdministered vaccineAdministered : childPortfolio.getVaccineHistoryCard().getVaccineAdministeredList()) {
            System.out.println(vaccineAdministered);
            Object[] row = new Object[6];
            row[0] = vaccineAdministered;
            row[1] = vaccineAdministered.getEnterprise();
            row[2] = vaccineAdministered.getDoctor().getEmployee();
            row[3] = vaccineAdministered.getVaccination();
            
//            Date dateDue = vaccineAdministered.getVaccineDueDate();
//            row[4] = df.format(dateDue);
            
            row[4] = vaccineAdministered.getVaccineDueDate();
            
//            Date dateTaken = vaccineAdministered.getVaccineAdministeredDate();
//            row[5] = df.format(dateTaken);
            
            row[5] = vaccineAdministered.getVaccineAdministeredDate();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtChildName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFathersName = new javax.swing.JTextField();
        txtMotherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtChildsDOB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnPrintReceipt = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        profileImageLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccineHistoryCard = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jxdateVaccineDate = new org.jdesktop.swingx.JXDatePicker();
        cmbDoctor = new javax.swing.JComboBox();
        btnSelectAndAdministerVaccine = new javax.swing.JButton();
        btnDeleteEntry = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(229, 229, 229));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Record - Vaccine Administered Receipt");

        txtChildName.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        txtChildName.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        txtChildName.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Child Name: ");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Father's Name: ");

        txtFathersName.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        txtFathersName.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        txtFathersName.setEnabled(false);

        txtMotherName.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        txtMotherName.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        txtMotherName.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Mother's Name: ");

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Child's DOB:");

        txtChildsDOB.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        txtChildsDOB.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        txtChildsDOB.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vaccine History Card");

        btnPrintReceipt.setBackground(new java.awt.Color(203, 203, 255));
        btnPrintReceipt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPrintReceipt.setText("Print Confirmation");
        btnPrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReceiptActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(255, 138, 138));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogOut.setText("<< Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("EmailID:");

        txtEmailID.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        txtEmailID.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        txtEmailID.setEnabled(false);

        btnUpdate.setBackground(new java.awt.Color(203, 203, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUpdate.setText("Update Child's Credentials >>");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        profileImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileImageLabel.setText("Add an Image");
        profileImageLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        tblVaccineHistoryCard.setBackground(new java.awt.Color(255, 203, 203));
        tblVaccineHistoryCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblVaccineHistoryCard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Administered ID", "Enterprise", "Doctor", "Vaccine", "Date Due", "Date Taken"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVaccineHistoryCard);

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Doctor:");

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Date:");

        jxdateVaccineDate.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        cmbDoctor.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        btnSelectAndAdministerVaccine.setBackground(new java.awt.Color(137, 255, 137));
        btnSelectAndAdministerVaccine.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSelectAndAdministerVaccine.setText("Select & Administer Vaccine");
        btnSelectAndAdministerVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAndAdministerVaccineActionPerformed(evt);
            }
        });

        btnDeleteEntry.setBackground(new java.awt.Color(255, 138, 138));
        btnDeleteEntry.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDeleteEntry.setText("Select & Delete Entry");
        btnDeleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEntryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(profileImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtChildName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtChildsDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jxdateVaccineDate, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnSelectAndAdministerVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnPrintReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profileImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtChildsDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtChildName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(btnUpdate)))
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteEntry))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jxdateVaccineDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectAndAdministerVaccine)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(btnPrintReceipt))
                .addContainerGap(352, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnPrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReceiptActionPerformed
        // TODO add your handling code here:
        
        /*
        Send an Email to the Customer
        */
        String emailID = childPortfolio.getFather().getEmail();
        String childName = childPortfolio.getChildName();
        String userName = childPortfolio.getFather().getUserName();
        
        mail.sendMail(emailID, 
                //Subject
                        "Congratulations: Vaccination Administered for "+childName+" from SEAlert", 
                //Body
                        "Your child has administered a vaccine recently"
                                + "We will assist you to keep track of your baby's vaccinations. "
                                + "Your username is: "+userName+". "
                                + "Thank You for using Our Services. From SEAlert");
                
        
        
    }//GEN-LAST:event_btnPrintReceiptActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        CustomerRecordUpdateJPanel customerRecordUpdateJPanel = new CustomerRecordUpdateJPanel
                (userProcessContainer, account, enterprise, network, business, childPortfolio);
        userProcessContainer.add("customerRecordUpdateJPanel", customerRecordUpdateJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEntryActionPerformed
        // TODO add your handling code here:
        int selectRow=(Integer)tblVaccineHistoryCard.getSelectedRow();
        if (selectRow < 0) {                                                           // if selectedRow <0 means the row is not selected
            JOptionPane.showMessageDialog(null, "please select any row from the first table", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        VaccineAdministered vaccineAdministered = (VaccineAdministered) tblVaccineHistoryCard.getValueAt(selectRow, 0);
//        vaccineAdministered.setDoctor(null);
//        vaccineAdministered.setEnterprise(null);
        vaccineAdministered.setVaccineAdministeredDate(null);
        JOptionPane.showMessageDialog(null, "Unable to Reset Enterprise and Doctor", "WARNING", JOptionPane.WARNING_MESSAGE);

        populateVaccineScheduleTable();
        

    }//GEN-LAST:event_btnDeleteEntryActionPerformed

    private void btnSelectAndAdministerVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAndAdministerVaccineActionPerformed
        int selectRow=(Integer)tblVaccineHistoryCard.getSelectedRow();
        if (selectRow < 0) {
            // if selectedRow <0 means the row is not selected
            JOptionPane.showMessageDialog(null, "please select any row from the first table", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        VaccineAdministered vaccineAdministered = (VaccineAdministered) tblVaccineHistoryCard.getValueAt(selectRow, 0);
        Enterprise enterprise = business.getEnterprise(business.getCurrentUser());
        int f =0;
        for(InventoryItem item : enterprise.getInventoryDirectory().getInventoryDirectory()){
            if(item.getVacination().getName().compareTo(vaccineAdministered.getVaccination().getName())==0){
                if(item.getQuantity()>0){
                    Employee employee = (Employee) cmbDoctor.getSelectedItem();
                    item.setQuantity(item.getQuantity()-1);
                    Date vaccineAdministeredDate = jxdateVaccineDate.getDate();
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if(organization.getName().compareTo("Doctor Organization")==0){

                            for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
                                System.out.println("Checking selected useraccout FOR LOOP"+userAccount);
                                if(userAccount.getEmployee().equals(employee)){
                                    System.out.println("Checking selected employee "+employee);
                                    UserAccount doctorUserAccount = userAccount;
                                    System.out.println("Checking selected useraccout "+userAccount);
                                    vaccineAdministered.setDoctor(doctorUserAccount);
                                    System.out.println("Check "+doctorUserAccount);
                                }
                            }
                        }
                    }

                    vaccineAdministered.setEnterprise(enterprise);
                    vaccineAdministered.setVaccineAdministeredDate(vaccineAdministeredDate);

                    populateVaccineScheduleTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Oops looks like there is no stock of this vaccine, please ask the receptionist to request for a new batch");
                    return;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Oops looks like there is no stock of this vaccine, please ask the receptionist to request for a new batch");
                    return;
            }
        }
        
    }//GEN-LAST:event_btnSelectAndAdministerVaccineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEntry;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPrintReceipt;
    private javax.swing.JButton btnSelectAndAdministerVaccine;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jxdateVaccineDate;
    private javax.swing.JLabel profileImageLabel;
    private javax.swing.JTable tblVaccineHistoryCard;
    private javax.swing.JTextField txtChildName;
    private javax.swing.JTextField txtChildsDOB;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFathersName;
    private javax.swing.JTextField txtMotherName;
    // End of variables declaration//GEN-END:variables
}
