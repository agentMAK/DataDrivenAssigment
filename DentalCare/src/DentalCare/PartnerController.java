/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare;

import DentalCare.model.Address;
import DentalCare.model.Appointment;
import DentalCare.model.HealthCarePlan;
import DentalCare.model.Partner;
import DentalCare.model.Patient;
import DentalCare.model.Treatment;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class PartnerController extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PartnerController() {
        initComponents();
        addDentistCalendarPanelListener();
        addHygienistCalendarPanelListener();
        combine();
        addSearchPanelListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPanel = new javax.swing.JTabbedPane();
        dentistPanel = new javax.swing.JTabbedPane();
        dentistCalendar = new DentalCare.views.CalendarDayView();
        addTreatmentDentistMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchPatientDentist = new DentalCare.views.SearchPatientPanel();
        addTreatmentDentist = new DentalCare.views.AddTreatmentPanel();
        hygienistPanel = new javax.swing.JTabbedPane();
        hygienstCalendar = new DentalCare.views.CalendarDayView();
        addTreatmentHygienistMain = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        searchPatientHygienist = new DentalCare.views.SearchPatientPanel();
        addTreatmentHygienist = new DentalCare.views.AddTreatmentPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTabbedPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainTabbedPanelStateChanged(evt);
            }
        });

        dentistPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dentistPanelStateChanged(evt);
            }
        });
        dentistPanel.addTab("Calendar", dentistCalendar);

        addTreatmentDentistMain.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Add Treatment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(667, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        addTreatmentDentistMain.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(searchPatientDentist, java.awt.BorderLayout.PAGE_START);
        jPanel3.add(addTreatmentDentist, java.awt.BorderLayout.CENTER);

        addTreatmentDentistMain.add(jPanel3, java.awt.BorderLayout.CENTER);

        dentistPanel.addTab("Add Treatment", addTreatmentDentistMain);

        mainTabbedPanel.addTab("Dentist", dentistPanel);

        hygienistPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hygienistPanelStateChanged(evt);
            }
        });
        hygienistPanel.addTab("Calendar", hygienstCalendar);

        addTreatmentHygienistMain.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Add Treatment");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(667, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        addTreatmentHygienistMain.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel5.add(searchPatientHygienist, java.awt.BorderLayout.PAGE_START);
        jPanel5.add(addTreatmentHygienist, java.awt.BorderLayout.CENTER);

        addTreatmentHygienistMain.add(jPanel5, java.awt.BorderLayout.CENTER);

        hygienistPanel.addTab("Add Treatment", addTreatmentHygienistMain);

        mainTabbedPanel.addTab("Hygienist", hygienistPanel);

        getContentPane().add(mainTabbedPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainTabbedPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainTabbedPanelStateChanged
        currentDay  = LocalDateTime.now();
    }//GEN-LAST:event_mainTabbedPanelStateChanged

    private void hygienistPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hygienistPanelStateChanged

    }//GEN-LAST:event_hygienistPanelStateChanged

    private void dentistPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dentistPanelStateChanged

    }//GEN-LAST:event_dentistPanelStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PartnerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartnerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartnerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartnerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartnerController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DentalCare.views.AddTreatmentPanel addTreatmentDentist;
    private javax.swing.JPanel addTreatmentDentistMain;
    private DentalCare.views.AddTreatmentPanel addTreatmentHygienist;
    private javax.swing.JPanel addTreatmentHygienistMain;
    private DentalCare.views.CalendarDayView dentistCalendar;
    private javax.swing.JTabbedPane dentistPanel;
    private javax.swing.JTabbedPane hygienistPanel;
    private DentalCare.views.CalendarDayView hygienstCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane mainTabbedPanel;
    private DentalCare.views.SearchPatientPanel searchPatientDentist;
    private DentalCare.views.SearchPatientPanel searchPatientHygienist;
    // End of variables declaration//GEN-END:variables
    private LocalDateTime currentDay;
    
    
    //Listener for all panels
    
    private void addDentistCalendarPanelListener() {
                
                dentistCalendar.addChangeDayListener((ActionEvent e) -> {
                    // Get list of appointments for both Dentist and Hygienist
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentDay.minusDays(1);  
                }, (ActionEvent e) -> {
                    // Get list of appointments for Dentist with changed week
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentDay.plusDays(1);
                });
                 
            }

    private void addHygienistCalendarPanelListener() {
                
                hygienstCalendar.addChangeDayListener((ActionEvent e) -> {
                    // Get list of appointments for both Dentist and Hygienist
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentDay.minusDays(1);  
                }, (ActionEvent e) -> {
                    // Get list of appointments for Dentist with changed week
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentDay.plusDays(1);
                });
                 
            }
    
    
    private void addSearchPanelListener() {
                searchPatientDentist.addSearchActionListener((ActionEvent e) -> {
                    try {
                        addTreatmentDentist.clearAll();
                        
                        LocalDate dateOfBirth = searchPatientDentist.getDateOfBirth();
                        int houseNumber = searchPatientDentist.getHouseNumber();
                        String postCode = searchPatientDentist.getPostCode();
                        
                        /// Missing impliementation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
                        //Method here should turn an array of patient object
                        Patient[] patients = null;
                        addTreatmentDentist.updatePatientNames(patientExamples, Partner.DENTIST);
                        
                        JOptionPane.showMessageDialog(null, "View results on patient dropbox","Search complete", JOptionPane.INFORMATION_MESSAGE);
                        
                    }catch(NumberFormatException | ArrayIndexOutOfBoundsException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }catch(java.lang.NullPointerException el) {
                            JOptionPane.showMessageDialog(null, "No Results Found","Search", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                
                searchPatientHygienist.addSearchActionListener((ActionEvent e) -> {
                    try {
                        addTreatmentHygienist.clearAll();
                        
                        LocalDate dateOfBirth = searchPatientHygienist.getDateOfBirth();
                        int houseNumber = searchPatientHygienist.getHouseNumber();
                        String postCode = searchPatientHygienist.getPostCode();
                        
                        /// Missing impliementation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
                        //Method here should turn an array of patient object
                        Patient[] patients = null;
                        addTreatmentHygienist.updatePatientNames(patientExamples, Partner.HYGIENIST);
                        
                        JOptionPane.showMessageDialog(null, "View results on patient dropbox","Search complete", JOptionPane.INFORMATION_MESSAGE);
                        
                    }catch(NumberFormatException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }
                });
                
    }
    
    private void addDentistTreatmentPanelListener() {
                
                addTreatmentDentist.addAdd_RemoveActionListener((ActionEvent e) -> {
                    // Add treatment to appointment 
                }, (ActionEvent e) -> {
                    // Get list of appointments for Dentist with changed week
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentWeek.plusDays(7);
                });
                 
            }

    private Patient[] patientExamples = new Patient[2];
    private Patient patient1 = examplePatient("max");
    private Patient patient2 = examplePatient("Martin");
    
    
    public void combine() {
        patientExamples[0] = patient1;
        patientExamples[1] = patient2;
    }
   
    
    public Patient examplePatient(String name) {
            int houseNumber = 45;
            String street = "bowen street";
            String district = "East side";
            String city = "Crewe";
            String postCode = "CW2 564";
            Address address = new Address(houseNumber,street,district,city,postCode);
            
            String title = "Mr";
            String forename = name;
            String surname = "taylor";
            LocalDate dateOfBirth = LocalDate.now();
            int contactNumber = 565657565;
            
            HealthCarePlan healthPlan = null;
            
            Treatment[] treatments = null;
            
            Appointment appointmentExamples = new Appointment(treatments, Partner.HYGIENIST, "Maxi", null, LocalTime.now(), null);
            Appointment[] appointments = {appointmentExamples};
            
            Patient patient = new Patient(title, forename, surname,address, dateOfBirth, contactNumber, healthPlan,treatments, appointments);
            
            return patient;
    }
}
