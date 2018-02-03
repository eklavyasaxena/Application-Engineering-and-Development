/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceptionistRole;

import Business.Customer.ChildPortfolio;
import Business.Customer.Person;
import Business.Customer.VaccineAdministered;
import Business.DiseasesDrugs.Vaccination;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Mail;

/**
 *
 * @author eklav
 */
public class CustomerRecordEntryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ReceptionistOrganization receptionistOrganization;
    private Enterprise enterprise;
    private Network network;
    private UserAccount account;
    private ArrayList<Vaccination> leftOverVaccineList;
    
    private ArrayList<VaccineAdministered> vaccineScheduledAtBirthList;
    
    private BufferedImage tempImage;
    private ChildPortfolio childPortfolio;
    
    private DateFormat df;
    
    private Mail mail;
    /**
     * Creates new form CustomerRecordEntryJPanel
     */
    public CustomerRecordEntryJPanel(JPanel userProcessContainer, 
            UserAccount account, Organization organization, 
            Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.receptionistOrganization = (ReceptionistOrganization)organization;
        this.network = network;
        this.account = account;
        
        vaccineScheduledAtBirthList = new ArrayList<>();
        leftOverVaccineList = new ArrayList<>();
        this.childPortfolio = new ChildPortfolio();
        
        df = new SimpleDateFormat("MMM dd, yyyy");
        
        mail = new Mail();
        
//        createLeftOverVaccineList();
//        populateVaccineComboBox();
//        populateDoctorComboBox();
//        populateEnterpriseComboBox();
        
        try{
            populateVaccineScheduleTable();
        }catch(Exception e){
            System.out.println("No Data");
        }
    }
//    
//    private void createLeftOverVaccineList(){
//        for (Vaccination vac : business.getVaccinationDirectory().getvaccinationDirectory()){
//            leftOverVaccineList.add(vac);
//        }
//    }
    
//    private void populateVaccineComboBox(){
//        cmbVaccine.removeAllItems();
//        for (Vaccination vac : leftOverVaccineList){
//            cmbVaccine.addItem(vac);
//        }
//    }
    
//    public void populateDoctorComboBox() {
//        cmbDoctor.removeAllItems();
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            System.out.println("Printing Enterprise Org"+organization);
//            if(organization.getName().compareTo("Doctor Organization")==0){
//                System.out.println("Printing Org"+organization);
//                for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
//                    System.out.println("Print Emp"+employee);
//                    cmbDoctor.addItem(employee);
//                }
//            }
//        }
//    }
    
//    private void populateEnterpriseComboBox(){
//        cmbEnterprise.removeAllItems();
//            cmbEnterprise.addItem(enterprise);
//    }
    
//    To Populate the Table with Vaccine Schedule Generated
    public void populateVaccineScheduleTable() {
        DefaultTableModel model = (DefaultTableModel) tblVaccineHistoryCard.getModel();

        model.setRowCount(0);

        for (VaccineAdministered vaccineAdministered : vaccineScheduledAtBirthList) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccineHistoryCard = new javax.swing.JTable();
        txtChildName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFathersName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jxdateChildDOB = new org.jdesktop.swingx.JXDatePicker();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        profileImageLabel = new javax.swing.JLabel();
        attachPictureJButton = new javax.swing.JButton();
        btnAddChildAndPopulateSchedule = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 229, 229));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Record - Data Entry Receipt");

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Child's DOB:");

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
        if (tblVaccineHistoryCard.getColumnModel().getColumnCount() > 0) {
            tblVaccineHistoryCard.getColumnModel().getColumn(0).setResizable(false);
            tblVaccineHistoryCard.getColumnModel().getColumn(1).setResizable(false);
            tblVaccineHistoryCard.getColumnModel().getColumn(2).setResizable(false);
            tblVaccineHistoryCard.getColumnModel().getColumn(3).setResizable(false);
            tblVaccineHistoryCard.getColumnModel().getColumn(4).setResizable(false);
        }

        txtChildName.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Username:");

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Child Name: ");

        txtUsername.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Father's Name: ");

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vaccine History Card");

        txtFathersName.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Password:");

        txtMotherName.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Mother's Name: ");

        jxdateChildDOB.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        btnBack.setBackground(new java.awt.Color(203, 203, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        btnSave.setBackground(new java.awt.Color(203, 203, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSave.setText("<< Save & Print Receipt >>");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("EmailID:");

        txtEmailID.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        profileImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileImageLabel.setLabelFor(profileImageLabel);
        profileImageLabel.setText("Add an Image");
        profileImageLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        attachPictureJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        attachPictureJButton.setText("Attach Picture");
        attachPictureJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachPictureJButtonActionPerformed(evt);
            }
        });

        btnAddChildAndPopulateSchedule.setBackground(new java.awt.Color(137, 255, 137));
        btnAddChildAndPopulateSchedule.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddChildAndPopulateSchedule.setText("<< Populate Schedule >>");
        btnAddChildAndPopulateSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChildAndPopulateScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(484, 484, 484)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(attachPictureJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(profileImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtChildName, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(txtMotherName, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(txtFathersName, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(jxdateChildDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAddChildAndPopulateSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2))
                        .addContainerGap(86, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtChildName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(txtFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jxdateChildDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddChildAndPopulateSchedule)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profileImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attachPictureJButton)))
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            // TODO add your handling code here:
            String childName = txtChildName.getText();
            String fatherName = txtFathersName.getText();
            String motherName = txtMotherName.getText();
            Date childDOB = jxdateChildDOB.getDate();
            String userName = txtUsername.getText();
            String password = txtPassword.getText();
            String emailID = txtEmailID.getText();
            
            if((emailID.equals("") || !(emailID.matches("[0-9a-zA-Z@.]+")))||
                (childName.equals("") || !(childName.matches("[a-zA-Z]+")))||
                (fatherName.equals("") || !(fatherName.matches("[a-zA-Z]+")))||
                (motherName.equals("") || !(motherName.matches("[a-zA-Z]+")))||
                (userName.equals("") || !(userName.matches("[a-zA-Z]+")))||
                (password.equals("") || !(password.matches("[a-zA-Z]+")))
                    ){
                
                JOptionPane.showMessageDialog(null,"Invalid Data");
                return;
            }
            else{
                for(ChildPortfolio childPortfolio : business.getChildDirectory().getChildPortfolioList()){
                    String searchUserName = childPortfolio.getFather().getUserName();
                    if(searchUserName.compareTo(userName)==0){
                        JOptionPane.showMessageDialog(null, "User name already Exists");
                        return;
                    }
                }
            }
            
            String hashPassword = business.getUserAccountDirectory().hash_SHA_512_SecurePassword(password, "ALERT");
                

                ChildPortfolio childPortfolio = new ChildPortfolio();

                Person father = new Person();
                father.setName(fatherName);
                father.setUserName(userName);
                father.setPassword(hashPassword);
                father.setEmail(emailID);

                Person mother = new Person();
                mother.setName(motherName);

                childPortfolio.setChildName(childName);
                childPortfolio.setFather(father);
                childPortfolio.setMother(mother);
                childPortfolio.setDateOfBirth(childDOB);
                childPortfolio.setNetwork(network);
                try{
                    childPortfolio.setImage(new ImageIcon(tempImage));
                }
                catch(Exception e){
                    System.out.println("no image");
                }

                for(VaccineAdministered vaccineAdministered : vaccineScheduledAtBirthList){
                    childPortfolio.getVaccineHistoryCard().addVaccineAdministered(vaccineAdministered);
                }



                System.out.println("Checking if NULL "+childPortfolio);

                business.getChildDirectory().createChildPortfolio(childPortfolio);

                JOptionPane.showMessageDialog(null, "Child Data Saved Successfully");

                txtChildName.setText("");
                txtFathersName.setText("");
                txtMotherName.setText("");
                jxdateChildDOB.setDate(null);
                txtUsername.setText("");
                txtPassword.setText("");
                txtEmailID.setText("");

                profileImageLabel.setIcon(null);

    //            jxdateVaccineDate.setDate(null);

                DefaultTableModel model = (DefaultTableModel) tblVaccineHistoryCard.getModel();

                model.setRowCount(0);
                
                
                /*
                Send an Email to the Customer
                */
                mail.sendMail(emailID, 
                //Subject
                        "Congratulations Mr."+fatherName+" & Mrs."+motherName+" from SEAlert", 
                //Body
                        "A beautiful baby has come to fill your lives with joy and bliss. "
                                + "May all the precious little moments always warm your heart. "
                                + "We will assist you to keep track of your baby's vaccinations. "
                                + "Your username is: "+userName+", "
                                + "and your password is: "+password+". "
                                + "Thank You for using Our Services. From SEAlert");
//                
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CustomerRecordEntryJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void attachPictureJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachPictureJButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int value = chooser.showOpenDialog(this);
        if (value == JFileChooser.APPROVE_OPTION) {

            try {

                tempImage = ImageIO.read(chooser.getSelectedFile());
                profileImageLabel.setIcon(new ImageIcon(tempImage));

            } catch (Exception e) {
                System.out.println("Image can't be displayed");

            }
        }
        JOptionPane.showMessageDialog(null, "Image Attached Successfully :)");
    }//GEN-LAST:event_attachPictureJButtonActionPerformed

    private void btnAddChildAndPopulateScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChildAndPopulateScheduleActionPerformed

             Date childDOB = jxdateChildDOB.getDate();
            
            
//            String childName = txtChildName.getText();
//            String fatherName = txtFathersName.getText();
//            String motherName = txtMotherName.getText();
//            String userName = txtUsername.getText();
//            String password = txtPassword.getText();
//            String emailID = txtEmailID.getText();
//            
//            String hashPassword = business.getUserAccountDirectory().hash_SHA_512_SecurePassword(password, "ALERT");             
//            
//            Person father = new Person();
//            father.setName(fatherName);
//            father.setUserName(userName);
//            father.setPassword(hashPassword);
//            father.setEmail(emailID);
//            
//            Person mother = new Person();
//            mother.setName(motherName);
//            
//            childPortfolio.setChildName(childName);
//            childPortfolio.setFather(father);
//            childPortfolio.setMother(mother);
//            childPortfolio.setDateOfBirth(childDOB);
//            childPortfolio.setNetwork(network);
//            try{
//                childPortfolio.setImage(new ImageIcon(tempImage));
//            }
//            catch(Exception e){
//                System.out.println("no image");
//            }
            
            for(Vaccination vac : business.getVaccinationDirectory().getvaccinationDirectory()){
                System.out.println("When entering into the for loop "+vac);
                for(int interval  : vac.getIntervalFromDOB() ){
                    Calendar now = Calendar.getInstance();
                    now.setTime(childDOB);
                    now.add(Calendar.MONTH, interval);
                    
                    VaccineAdministered va = new VaccineAdministered();
                    
                    Date intervalDate = new Date();
                    va.setVaccineDueDate(now.getTime());
                    System.out.println("After adding interval "+vac);
                    va.setVaccination(vac);
                    
                    vaccineScheduledAtBirthList.add(va);
                }
                
                System.out.println("Exited loop");
                
            }
            
            for(VaccineAdministered vaccineAdministered : vaccineScheduledAtBirthList){
                System.out.println("vaccineScheduledAtBirthList Checking after exiting loop "+vaccineAdministered);
            }
            
            populateVaccineScheduleTable();
        
    }//GEN-LAST:event_btnAddChildAndPopulateScheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attachPictureJButton;
    private javax.swing.JButton btnAddChildAndPopulateSchedule;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXDatePicker jxdateChildDOB;
    private javax.swing.JLabel profileImageLabel;
    private javax.swing.JTable tblVaccineHistoryCard;
    private javax.swing.JTextField txtChildName;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFathersName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
