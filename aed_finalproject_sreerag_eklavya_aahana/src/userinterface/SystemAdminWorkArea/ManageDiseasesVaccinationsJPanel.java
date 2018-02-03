/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DiseasesDrugs.Diseases;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.DiseasesDrugs.Vaccination;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sreer
 */
public class ManageDiseasesVaccinationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVaccinationsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Diseases diseases;
    public ManageDiseasesVaccinationsJPanel(JPanel userProcessContainer, EcoSystem system,Diseases diseases) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.diseases = diseases;
        diseaseNamejLabel.setText(diseases.getName());
        populateTable();
        populateRoleComboBox();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) vaccinationjTable.getModel();
        int sno = 1;
        model.setRowCount(0);
        try{
            for (Vaccination vac: diseases.getCuredByVaccinations()) {
                        Object[] row = new Object[3];
                        row[0] = sno++;
                        row[1] = vac;
                        model.addRow(row);
            }
        }
            
        catch(Exception e){
                System.out.println("No data in table");
        }
                
    }
    private void populateRoleComboBox(){
        vaccinationjComboBox.removeAllItems();
        for (Vaccination vac : system.getVaccinationDirectory().getvaccinationDirectory()){
            vaccinationjComboBox.addItem(vac);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccinationjTable = new javax.swing.JTable();
        backjButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        addjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        diseaseNamejLabel = new javax.swing.JLabel();
        vaccinationjComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(229, 229, 229));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Vaccines for a Disease");

        vaccinationjTable.setBackground(new java.awt.Color(255, 203, 203));
        vaccinationjTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccinationjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No.", "Vaccine Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccinationjTable);

        backjButton.setBackground(new java.awt.Color(203, 203, 255));
        backjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        deletejButton.setBackground(new java.awt.Color(255, 138, 138));
        deletejButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deletejButton.setText("Select & Unassign Vaccine");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        addjButton.setBackground(new java.awt.Color(137, 255, 137));
        addjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addjButton.setText("Assign Vaccine");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Disease Name:");

        diseaseNamejLabel.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        diseaseNamejLabel.setForeground(new java.awt.Color(255, 0, 0));

        vaccinationjComboBox.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        vaccinationjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinationjComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton)
                            .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vaccinationjComboBox, 0, 210, Short.MAX_VALUE)
                                .addGap(273, 273, 273)
                                .addComponent(deletejButton))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(diseaseNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(119, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diseaseNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccinationjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletejButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(backjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
        Vaccination vac =(Vaccination) vaccinationjComboBox.getSelectedItem();
        if (vac==null) {                                                           // if selectedRow <0 means the row is not selected
            JOptionPane.showMessageDialog(null, "please Insert name into Name Field", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       
        
        diseases.addVaccination(vac);
        populateTable();
    }//GEN-LAST:event_addjButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        int selectRow=(Integer)vaccinationjTable.getSelectedRow();
        if (selectRow < 0) {                                                           // if selectedRow <0 means the row is not selected
            JOptionPane.showMessageDialog(null, "please select any row from the first table", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Vaccination v = (Vaccination) vaccinationjTable.getValueAt(selectRow, 1);
        diseases.deleteVaccination(v);
        populateTable();
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel sysAdminwjp = (UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void vaccinationjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccinationjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccinationjComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JLabel diseaseNamejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox vaccinationjComboBox;
    private javax.swing.JTable vaccinationjTable;
    // End of variables declaration//GEN-END:variables
}
