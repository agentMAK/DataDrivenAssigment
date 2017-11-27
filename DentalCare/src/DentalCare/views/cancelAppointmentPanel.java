/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.views;

import java.awt.event.ActionListener;
import DentalCare.model.Appointment;
import DentalCare.model.Patient;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class CancelAppointmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form cancelAppointment
     */
    public CancelAppointmentPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        appointmentComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        patientName = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Appointments");

        appointmentComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                appointmentComboBoxItemStateChanged(evt);
            }
        });
        appointmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel this Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Patient");

        patientName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patientNameItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(563, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(appointmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void appointmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentComboBoxActionPerformed

    private void appointmentComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_appointmentComboBoxItemStateChanged

    }//GEN-LAST:event_appointmentComboBoxItemStateChanged

    private void patientNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patientNameItemStateChanged
        
        int currentSelectedPatient = appointmentComboBox.getSelectedIndex();
        if(currentSelectedPatient<0)
            currentSelectedPatient = 0;
        
        if (evt.getStateChange() == ItemEvent.SELECTED)
            updateAppointments(currentPatients[currentSelectedPatient].getAllAppointments());
    }//GEN-LAST:event_patientNameItemStateChanged
    
    private Appointment[] currentAppointments;
    private Patient[] currentPatients;
    
    public void updatePatientNames(Patient[] patients) {
        currentPatients = patients;
        
        for (Patient p: currentPatients) {
            patientName.addItem(p.getForename()+" "+p.getSurname());
        }
                //updateAppointments(currentPatients[0].getAllAppointments());

    }
    
    public void updateAppointments(Appointment[] appointments){
        currentAppointments = appointments;
        try {
            for (Appointment app: currentAppointments) {
                if(!app.hasPassed())
                    appointmentComboBox.addItem(app.getStartTime().toString());
            }
        }catch(NullPointerException el) {
            JOptionPane.showMessageDialog(null, "No appointment found for current patient","Search", JOptionPane.ERROR_MESSAGE);
        }
        this.revalidate();
        this.repaint();
    }
    
    //Add item changed that links to updateAppointments
    
    
    public void clearAll() {
        patientName.removeAllItems();
        appointmentComboBox.removeAllItems();
    }
    
    public void addCancelListener(ActionListener c) {
        appointmentComboBox.addActionListener(c);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> appointmentComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> patientName;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the appointmentComboBox
     */
    public Appointment getAppointmentComboBox() {
        return currentAppointments[appointmentComboBox.getSelectedIndex()];
    }

    /**
     * @return the patientName
     */
    public Patient getPatientName() {
        return currentPatients[patientName.getSelectedIndex()];
    }
}
