/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;

/**
 *
 * @author eklav
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalJPanel
     */
    private VitalSignHistory vsh;
    public CreateVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        temperatureJLabel = new javax.swing.JLabel();
        temperatureJTextField = new javax.swing.JTextField();
        bloodPressureJTextField = new javax.swing.JTextField();
        bloodPressureJLabel = new javax.swing.JLabel();
        dateJLabel = new javax.swing.JLabel();
        dateJTextField = new javax.swing.JTextField();
        pulseJLabel = new javax.swing.JLabel();
        pulseJTextField = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        createVitalSignsLabel = new javax.swing.JLabel();

        temperatureJLabel.setText("Temperature:");

        temperatureJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureJTextFieldActionPerformed(evt);
            }
        });

        bloodPressureJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodPressureJTextFieldActionPerformed(evt);
            }
        });

        bloodPressureJLabel.setText("Blood Pressure:");

        dateJLabel.setText("Date (MM/DD/YY):");

        dateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateJTextFieldActionPerformed(evt);
            }
        });

        pulseJLabel.setText("Pulse:");

        pulseJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseJTextFieldActionPerformed(evt);
            }
        });

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        createVitalSignsLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createVitalSignsLabel.setText("Create Vital Signs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createVitalSignsLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(temperatureJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(temperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(pulseJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                            .addComponent(pulseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(bloodPressureJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dateJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(saveJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))))
                .addContainerGap(587, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(createVitalSignsLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureJLabel)
                    .addComponent(temperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureJLabel)
                    .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseJLabel)
                    .addComponent(pulseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJLabel)
                    .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(saveJButton)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void temperatureJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperatureJTextFieldActionPerformed

    private void bloodPressureJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodPressureJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodPressureJTextFieldActionPerformed

    private void dateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateJTextFieldActionPerformed

    private void pulseJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulseJTextFieldActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        double tP = Double.parseDouble(temperatureJTextField.getText());
        double bP = Double.parseDouble(bloodPressureJTextField.getText());
        int pS = Integer.parseInt(pulseJTextField.getText());
        String dT = dateJTextField.getText();
        
        VitalSigns v = vsh.addVitals();
        v.setTemperature(tP);
        v.setBloodPressure(bP);
        v.setPulse(pS);
        v.setDate(dT);
        
        JOptionPane.showMessageDialog(null,"Vital Sign Added Successfully");
        
        temperatureJTextField.setText("");
        bloodPressureJTextField.setText("");
        pulseJTextField.setText("");
        dateJTextField.setText("");
    }//GEN-LAST:event_saveJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodPressureJLabel;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JLabel createVitalSignsLabel;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JTextField dateJTextField;
    private javax.swing.JLabel pulseJLabel;
    private javax.swing.JTextField pulseJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel temperatureJLabel;
    private javax.swing.JTextField temperatureJTextField;
    // End of variables declaration//GEN-END:variables
}
