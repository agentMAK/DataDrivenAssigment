/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare;

import DentalCare.SQL.Queries;
import DentalCare.model.HealthCarePlan;
import DentalCare.model.Address;
import DentalCare.model.Patient;
import DentalCare.model.Treatment;
import DentalCare.model.IncorrectInputException;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import DentalCare.model.Appointment;
import DentalCare.model.Partner;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class SecretaryController extends javax.swing.JFrame {

    private Queries queries;
    /**
     * Creates new form SecretaryController
     */
    public SecretaryController() {
        initComponents();
        queries = new Queries("jdbc:mysql://localhost:3306/mydb","root","1234");
        LocalDateTime now = LocalDateTime.now();
        currentWeek = now.with(DayOfWeek.MONDAY);
        try {
            dentistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.DENTIST,currentWeek));
            hygienistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.HYGIENIST,currentWeek)); 
        } catch (IncorrectInputException ex) {
            Logger.getLogger(SecretaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        addNewPatientPanelListener();
        addDentistCalendarPanelListener();
        addHygienistCalendarPanelListener();
        addSearchPanelListener();
        addBookAppointmentPanelListener();
        addCancelAppointmentListener();
        addEditPatientPanelListener();
        addReceiptAppointmentListener();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
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
        receiptPanelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        receiptSearchPanel = new DentalCare.views.SearchPatientPanel();
        receiptPanelLower = new DentalCare.views.ReceiptPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        viewMenu = new javax.swing.JMenu();
        calendarMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        newPatientMenu = new javax.swing.JMenuItem();
        editPatientMenu = new javax.swing.JMenuItem();
        cancelMenu = new javax.swing.JMenu();
        bookAppointmentMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        recieptMenu = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

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

        receiptPanelMain.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1265, 75));
        jPanel1.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Reciepts");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addContainerGap(1086, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        receiptPanelMain.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(receiptSearchPanel, java.awt.BorderLayout.PAGE_START);
        jPanel2.add(receiptPanelLower, java.awt.BorderLayout.CENTER);

        receiptPanelMain.add(jPanel2, java.awt.BorderLayout.CENTER);

        mainPanel.add(receiptPanelMain, "receipts");

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

        jMenu3.setText("Billing");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        recieptMenu.setText("Reciepts");
        recieptMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieptMenuActionPerformed(evt);
            }
        });
        jMenu3.add(recieptMenu);

        jMenuBar1.add(jMenu3);

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
        try {
            CardLayout cl = (CardLayout)(mainPanel.getLayout());
            cl.show(mainPanel, "calendars" );
            LocalDateTime now = LocalDateTime.now();
            currentWeek = now.with(DayOfWeek.MONDAY);
            dentistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.DENTIST,currentWeek));
            hygienistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.HYGIENIST,currentWeek));
            
            
        } catch (IncorrectInputException ex) {
            Logger.getLogger(SecretaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calendarMenuActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void bookAppointmentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentMenuActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "bookAppointment" );
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
    }//GEN-LAST:event_editPatientMenuActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void recieptMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieptMenuActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "receipts" );                                      
    }//GEN-LAST:event_recieptMenuActionPerformed

    


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
                            
                            Appointment[] appointments = null;
                       
                            Patient patient = new Patient(title, forename, surname, address, dateOfBirth, contactNumber, healthPlan,appointments);
                            
                            queries.addPatient(patient);
                            
                            JOptionPane.showMessageDialog(null, "Data Submitted");
                            newPatientPanel.clearAll();
                        }catch(NumberFormatException | NullPointerException |SQLException el) {
                            JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
            }
            
            private void addEditPatientPanelListener() {
                editPatientLowerPanel.addSave_DeleteActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int houseNumber = editPatientLowerPanel.getHouseNumber();
                            String street = editPatientLowerPanel.getStreet();
                            String district = editPatientLowerPanel.getDistrict();
                            String city = editPatientLowerPanel.getCity();
                            String postCode = editPatientLowerPanel.getPostCode();
                            Address address = new Address(houseNumber,street,district,city,postCode);
                            
                            int patientID = editPatientLowerPanel.getPatientId();
                            String title = editPatientLowerPanel.getTitle();
                            String forename = editPatientLowerPanel.getForename();
                            String surname = editPatientLowerPanel.getSurname();
                            LocalDate dateOfBirth = editPatientLowerPanel.getDateOfBirth();
                            int contactNumber = editPatientLowerPanel.getContactNumber();
                            
                            HealthCarePlan healthPlan = editPatientLowerPanel.getHealthPlan();
                            LocalDate healthPlanStartDate = editPatientLowerPanel.getHealthPlanStartDate();
                            if(editPatientLowerPanel.isUnsubcribe())
                                healthPlan = null;
                            
                            Appointment[] appointments = null;
                            
                            Patient previousPatient = editPatientLowerPanel.getCurrentPatient();
                            int previousPatientiD = previousPatient.getiD();
                            
                            Patient updatePatient = new Patient(patientID,title, forename, surname, address, dateOfBirth, contactNumber, healthPlan,appointments,healthPlanStartDate);
                            
                            queries.editPatient(updatePatient);
                            
                            JOptionPane.showMessageDialog(null, "Data Submitted");
                            newPatientPanel.clearAll();
                        }catch(NumberFormatException | ArrayIndexOutOfBoundsException |NullPointerException|SQLException el) {
                            JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                
                },new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            
                            Patient previousPatient = editPatientLowerPanel.getCurrentPatient();
                            int previousPatientiD = previousPatient.getiD();
                            
                            //Delete patient from database method here !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                            
                            JOptionPane.showMessageDialog(null, "Data Submitted");
                            newPatientPanel.clearAll();
                        }catch(NumberFormatException | ArrayIndexOutOfBoundsException |NullPointerException el) {
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
                        
                        
                        Patient[] patients = queries.getPatients(dateOfBirth, houseNumber, postCode);     
                        bookAppointmentForm.updatePatientNames(patients);
                        
                        JOptionPane.showMessageDialog(null, "Check dropbox box","Search complete", JOptionPane.INFORMATION_MESSAGE);
                        
                    }catch(NumberFormatException | ArrayIndexOutOfBoundsException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }catch(java.lang.NullPointerException el) {
                            JOptionPane.showMessageDialog(null, " No Results Found","Search", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                
                editPatientSearchPanel.addSearchActionListener((ActionEvent e) -> {
                    try {
                        editPatientLowerPanel.clearAll();
                        
                        LocalDate dateOfBirth = editPatientSearchPanel.getDateOfBirth();
                        int houseNumber = editPatientSearchPanel.getHouseNumber();
                        String postCode = editPatientSearchPanel.getPostCode();
                        
    
                        Patient[] patients = queries.getPatients(dateOfBirth, houseNumber, postCode);
                        editPatientLowerPanel.updatePatientNames(patients);
                        
                        
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
                        

                        Patient[] patients = queries.getPatients(dateOfBirth, houseNumber, postCode);
                        cancelAppointmentForm.updatePatientNames(patients);
                        
                        
                    }catch(NumberFormatException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }catch(java.lang.NullPointerException | ArrayIndexOutOfBoundsException el) {
                            JOptionPane.showMessageDialog(null, "No Results Found","Search", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                
                receiptSearchPanel.addSearchActionListener((ActionEvent e) -> {
                    try {
                        receiptPanelLower.clearAll();
                        
                        LocalDate dateOfBirth = receiptSearchPanel.getDateOfBirth();
                        int houseNumber = receiptSearchPanel.getHouseNumber();
                        String postCode = receiptSearchPanel.getPostCode();
                        
                        Patient[] patients = queries.getPatients(dateOfBirth, houseNumber, postCode);
                        receiptPanelLower.updatePatientNames(patients);
                        
                        
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
                       
                        int patientID = 0;
                        if(patient != null)
                             patientID = patient.getiD();
                        
                        Appointment appointment =  new Appointment(treatments,Partner.valueOf(partner),patientID,date,startTime,endTime);
                        
                        queries.addAppointment(appointment);
                        JOptionPane.showMessageDialog(null, "Appointment is booked");
                        
                        bookAppointmentForm.clearAll();
                    }catch(java.lang.NullPointerException | ArrayIndexOutOfBoundsException | SQLException | IncorrectInputException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
                    }
                    

                });
            }
            
            private void addDentistCalendarPanelListener() {
                
                dentistCalendar.addChangeWeekListener((ActionEvent e) -> {
                    try {
                        // Get list of appointments for both Dentist and Hygienist
                        currentWeek = currentWeek.minusDays(7);
                        dentistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.DENTIST,currentWeek));
                        hygienistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.HYGIENIST,currentWeek));  
                        
                    } catch (IncorrectInputException ex) {
                        Logger.getLogger(SecretaryController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }, (ActionEvent e) -> {
                    try {
                        // Get list of appointments for Dentist with changed week
                        currentWeek = currentWeek.plusWeeks(1);
                        dentistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.DENTIST,currentWeek));
                        hygienistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.HYGIENIST,currentWeek));
                        
                    } catch (IncorrectInputException ex) {
                        Logger.getLogger(SecretaryController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                 
            }
            
            private void addHygienistCalendarPanelListener() {
                
                hygienistCalendar.addChangeWeekListener((ActionEvent e) -> {
                    try {
                        currentWeek = currentWeek.minusDays(7); 
                        dentistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.DENTIST, currentWeek));
                        hygienistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.HYGIENIST, currentWeek));
                    
                     
                    }catch(NumberFormatException | NullPointerException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE); 
                    } catch (IncorrectInputException ex) {
                        Logger.getLogger(SecretaryController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     
                }, (ActionEvent e) -> {
                    try {
                        
                    currentWeek = currentWeek.plusDays(7);
                    dentistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.DENTIST, currentWeek));
                    hygienistCalendar.addAppointmentArray(queries.getAppointmentsbyWeek(Partner.HYGIENIST, currentWeek));
                    
                     
                    }catch(NumberFormatException | NullPointerException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE); 
                    } catch (IncorrectInputException ex) {
                        Logger.getLogger(SecretaryController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                });       
            }
            
            
            
            private void addCancelAppointmentListener() {
                
                cancelAppointmentForm.addCancelListener((ActionEvent e) -> {
                    try {
                        
                        Appointment appointment = cancelAppointmentForm.getAppointmentComboBox();
                       
                        
                        queries.deleteAppointment(appointment);                  
                     JOptionPane.showMessageDialog(null, "Appointment Cancelled");
                     
                    }catch(NumberFormatException | NullPointerException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE); 
                    }
                });
                 
            }
            
            private void addReceiptAppointmentListener() {
                
                receiptPanelLower.addPaidActionListener((ActionEvent e) -> {
                    try {
                            
                        //queries.setTreatmentPaid();
                        
                   
                     JOptionPane.showMessageDialog(null, "Treatments have been marked as Paid");
                     receiptPanelLower.clearAll();
                     
                    }catch(NumberFormatException | NullPointerException el) {
                        JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE); 
                    }
                });
                 //Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.

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
            
            Appointment[] appointments = null;
            
            Patient patient = new Patient(title, forename, surname,address, dateOfBirth, contactNumber, healthPlan, appointments);
            
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem newPatientMenu;
    private DentalCare.views.NewPatientPanel newPatientPanel;
    private DentalCare.views.ReceiptPanel receiptPanelLower;
    private javax.swing.JPanel receiptPanelMain;
    private DentalCare.views.SearchPatientPanel receiptSearchPanel;
    private javax.swing.JMenuItem recieptMenu;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables

   //More variables. 
   private LocalDateTime currentWeek;
}
