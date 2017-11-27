/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare;

import DentalCare.model.HealthCarePlan;
import DentalCare.model.Address;
import DentalCare.model.Patient;
import DentalCare.model.Treatment;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import DentalCare.model.Appointment;
import DentalCare.model.Partner;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class SecretaryController extends javax.swing.JFrame {

    /**
     * Creates new form SecretaryController
     */
    public SecretaryController() {
        initComponents();
        combine();
        addNewPatientPanelListener();
        addDentistCalendarPanelListener();
        addHygienistCalendarPanelListener();
        addSearchPanelListener();
        addBookAppointmentPanelListener();
        addCancelAppointmentListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        mainPanel = new javax.swing.JPanel();
        calendars = new javax.swing.JTabbedPane();
        dentistCalendar = new DentalCare.views.CalendarPanel();
        hygienistCalendar = new DentalCare.views.CalendarPanel();
        newPatientPanel = new DentalCare.views.NewPatientPanel();
        bookAppointmentPanel = new javax.swing.JPanel();
        bookAppointmentLowerPanel = new javax.swing.JPanel();
        bookAppointmentSearchPanel = new DentalCare.views.SearchPatientPanel();
        bookAppointmentForm = new DentalCare.views.BookAppointmentPanel();
        cancelAppointmentPanel = new javax.swing.JPanel();
        cancelAppointmentTitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        canceAppointmentLowerPanel = new javax.swing.JPanel();
        cancelAppointmentSearchPanel = new DentalCare.views.SearchPatientPanel();
        cancelAppointmentForm = new DentalCare.views.CancelAppointmentPanel();
        editPatientPanel = new javax.swing.JPanel();
        editAppointmentTitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        editPatientSearchPanel = new DentalCare.views.SearchPatientPanel();
        editPatientLowerPanel = new DentalCare.views.EditPatientPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        viewMenu = new javax.swing.JMenu();
        calendarMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        newPatientMenu = new javax.swing.JMenuItem();
        editPatientMenu = new javax.swing.JMenuItem();
        cancelMenu = new javax.swing.JMenu();
        bookAppointmentMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        calendars.addTab("Dentist", dentistCalendar);
        calendars.addTab("Hygienist", hygienistCalendar);

        mainPanel.add(calendars, "calendars");
        mainPanel.add(newPatientPanel, "newPatient");

        bookAppointmentPanel.setLayout(new java.awt.BorderLayout());

        bookAppointmentLowerPanel.setLayout(new java.awt.BorderLayout());
        bookAppointmentLowerPanel.add(bookAppointmentSearchPanel, java.awt.BorderLayout.PAGE_START);
        bookAppointmentLowerPanel.add(bookAppointmentForm, java.awt.BorderLayout.CENTER);

        bookAppointmentPanel.add(bookAppointmentLowerPanel, java.awt.BorderLayout.CENTER);

        mainPanel.add(bookAppointmentPanel, "bookAppointment");

        cancelAppointmentPanel.setLayout(new java.awt.BorderLayout());

        cancelAppointmentTitlePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Cancel Appointment");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelAppointmentTitlePanelLayout = new javax.swing.GroupLayout(cancelAppointmentTitlePanel);
        cancelAppointmentTitlePanel.setLayout(cancelAppointmentTitlePanelLayout);
        cancelAppointmentTitlePanelLayout.setHorizontalGroup(
            cancelAppointmentTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelAppointmentTitlePanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addContainerGap(825, Short.MAX_VALUE))
        );
        cancelAppointmentTitlePanelLayout.setVerticalGroup(
            cancelAppointmentTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelAppointmentTitlePanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );

        cancelAppointmentPanel.add(cancelAppointmentTitlePanel, java.awt.BorderLayout.PAGE_START);

        canceAppointmentLowerPanel.setLayout(new java.awt.BorderLayout());
        canceAppointmentLowerPanel.add(cancelAppointmentSearchPanel, java.awt.BorderLayout.PAGE_START);
        canceAppointmentLowerPanel.add(cancelAppointmentForm, java.awt.BorderLayout.CENTER);

        cancelAppointmentPanel.add(canceAppointmentLowerPanel, java.awt.BorderLayout.CENTER);

        mainPanel.add(cancelAppointmentPanel, "cancelAppointment");

        editPatientPanel.setLayout(new java.awt.BorderLayout());

        editAppointmentTitlePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Edit Patient");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editAppointmentTitlePanelLayout = new javax.swing.GroupLayout(editAppointmentTitlePanel);
        editAppointmentTitlePanel.setLayout(editAppointmentTitlePanelLayout);
        editAppointmentTitlePanelLayout.setHorizontalGroup(
            editAppointmentTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editAppointmentTitlePanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(961, Short.MAX_VALUE))
        );
        editAppointmentTitlePanelLayout.setVerticalGroup(
            editAppointmentTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editAppointmentTitlePanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        editPatientPanel.add(editAppointmentTitlePanel, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(editPatientSearchPanel, java.awt.BorderLayout.PAGE_START);
        jPanel3.add(editPatientLowerPanel, java.awt.BorderLayout.CENTER);

        editPatientPanel.add(jPanel3, java.awt.BorderLayout.CENTER);

        mainPanel.add(editPatientPanel, "editPatient");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        viewMenu.setText("View");
        viewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMenuActionPerformed(evt);
            }
        });

        calendarMenu.setText("Calendar");
        calendarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarMenuActionPerformed(evt);
            }
        });
        viewMenu.add(calendarMenu);

        jMenuBar1.add(viewMenu);
        viewMenu.getAccessibleContext().setAccessibleName("calendars");

        jMenu2.setText("Patients");

        newPatientMenu.setText("Register New Patient");
        newPatientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientMenuActionPerformed(evt);
            }
        });
        jMenu2.add(newPatientMenu);

        editPatientMenu.setText("Edit Patient");
        editPatientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientMenuActionPerformed(evt);
            }
        });
        jMenu2.add(editPatientMenu);

        jMenuBar1.add(jMenu2);

        cancelMenu.setText("Appointment");

        bookAppointmentMenu.setText("Book an appointment");
        bookAppointmentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentMenuActionPerformed(evt);
            }
        });
        cancelMenu.add(bookAppointmentMenu);

        jMenuItem1.setText("Cancel Appointment");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        cancelMenu.add(jMenuItem1);

        jMenuBar1.add(cancelMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMenuActionPerformed
        
    }//GEN-LAST:event_viewMenuActionPerformed
    

    // Menu items links in panel
    private void newPatientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientMenuActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "newPatient" );
        
    }//GEN-LAST:event_newPatientMenuActionPerformed

    private void calendarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarMenuActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "calendars" );
        // Get list of appointments for both Dentist and Hygienist
        //dentistCalendar.addAppointmentArray(dentistAppointments)
        //hygienistCalendar.addAppointmentArray(hygienistAppointments)
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
        LocalDateTime now = LocalDateTime.now();
        currentWeek = now.with(DayOfWeek.MONDAY);
    }//GEN-LAST:event_calendarMenuActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void bookAppointmentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentMenuActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "bookAppointment" );
        // THIS WILL GET REMOVED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
        bookAppointmentForm.clearPatientName();
    }//GEN-LAST:event_bookAppointmentMenuActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "cancelAppointment" );
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void editPatientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientMenuActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "editPatient" );
        editPatientLowerPanel.clearAll();
        addSearchPanelListener();
        addEditPatientPanelListener();
    }//GEN-LAST:event_editPatientMenuActionPerformed

    


    // Listeners for all panels
    
            private void addNewPatientPanelListener() {
                newPatientPanel.addSaveActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int houseNumber = newPatientPanel.getHouseNumber();
                            String street = newPatientPanel.getStreet();
                            String district = newPatientPanel.getDistrict();
                            String city = newPatientPanel.getCity();
                            String postCode = newPatientPanel.getPostCode();
                            Address address = new Address(houseNumber,street,district,city,postCode);
                            
                            String title = newPatientPanel.getTitle();
                            String forename = newPatientPanel.getForename();
                            String surname = newPatientPanel.getSurname();
                            LocalDate dateOfBirth = newPatientPanel.getDateOfBirth();
                            int contactNumber = newPatientPanel.getContactNumber();
                            
                            HealthCarePlan healthPlan = newPatientPanel.getHealthPlan();
                            
                            Treatment[] treatments = null;
                            Appointment[] appointments = null;
                            
                            
                            Patient patient = new Patient(title, forename, surname, address, dateOfBirth, contactNumber, healthPlan,treatments,appointments);
                            
                            //Add patient to database method here !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                            
                            JOptionPane.showMessageDialog(null, "Data Submitted");
                            newPatientPanel.clearAll();
                        }catch(NumberFormatException el) {
                            JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            }
            
            private void addEditPatientPanelListener() {
                editPatientLowerPanel.addSaveActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int houseNumber = editPatientLowerPanel.getHouseNumber();
                            String street = editPatientLowerPanel.getStreet();
                            String district = editPatientLowerPanel.getDistrict();
                            String city = editPatientLowerPanel.getCity();
                            String postCode = editPatientLowerPanel.getPostCode();
                            Address address = new Address(houseNumber,street,district,city,postCode);
                            
                            String title = editPatientLowerPanel.getTitle();
                            String forename = editPatientLowerPanel.getForename();
                            String surname = editPatientLowerPanel.getSurname();
                            LocalDate dateOfBirth = editPatientLowerPanel.getDateOfBirth();
                            int contactNumber = editPatientLowerPanel.getContactNumber();
                            
                            HealthCarePlan healthPlan = editPatientLowerPanel.getHealthPlan();
                            if(editPatientLowerPanel.isUnsubcribe())
                                healthPlan = null;
                            
                            Treatment[] treatments = null;
                            Appointment[] appointments = null;
                            
                            
                            Patient patient = new Patient(title, forename, surname, address, dateOfBirth, contactNumber, healthPlan,treatments,appointments);
                            
                            //Add patient to database method here !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                            
                            JOptionPane.showMessageDialog(null, "Data Submitted");
                            newPatientPanel.clearAll();
                        }catch(NumberFormatException | ArrayIndexOutOfBoundsException el) {
                            JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            }
            
            private void addSearchPanelListener() {
                bookAppointmentSearchPanel.addSearchActionListener((ActionEvent e) -> {
                    try {
                        bookAppointmentForm.clearPatientName();
                        
                        LocalDate dateOfBirth = bookAppointmentSearchPanel.getDateOfBirth();
                        int houseNumber = bookAppointmentSearchPanel.getHouseNumber();
                        String postCode = bookAppointmentSearchPanel.getPostCode();
                        
                        /// Missing impliementation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
                        //Method here should turn an array of patient object
                        Patient[] patients = null;
                        bookAppointmentForm.updatePatientNames(patientExamples);
                        
                        JOptionPane.showMessageDialog(null, "View results on patient dropbox","Search complete", JOptionPane.INFORMATION_MESSAGE);
                        
                    }catch(NumberFormatException | ArrayIndexOutOfBoundsException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }catch(java.lang.NullPointerException el) {
                            JOptionPane.showMessageDialog(null, "No Results Found","Search", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                
                editPatientSearchPanel.addSearchActionListener((ActionEvent e) -> {
                    try {
                        editPatientLowerPanel.clearAll();
                        
                        LocalDate dateOfBirth = editPatientSearchPanel.getDateOfBirth();
                        int houseNumber = editPatientSearchPanel.getHouseNumber();
                        String postCode = editPatientSearchPanel.getPostCode();
                        
                        /// Missing impliementation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
                        //Method here should turn an array of patient object
                        Patient[] patients = null;
                        editPatientLowerPanel.updatePatientNames(patientExamples);
                        
                        
                    }catch(NumberFormatException | ArrayIndexOutOfBoundsException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }catch(java.lang.NullPointerException el) {
                            JOptionPane.showMessageDialog(null, "No Results Found","Search", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                
                
                cancelAppointmentSearchPanel.addSearchActionListener((ActionEvent e) -> {
                    try {
                        cancelAppointmentForm.clearAll();
                        
                        LocalDate dateOfBirth = cancelAppointmentSearchPanel.getDateOfBirth();
                        int houseNumber = cancelAppointmentSearchPanel.getHouseNumber();
                        String postCode = cancelAppointmentSearchPanel.getPostCode();
                        
                        /// Missing impliementation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
                        //Method here should turn an array of patient object
                        Patient[] patients = null;
                        cancelAppointmentForm.updatePatientNames(patientExamples);
                        
                        
                    }catch(NumberFormatException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }
                });
            }
            
            private void addBookAppointmentPanelListener() {
               bookAppointmentForm.addSaveActionListener((ActionEvent e) -> {
                    try {
                        
                        Patient patient = bookAppointmentForm.getPatient();
                        String partner = bookAppointmentForm.getPartner().toUpperCase();
                        LocalDate date = bookAppointmentForm.getDate();
                        LocalTime startTime = bookAppointmentForm.getStartTime();
                        LocalTime endTime = bookAppointmentForm.getEndTime();
                        Treatment[] treatments = bookAppointmentForm.getTreatments();
                       
                        String fullName = patient.getForename() +" "+patient.getSurname();
                        Appointment appointment =  new Appointment(treatments,Partner.valueOf(partner),fullName,date,startTime,endTime);
                        
                        // Book appointment into Database !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        
                        JOptionPane.showMessageDialog(null, "Appointment is booked");
                        
                        bookAppointmentForm.clearAll();
                    }catch(NumberFormatException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }
                    

                });
            }
            
            private void addDentistCalendarPanelListener() {
                
                dentistCalendar.addChangeWeekListener((ActionEvent e) -> {
                    // Get list of appointments for both Dentist and Hygienist
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentWeek.minusDays(7);  
                }, (ActionEvent e) -> {
                    // Get list of appointments for Dentist with changed week
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentWeek.plusDays(7);
                });
                 
            }
            
            private void addHygienistCalendarPanelListener() {
                
                hygienistCalendar.addChangeWeekListener((ActionEvent e) -> {
                    // Get list of appointments for both Dentist and Hygienist
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentWeek.minusDays(7);  
                }, (ActionEvent e) -> {
                    // Get list of appointments for Dentist with changed week
                    //dentistCalendar.addAppointmentArray(dentistAppointments)
                    currentWeek.plusDays(7);
                });
                 
            }
            
            private void addCancelAppointmentListener() {
                
                cancelAppointmentForm.addCancelListener((ActionEvent e) -> {
                    Appointment appointment = cancelAppointmentForm.getAppointmentComboBox();
                    
                    //Methods here to canel the appointment from the database
                    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
                });
                 
            }
            
            
            
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
            java.util.logging.Logger.getLogger(SecretaryController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretaryController().setVisible(true);
            }
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
            Appointment[] appointments = null;
            
            Patient patient = new Patient(title, forename, surname,address, dateOfBirth, contactNumber, healthPlan,treatments, appointments);
            
            return patient;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DentalCare.views.BookAppointmentPanel bookAppointmentForm;
    private javax.swing.JPanel bookAppointmentLowerPanel;
    private javax.swing.JMenuItem bookAppointmentMenu;
    private javax.swing.JPanel bookAppointmentPanel;
    private DentalCare.views.SearchPatientPanel bookAppointmentSearchPanel;
    private javax.swing.JMenuItem calendarMenu;
    private javax.swing.JTabbedPane calendars;
    private javax.swing.JPanel canceAppointmentLowerPanel;
    private DentalCare.views.CancelAppointmentPanel cancelAppointmentForm;
    private javax.swing.JPanel cancelAppointmentPanel;
    private DentalCare.views.SearchPatientPanel cancelAppointmentSearchPanel;
    private javax.swing.JPanel cancelAppointmentTitlePanel;
    private javax.swing.JMenu cancelMenu;
    private DentalCare.views.CalendarPanel dentistCalendar;
    private javax.swing.JPanel editAppointmentTitlePanel;
    private DentalCare.views.EditPatientPanel editPatientLowerPanel;
    private javax.swing.JMenuItem editPatientMenu;
    private javax.swing.JPanel editPatientPanel;
    private DentalCare.views.SearchPatientPanel editPatientSearchPanel;
    private DentalCare.views.CalendarPanel hygienistCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem newPatientMenu;
    private DentalCare.views.NewPatientPanel newPatientPanel;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables

   //More variables. 
   private LocalDateTime currentWeek;
}
