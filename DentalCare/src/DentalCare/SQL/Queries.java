/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.SQL;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Martin
 */

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import DentalCare.model.Patient;
import DentalCare.model.Appointment;
import DentalCare.model.HealthCarePlan;
import DentalCare.model.Partner;
import DentalCare.model.Treatment;
import java.util.ArrayList;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Queries {

    public static void addPatient(Patient p) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT INTO Patients(forename,surname,phone,title,dob,address) VALUES(?,?,?,?,?,1)");
            pst.setString(1, p.getForename());
            pst.setString(2, p.getSurname());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            String dob = dateFormat.format(p.getDateOfBirth());
            pst.setString(3, dob);
            pst.setString(1,Integer.toString(p.getContactNumber()));
            pst.executeUpdate();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);

        } finally {

            try {
                
                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void addAppointment(Appointment p) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT INTO appointments(`partner`,`date`,`patient`,`paid`) VALUES(?,?,?,?)");
            pst.setString(1, p.getPartner().toString());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            String dob = dateFormat.format(p.getStartTime());
            pst.setString(3, dob);
            pst.setString(4,Integer.toString(p.getPatientID()));
            pst.executeUpdate();

        } catch (SQLException ex) {
            
            Logger lgr = Logger.getLogger(Queries.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {
                
                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static Appointment[] getAppointments(Partner p) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE partner = (?)");
            pst.setString(1, p.toString());
            rs = pst.executeQuery();
           
            while (rs.next()) {
                LocalDate date = LocalDate.parse(rs.getString("date"));
                LocalTime starttime = LocalTime.parse(rs.getString("starttime"));
                LocalTime endtime = LocalTime.parse(rs.getString("endtime"));
                int patientID = rs.getInt("patientID");
                appointments.add(new Appointment(p,patientID,date,starttime,endtime));
               
            }

        } catch (SQLException ex) {
            
                Logger lgr = Logger.getLogger(Queries.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {
            
                if (rs != null) {
                    rs.close();
                }
                
                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return appointments.toArray(new Appointment[appointments.size()]);
    }
    public Appointment[] getAppointmentsbyWeek(LocalDateTime currentweek) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE  Appointments.date BETWEEN (?) and (?)");
            pst.setString(1, currentweek.toString());
            pst.setString(2, currentweek.plusWeeks(1).toString());
            rs = pst.executeQuery();
           
            while (rs.next()) {
                LocalDate date = LocalDate.parse(rs.getString("date"));
                LocalTime starttime = LocalTime.parse(rs.getString("starttime"));
                LocalTime endtime = LocalTime.parse(rs.getString("endtime"));
                int patientID = rs.getInt("patientID");
                Partner partner = Partner.valueOf(rs.getString("partner"));
                appointments.add(new Appointment(partner,patientID,date,starttime,endtime));
               
            }

        } catch (SQLException ex) {
            
               JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);

        } finally {

            try {
            
                if (rs != null) {
                    rs.close();
                }
                
                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return appointments.toArray(new Appointment[appointments.size()]);
    }
    public Appointment[] getAppointmentsbyDay(LocalDateTime currentweek) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE  Appointments.date BETWEEN (?) and (?)");
            pst.setString(1, currentweek.toString());
            pst.setString(2, currentweek.plusDays(1).toString());
            rs = pst.executeQuery();
           
            while (rs.next()) {
                LocalDate date = LocalDate.parse(rs.getString("date"));
                LocalTime starttime = LocalTime.parse(rs.getString("starttime"));
                LocalTime endtime = LocalTime.parse(rs.getString("endtime"));
                int patientID = rs.getInt("patientID");
                Partner partner = Partner.valueOf(rs.getString("partner"));
                appointments.add(new Appointment(partner,patientID,date,starttime,endtime));
               
            }

        } catch (SQLException ex) {
            
               JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);

        } finally {

            try {
            
                if (rs != null) {
                    rs.close();
                }
                
                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return appointments.toArray(new Appointment[appointments.size()]);
    }
    public Patient[] getPatients(LocalDate dob, int housenumber, String postcode) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Patient> patients = new ArrayList<Patient>();
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT patients.* FROM patients,address WHERE dob = (?) AND patients.address = address.idaddress AND address.postCode = (?) AND address.houseNumber = (?)");
            pst.setString(1, dob.toString());
            pst.setString(2,postcode);
            pst.setString(3, Integer.toString(housenumber));
            rs = pst.executeQuery();
           
            while (rs.next()) {
          
                int patientID = rs.getInt("patientID");
                patients.add(new Patient(patientID, rs.getString("title"), rs.getString("forename"), rs.getString("surname"), dob, rs.getInt("phone"), rs.getString("healthplan"), null, null));
               
            }

        } catch (SQLException ex) {
            
                JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);

        } finally {

            try {
            
                if (rs != null) {
                    rs.close();
                }
                
                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                
               JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return patients.toArray(new Patient[patients.size()]);
    }
    }
