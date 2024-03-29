/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.views;

import DentalCare.model.Partner;
import java.time.LocalTime;
import DentalCare.model.Patient;
import DentalCare.model.Treatment;
import DentalCare.model.TreatmentType;
import java.time.LocalDate;

/**
 *
 * @author Martin
 */
public class EditAppointmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form bookAppointment
     */
    public EditAppointmentPanel() {
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

        mainPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        partnerCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treatmentsCombo = new javax.swing.JList<>();
        save = new javax.swing.JButton();
        patientName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        date = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        startTime = new com.github.lgooddatepicker.components.TimePicker();
        endTime = new com.github.lgooddatepicker.components.TimePicker();

        setLayout(new java.awt.BorderLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLabel.setText("Date");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Patient Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Partner");

        partnerCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentist", "Hygienist" }));
        partnerCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partnerComboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Custom End Time");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Treatment");

        treatmentsCombo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hygiene", "Check-up", "Silver amalgam filling", "White composite resin filling", "Gold Crown", "None" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(treatmentsCombo);

        save.setText("Book Appointment");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        patientName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));

        jLabel6.setText("Optionally change the end time that is automatically calculated ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Start Time");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(dateLabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(partnerCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(patientName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(partnerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(save)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void partnerComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partnerComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partnerComboActionPerformed
    
    public void addSaveActionListener(java.awt.event.ActionListener l) {
        save.addActionListener(l);
    }
    
    //Used by controller to update the comboBox of patients
    public void updatePatientNames(Patient[] patients) {
        currentPatients = patients;
        
        for (Patient p: currentPatients) {
            patientName.addItem(p.getForename()+" "+p.getSurname());
        }
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    public void clearPatientName() {
        patientName.removeAllItems();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker date;
    private javax.swing.JLabel dateLabel;
    private com.github.lgooddatepicker.components.TimePicker endTime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> partnerCombo;
    private javax.swing.JComboBox<String> patientName;
    private javax.swing.JButton save;
    private com.github.lgooddatepicker.components.TimePicker startTime;
    private javax.swing.JList<String> treatmentsCombo;
    // End of variables declaration//GEN-END:variables

    //More variables
    private Patient[] currentPatients;
    
    final private Treatment HYGIENE = new Treatment("hygiene",TreatmentType.HYGIENE,45,20);
    final private Treatment CHECKUP = new Treatment("Check - UP",TreatmentType.CHECKUP,45,20);
    final private Treatment SILVERFILLING = new Treatment("Silver amalgam filling",TreatmentType.REPAIR,90,60);
    final private Treatment WHITEFILLING = new Treatment("White composite resin filling",TreatmentType.REPAIR,150,60);
    final private Treatment GOLDCROWN = new Treatment("Gold crown",TreatmentType.COSMETIC,500,60);
    
    final private Treatment[] listOfTreatments = {HYGIENE,CHECKUP,SILVERFILLING,WHITEFILLING,GOLDCROWN};
    /**
     * @return the endTime
     */
    public LocalTime getEndTime() {
        return endTime.getTime();
    }

    /**
     * @return the partner
     */
    public String getPartner() {
        return (String)partnerCombo.getSelectedItem();
    }

    /**
     * @return the patientName
     */
    public Patient getPatient() {
        return currentPatients[patientName.getSelectedIndex() -1];
    }

    /**
     * @return the startTime
     */
    public LocalTime getStartTime() {
        return startTime.getTime();
    }

    /**
     * @return the treatments
     */
    public Treatment[] getTreatments() {
        int[] treatmentIndices = treatmentsCombo.getSelectedIndices();
        Treatment[] treatmentList = new Treatment[treatmentIndices.length];
        for(int i : treatmentIndices) {
            //treatmentList[i] = listOfTreatments[i];
            System.out.print(i);
        }
        return treatmentList;
    }
    
    public void clearAll() {
        startTime.clear();
        endTime.clear();
        patientName.removeAllItems();
        partnerCombo.setSelectedIndex(0);  
        treatmentsCombo.setSelectedIndex(0);  
        
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date.getDate();
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date.setDate(date);
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(LocalTime endTime) {
        this.endTime.setTime(endTime);
    }

    /**
     * @param partner the partner to set
     */
    public void setPartner(Partner partner) {
        switch(partner) {
            case DENTIST: partnerCombo.setSelectedIndex(0);
                break;
            case HYGIENIST: partnerCombo.setSelectedIndex(0);
                break;
        }
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatients(Patient[] patients) {
        this.currentPatients = patients;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(LocalTime startTime) {
        this.startTime.setTime(startTime);
    }

    /**
     * @param treatments the treatments to set
     */
    public void setTreatment(Treatment[] treatments) {
        int[] treatmentIndices = new int[treatments.length];
        for(int i=0; i<treatments.length; i++) {
            
            switch(treatments[i].getName()) {
                case "Hygiene": treatmentIndices[i] = 1;
                    break;
                case "Check - Up": treatmentIndices[i] = 2;
                    break;
                case "Silver amalgam filling": treatmentIndices[i] = 3;
                    break;
                case "White composite resin filling": treatmentIndices[i] = 4;
                    break;
                case "Gold crown": treatmentIndices[i] = 5;
                    break;
            }
        }
        
        treatmentsCombo.setSelectedIndices(treatmentIndices);
    }
    
}
