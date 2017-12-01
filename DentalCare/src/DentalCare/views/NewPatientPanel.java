/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.views;

import com.github.lgooddatepicker.components.DatePicker;
import java.time.LocalDate;
import DentalCare.model.HealthCarePlan;

/**
 *
 * @author Martin
 */
public class NewPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form Patient
     */
    public NewPatientPanel() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        title = new javax.swing.JComboBox<>();
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
        healthPlan = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        streetLabel1 = new javax.swing.JLabel();
        houseNumber = new javax.swing.JTextField();
        districtLabel = new javax.swing.JTextField();
        district = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Register a new patient");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(675, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setText("Title");
        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Miss", "Mrs", "Dr" }));
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        forenameLabel.setText("Forname");
        forenameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        forename.setText("Max");

        surnameLabel.setText("Surname");
        surnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        surname.setText("Taylor");

        dateOfBirthLabel.setText("Date of Birth");
        dateOfBirthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        houseNumberLabel.setText("House Number");
        houseNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        street.setText("Spring View");
        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });

        cityLabel.setText("City");
        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        city.setText("Sheffiled");

        postCodeLabel.setText("Post Code");
        postCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        postCode.setText("s12 234");
        postCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodeActionPerformed(evt);
            }
        });

        contactNumberLabel.setText("Contact Number");
        contactNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        contactNumber.setText("1232423");

        HealthPlanLabel.setText("Health Plan");
        HealthPlanLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        healthPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "NHS Free Plan", "Maintenance Plan", "Oral Health Plan" }));

        save.setText("Save");

        streetLabel1.setText("Street");
        streetLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        houseNumber.setText("1234");
        houseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNumberActionPerformed(evt);
            }
        });

        districtLabel.setText("District");
        districtLabel.setBorder(null);
        districtLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        districtLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtLabelActionPerformed(evt);
            }
        });

        district.setText("Crookesmore");
        district.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addComponent(forenameLabel)
                            .addComponent(surnameLabel)
                            .addComponent(dateOfBirthLabel)
                            .addComponent(houseNumberLabel)
                            .addComponent(cityLabel)
                            .addComponent(contactNumberLabel)
                            .addComponent(HealthPlanLabel)
                            .addComponent(streetLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(districtLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(postCodeLabel, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(title, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(forename)
                            .addComponent(surname)
                            .addComponent(dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(street)
                            .addComponent(city)
                            .addComponent(postCode)
                            .addComponent(contactNumber)
                            .addComponent(healthPlan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(houseNumber)
                            .addComponent(district, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(671, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forenameLabel)
                    .addComponent(forename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirthLabel)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNumberLabel)
                    .addComponent(houseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(streetLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(street, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(districtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postCodeLabel)
                    .addComponent(postCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumberLabel)
                    .addComponent(contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthPlanLabel)
                    .addComponent(healthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(jButton2))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void postCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodeActionPerformed

    private void streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetActionPerformed

    private void districtLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtLabelActionPerformed

    private void houseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseNumberActionPerformed

    private void districtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HealthPlanLabel;
    private javax.swing.JTextField city;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JLabel contactNumberLabel;
    private com.github.lgooddatepicker.components.DatePicker dateOfBirth;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JTextField district;
    private javax.swing.JTextField districtLabel;
    private javax.swing.JTextField forename;
    private javax.swing.JLabel forenameLabel;
    private javax.swing.JComboBox<String> healthPlan;
    private javax.swing.JTextField houseNumber;
    private javax.swing.JLabel houseNumberLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField postCode;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JButton save;
    private javax.swing.JTextField street;
    private javax.swing.JLabel streetLabel1;
    private javax.swing.JTextField surname;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    // HealthCarePlan Variables
    private final LocalDate now = LocalDate.now();
    private final HealthCarePlan NHSFREE = new HealthCarePlan("NHS Free Plan",2,2,6,0);
    private final HealthCarePlan MAINTAINANCE = new HealthCarePlan("Maintainance Plan",2,2,0,15);
    private final HealthCarePlan ORAL = new HealthCarePlan("Oral Health Plan",4,2,0,21);
    private final HealthCarePlan DENTAL = new HealthCarePlan("Dental Repair Plan",2,2,2,36);
    
    private final HealthCarePlan[] HEALTHPLANS = {null, NHSFREE, MAINTAINANCE, ORAL, DENTAL};
     
    //ActionListener to allow impliementation in secretaryController
    public void addSaveActionListener(java.awt.event.ActionListener l) {
        save.addActionListener(l);
    }
    
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
        healthPlan.setSelectedIndex(0);  
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
        return HEALTHPLANS[healthPlan.getSelectedIndex()];
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
        return (String)title.getSelectedItem();
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
}
