/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.views;

import DentalCare.model.HealthCarePlan;
import DentalCare.model.Patient;
import com.github.lgooddatepicker.components.DatePicker;
import java.awt.event.ItemEvent;
import java.time.LocalDate;

/**
 *
 * @author Martin
 */
public class EditPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form Patient
     */
    public EditPatientPanel() {
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

        jButton1 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        titleCombo = new javax.swing.JComboBox<>();
        forenameLabel = new javax.swing.JLabel();
        forename = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        dateOfBirthLabel = new javax.swing.JLabel();
        dateOfBirth = new com.github.lgooddatepicker.components.DatePicker();
        houseNumberLabel = new javax.swing.JLabel();
        street = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        postCodeLabel = new javax.swing.JLabel();
        postCode = new javax.swing.JTextField();
        contactNumberLabel = new javax.swing.JLabel();
        contactNumber = new javax.swing.JTextField();
        HealthPlanLabel = new javax.swing.JLabel();
        healthPlanCombo = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        streetLabel1 = new javax.swing.JLabel();
        houseNumber = new javax.swing.JTextField();
        districtLabel = new javax.swing.JTextField();
        district = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        contactNumberLabel1 = new javax.swing.JLabel();
        healthPlanStartDate = new com.github.lgooddatepicker.components.DatePicker();
        unsubscribe = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        patientPicker = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setLayout(new java.awt.BorderLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel.setText("Title");

        titleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Miss", "Mrs", "Dr" }));
        titleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleComboActionPerformed(evt);
            }
        });

        forenameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forenameLabel.setText("Forname");

        surnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surnameLabel.setText("Surname");

        dateOfBirthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateOfBirthLabel.setText("Date of Birth");

        houseNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        houseNumberLabel.setText("House Number");

        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel.setText("City");

        postCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        postCodeLabel.setText("Post Code");

        postCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodeActionPerformed(evt);
            }
        });

        contactNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactNumberLabel.setText("Contact Number");

        HealthPlanLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HealthPlanLabel.setText("Health Plan");

        save.setText("Save");

        streetLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        streetLabel1.setText("Street");

        districtLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        districtLabel.setText("District");
        districtLabel.setBorder(null);
        districtLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtLabelActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        contactNumberLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactNumberLabel1.setText("Health Plan Start Date");

        unsubscribe.setText("Unsubscribe");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Patient");

        patientPicker.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patientPickerItemStateChanged(evt);
            }
        });
        patientPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientPickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addComponent(forenameLabel)
                            .addComponent(surnameLabel)
                            .addComponent(dateOfBirthLabel)
                            .addComponent(houseNumberLabel)
                            .addComponent(cityLabel)
                            .addComponent(contactNumberLabel)
                            .addComponent(HealthPlanLabel)
                            .addComponent(streetLabel1)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(districtLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(postCodeLabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(contactNumberLabel1)
                            .addComponent(jLabel1))
                        .addGap(73, 73, 73)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(forename)
                            .addComponent(surname)
                            .addComponent(dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(street)
                            .addComponent(city)
                            .addComponent(postCode)
                            .addComponent(contactNumber)
                            .addComponent(healthPlanCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(houseNumber)
                            .addComponent(district)
                            .addComponent(healthPlanStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(patientPicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(unsubscribe)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patientPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forenameLabel)
                    .addComponent(forename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirthLabel)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNumberLabel)
                    .addComponent(houseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(streetLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(street, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(districtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postCodeLabel)
                    .addComponent(postCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumberLabel)
                    .addComponent(contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contactNumberLabel1)
                    .addComponent(healthPlanStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthPlanLabel)
                    .addComponent(healthPlanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unsubscribe))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(jButton2))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void titleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleComboActionPerformed

    private void postCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodeActionPerformed

    private void streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetActionPerformed

    private void districtLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtLabelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void patientPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientPickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientPickerActionPerformed

    private void patientPickerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patientPickerItemStateChanged
        int selectedPatientIndex = patientPicker.getSelectedIndex();
        
        if(selectedPatientIndex<0)
            selectedPatientIndex = 0;
        
        if (evt.getStateChange() == ItemEvent.SELECTED)
            updatePatientFields(currentPatients[selectedPatientIndex]);
    }//GEN-LAST:event_patientPickerItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HealthPlanLabel;
    private javax.swing.JTextField city;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JLabel contactNumberLabel1;
    private com.github.lgooddatepicker.components.DatePicker dateOfBirth;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JTextField district;
    private javax.swing.JTextField districtLabel;
    private javax.swing.JTextField forename;
    private javax.swing.JLabel forenameLabel;
    private javax.swing.JComboBox<String> healthPlanCombo;
    private com.github.lgooddatepicker.components.DatePicker healthPlanStartDate;
    private javax.swing.JTextField houseNumber;
    private javax.swing.JLabel houseNumberLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> patientPicker;
    private javax.swing.JTextField postCode;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JButton save;
    private javax.swing.JTextField street;
    private javax.swing.JLabel streetLabel1;
    private javax.swing.JTextField surname;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JComboBox<String> titleCombo;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JCheckBox unsubscribe;
    // End of variables declaration//GEN-END:variables

    //ActionListener to allow impliementation in secretaryController
    public void addSaveActionListener(java.awt.event.ActionListener l) {
        save.addActionListener(l);
    }
    
    // More Variables
    private final LocalDate now = LocalDate.now();
    private final HealthCarePlan NHSFREE = new HealthCarePlan("NHS Free Plan",now,2,2,6,0);
    private final HealthCarePlan MAINTAINANCE = new HealthCarePlan("Maintainance Plan",now,2,2,0,15);
    private final HealthCarePlan ORAL = new HealthCarePlan("Oral Health Plan",now,4,2,0,21);
    private final HealthCarePlan DENTAL = new HealthCarePlan("Dental Repair Plan",now,2,2,2,36);
    
    private final HealthCarePlan[] HEALTHPLANS = {null, NHSFREE, MAINTAINANCE, ORAL, DENTAL};
    
    private HealthCarePlan currentPlan;
    private Patient[] currentPatients;
    
    public void clearAll() {
        forename.setText("");
        surname.setText("");
        dateOfBirth.clear();
        houseNumber.setText("");
        street.setText("");
        district.setText("");
        city.setText("");
        postCode.setText("");
        contactNumber.setText("");
        healthPlanCombo.removeAllItems();
    }
    
    public void updatePatientNames(Patient[] patients) {
        currentPatients = patients;
        
        for (Patient p: currentPatients) {
            patientPicker.addItem(p.getForename()+" "+p.getSurname());
        }
        
        updatePatientFields(currentPatients[0]);
    }
    
    private void updatePatientFields(Patient p) {

            setTitle(p.getTitle());
            forename.setText(p.getForename());
            surname.setText(p.getSurname());
            dateOfBirth.setDate(p.getDateOfBirth());
            houseNumber.setText(String.valueOf(p.getAddress().getHouseNumber()));
            street.setText(p.getAddress().getStreet());
            district.setText(p.getAddress().getDistrict());
            city.setText(p.getAddress().getDistrict());
            postCode.setText(p.getAddress().getPostCode());
            contactNumber.setText(String.valueOf(p.getContactNumber()));
            setHealthPlan(p.getPlan());

        
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    /**
     * @return the City
     */
    public String getCity() {
        return city.getText();
    }

    /**
     * @return the contactNumber
     */
    public int getContactNumber() {
        return Integer.parseInt(contactNumber.getText());
    }

    /**
     * @return the dateOfBirth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth.getDate();
    }

    /**
     * @return the forename
     */
    public String getForename() {
        return forename.getText();
    }

    /**
     * @return the healthPlan
     */
     public HealthCarePlan getHealthPlan() {
        return HEALTHPLANS[healthPlanCombo.getSelectedIndex()];
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return postCode.getText();
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street.getText();
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname.getText();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return (String)titleCombo.getSelectedItem();
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district.getText();
    }

    /**
     * @return the houseNumber
     */
    public int getHouseNumber() {
        return Integer.parseInt(houseNumber.getText());
    }

    /**
     * @param healthPlan the healthPlan to set
     */
    public void setHealthPlan(HealthCarePlan healthPlan) {
             healthPlanCombo.removeAllItems();
            if(healthPlan == null)
                    healthPlanCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "NHS Free Plan", "Maintenance Plan", "Oral Health Plan" }));
            else {
                healthPlanCombo.addItem(healthPlan.getName());
                healthPlanStartDate.setDate(healthPlan.getStartDate());
                currentPlan = healthPlan;
            }
            
            
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        switch(title) {
                case "Mr": titleCombo.setSelectedIndex(0);
                    break;
                case "Miss": titleCombo.setSelectedIndex(1);
                    break;
                case "Mrs": titleCombo.setSelectedIndex(2);
                    break;
                case "Dr": titleCombo.setSelectedIndex(3);
                    break;
        }
    }

    /**
     * @return the unsubscribe
     */
    public boolean isUnsubcribe() {
        return unsubscribe.isSelected();
    }
}
