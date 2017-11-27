/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.views;

import DentalCare.model.Appointment;
import DentalCare.model.Partner;
import DentalCare.model.Patient;
import DentalCare.model.Treatment;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

/**
 *
 * @author Martin
 */
public class AddTreatmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form addTreatmentPanel
     */
    public AddTreatmentPanel() {
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

        jLabel2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lastConsulationDateLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientNameCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        treatmentListLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addTreatmentCombo = new javax.swing.JComboBox<>();
        addTreatmentButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        removeTreatmentCombo = new javax.swing.JComboBox<>();
        removeTreatmentButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setLayout(new java.awt.BorderLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Last Consultation:");

        lastConsulationDateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastConsulationDateLabel.setForeground(new java.awt.Color(153, 153, 153));
        lastConsulationDateLabel.setText("----------------------------------------------------------------------------------------------------------------------------------");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Patient");

        patientNameCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patientNameComboItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Treatment List");

        treatmentListLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Add Treatment");

        addTreatmentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTreatmentComboActionPerformed(evt);
            }
        });

        addTreatmentButton.setText("Add Treatment");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Remove Treatment");

        removeTreatmentButton.setText("Remove Treatment");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(treatmentListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(101, 101, 101)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(addTreatmentCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(removeTreatmentCombo, 0, 423, Short.MAX_VALUE)))
                        .addComponent(addTreatmentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addGap(50, 50, 50)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(patientNameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastConsulationDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(removeTreatmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patientNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastConsulationDateLabel)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(treatmentListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addTreatmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addTreatmentButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))))
                .addGap(18, 18, 18)
                .addComponent(removeTreatmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeTreatmentButton)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        add(mainPanel, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void addTreatmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTreatmentComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTreatmentComboActionPerformed

    private void patientNameComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patientNameComboItemStateChanged
        int selectedPatientIndex = patientNameCombo.getSelectedIndex();
        
        if(selectedPatientIndex<0)
            selectedPatientIndex = 0;
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Appointment lastAppointment = getCurrentPatients()[selectedPatientIndex].lastAppointment(currentPartner);
            if(lastAppointment != null) {
                updateLastConsultationField(lastAppointment);
                updateTreatmentFields(lastAppointment.getTreatment());
            }
        }
    }//GEN-LAST:event_patientNameComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTreatmentButton;
    private javax.swing.JComboBox<String> addTreatmentCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lastConsulationDateLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> patientNameCombo;
    private javax.swing.JButton removeTreatmentButton;
    private javax.swing.JComboBox<String> removeTreatmentCombo;
    private javax.swing.JLabel treatmentListLabel;
    // End of variables declaration//GEN-END:variables

    private Patient[] currentPatients;
    private Treatment[] currentTreatment;
    private Partner currentPartner;
    
    final private Treatment HYGIENE = new Treatment("hygiene",45,20);
    final private Treatment CHECKUP = new Treatment("Check - UP",45,20);
    final private Treatment SILVERFILLING = new Treatment("Silver amalgam filling",90,60);
    final private Treatment WHITEFILLING = new Treatment("White composite resin filling",150,60);
    final private Treatment GOLDCROWN = new Treatment("Gold crown",500,60);
    
    final private Treatment[] listOfTreatments = {HYGIENE,CHECKUP,SILVERFILLING,WHITEFILLING,GOLDCROWN};
    
    public void addAdd_RemoveActionListener(ActionListener add, ActionListener remove) {
        addTreatmentCombo.addActionListener(add);
        removeTreatmentCombo.addActionListener(remove);
    }
    
    public void updatePatientNames(Patient[] patients,Partner partner) {
        currentPatients = patients;
        currentPartner = partner;
               
        for (Patient p: currentPatients) {
            patientNameCombo.addItem(p.getForename());
        }
        
        Appointment lastAppointment = patients[0].lastAppointment(partner);
        
        if(lastAppointment != null) { 
            updateLastConsultationField(lastAppointment);
            updateTreatmentFields(lastAppointment.getTreatment());
        }
        
    }

    public void updateLastConsultationField(Appointment a) {
        
        //lastConsulationDateLabel.setText(a.getDate().toString()+" "+a.getStartTime().toString() );
        
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    public void updateTreatmentFields(Treatment[] treatments) {

        currentTreatment = treatments;
        updateTreatmentListLabel(treatments);
        
        addTreatmentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hygiene    -   £45", "Check-up    -   £45", 
            "Silver amalgam filling    -   £90", "White composite resin filling    -   £150", "Gold Crown        -   £500", }));
        
        
        removeTreatmentCombo.removeAllItems();
        if(treatments == null)
            treatmentListLabel.setText("");
        else {
            for(Treatment t: treatments) {
                removeTreatmentCombo.addItem(t.getName());
            }
        }
        
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void updateTreatmentListLabel(Treatment[] treatments) {
        String treatmentList = "";
        if(treatments == null)
            treatmentListLabel.setText("");
        else {
            for(Treatment t: treatments) {
                treatmentList+=t.getName();
                treatmentList+="   -  £";
                treatmentList+=t.getCost();
                treatmentList+="\n";
            }
            treatmentListLabel.setText(treatmentList);
        }
    }

    /**
     * @return the addTreatmentCombo
     */
    public Treatment getTreatmentCombo() {
        return listOfTreatments[addTreatmentCombo.getSelectedIndex()];
    }

    /**
     * @return the removeTreatmentCombo
     */
    public Treatment getRemoveTreatmentCombo() {
        return currentTreatment[removeTreatmentCombo.getSelectedIndex()];
    }
    
    public void clearAll() {
        addTreatmentCombo.removeAllItems();
        removeTreatmentCombo.removeAllItems();
        treatmentListLabel.setText("");
        patientNameCombo.removeAllItems();
        lastConsulationDateLabel.setText("");
    }

    /**
     * @return the currentPatients
     */
    public Patient getCurrentPatient() {
        return currentPatients[patientNameCombo.getSelectedIndex()];
    }
    
}
