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
import DentalCare.model.IncorrectInputException;
import DentalCare.model.Partner;
import DentalCare.model.Address;
import DentalCare.model.HealthCarePlan;
import DentalCare.model.Treatment;
import java.util.ArrayList;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import DentalCare.model.TreatmentType;
public class Queries {
    public static void addPatient(Patient p) {

        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String user = "newuser";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url + ";user=root");
            
            pst = con.prepareStatement("INSERT INTO Patients(forename,surname,phone,title,dob,address) VALUES(?,?,?,?,?,1)");
            pst.setString(1, p.getForename());
            pst.setString(2, p.getSurname());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            String dob = dateFormat.format(p.getDateOfBirth());
            pst.setString(3, dob);
            pst.setString(1,Integer.toString(p.getContactNumber()));
            pst.executeUpdate();

        } catch (SQLException ex) {
            
            //JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);

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

            pst = con.prepareStatement("INSERT INTO appointments(`partner`,`date`,`patient`,`isComplete`) VALUES(?,?,?,?)");
            pst.setString(1, p.getPartner().toString());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            String dob = dateFormat.format(p.getStartTime());
            pst.setString(2, dob);
            pst.setString(3,Integer.toString(p.getPatientID()));
            pst.setString(4,"false");
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
    public static Appointment[] getAppointments(Partner p,LocalDateTime startdate) throws IncorrectInputException {

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
                appointments.add(new Appointment(null,p,patientID,date,starttime,endtime));
               
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
    public Appointment[] getAppointmentsbyWeek(Partner p, LocalDateTime currentweek) throws IncorrectInputException {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE  WHERE partner = (?) AND Appointments.date BETWEEN (?) and (?)");
            pst.setString(1, p.toString());
            pst.setString(2, currentweek.toString());
            pst.setString(3, currentweek.plusWeeks(1).toString());
            rs = pst.executeQuery();
           
            while (rs.next()) {
                LocalDate date = LocalDate.parse(rs.getString("date"));
                LocalTime starttime = LocalTime.parse(rs.getString("starttime"));
                LocalTime endtime = LocalTime.parse(rs.getString("endtime"));
                int patientID = rs.getInt("patientID");
                Partner partner = Partner.valueOf(rs.getString("partner"));
                Boolean b = rs.getBoolean("iscomplete");
                Appointment appointment = null;
                try {
                    appointment =  new Appointment(null,partner,patientID,date,starttime,endtime,b);
                } catch (IncorrectInputException ex) {
                    Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Treatment[] treatments = getTreatments(appointment);
                appointments.add(new Appointment(treatments,partner,patientID,date,starttime,endtime,b));
               
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
    public static Appointment[] getAppointmentsbyDay(Partner p, LocalDate currentDay) throws IncorrectInputException {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE  WHERE partner = (?) AND Appointments.date =(?)");
            pst.setString(1, p.toString());
            pst.setString(2, currentDay.toString());
            rs = pst.executeQuery();
           
            while (rs.next()) {
                LocalDate date = LocalDate.parse(rs.getString("date"));
                LocalTime starttime = LocalTime.parse(rs.getString("starttime"));
                LocalTime endtime = LocalTime.parse(rs.getString("endtime"));
                int patientID = rs.getInt("patientID");
                Partner partner = Partner.valueOf(rs.getString("partner"));
                Boolean b = rs.getBoolean("iscomplete");
                Appointment appointment = null;
                try {
                    appointment =  new Appointment(null,partner,patientID,date,starttime,endtime,b);
                } catch (IncorrectInputException ex) {
                    Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Treatment[] treatments = getTreatments(appointment);
                appointments.add(new Appointment(treatments,partner,patientID,date,starttime,endtime,b));
               
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
    public static Patient[] getPatients(LocalDate dob, int housenumber, String postcode) {

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
                patients.add(new Patient(patientID,rs.getString("title"), rs.getString("forename"), rs.getString("surname"),getAddress(patientID), dob, rs.getInt("phone"), getHealthPlan(patientID), null));
               
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
    public static Treatment[] getTreatments(Appointment appointment) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Treatment> treatments = new ArrayList<Treatment>();
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("select treatments.* from treatments, appointments, appointmentstreatments where treatments.nametreatment = appointmentstreatments.idtreatment AND appointments.idappointment = appointmentstreatments.idappointment AND appointments.starttime = (?) AND appointments.partner = (?) AND appointments.date = (?)");
            pst.setString(1, appointment.getStartTime().toString());
            pst.setString(2, appointment.getPartner().toString());
            pst.setString(3, appointment.getDate().toString());
            rs = pst.executeQuery();
           
            while (rs.next()) {
                String name = rs.getString("nametreatment");
                int cost = rs.getInt("cost");
                int duration = rs.getInt("duration");
                TreatmentType type = TreatmentType.valueOf(rs.getString("treatmenttype"));
                boolean ispaid = rs.getBoolean("ispaid");
                ;
                treatments.add(new Treatment(name,type,duration, cost,ispaid));
               
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
        return treatments.toArray(new Treatment[treatments.size()]);
    }
    public static Address getAddress(int patientID) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Address address = null;
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("select address.* from patients, address where patients.idpatients = (?) and patients.address = address.idaddress;");
            pst.setString(1,Integer.toString(patientID));
            rs = pst.executeQuery();
            address = new Address(rs.getInt("housenumber"),rs.getString("street"),rs.getString("district"),rs.getString("city"),rs.getString("postcode"));
            

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
        return address;
    }
    public static HealthCarePlan getHealthPlan(int patientID) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        HealthCarePlan healthplan = null;
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("select healthplan.* from patients, healthplan where patients.idpatient = (?) and patients.healthplan = healthplan.idhealthplan;");
            pst.setString(1,Integer.toString(patientID));
            rs = pst.executeQuery();
            LocalDate date = LocalDate.parse(rs.getString("startdate"));

            
            healthplan = new HealthCarePlan(rs.getString("name"),date,rs.getInt("hygenevisits"),rs.getInt("checkups"),rs.getInt("repairvisits"),rs.getInt("cost"));
            

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
        return healthplan;
    }
    public static void deleteAppointment(Appointment p) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("delete appointments.* from appointments where appointments.partner = (?) and appointments.starttime = (?) and appointments.date = (?)");
            pst.setString(1, p.getPartner().toString());
            pst.setString(1, p.getStartTime().toString());
            pst.setString(2, p.getDate().toString());
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
    public static void setTreatmentPaid(Patient p) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("UPDATE appointmentstreatments,appointments,treatments SET appointmentstreatments.ispaid = TRUE WHERE appointments.idappointment = appointmentstreatments.idappointment AND appointmentstreatments.idtreatment = treatments.nametreatment AND appointmentstreatments.ispaid = 0 AND appointments.iscomplete = 1 AND appointments.patient = (?)");
            pst.setString(1, Integer.toString(p.getiD()));
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
    public static void addTreatmentToAppointment(Appointment a, Treatment t) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT into appointmentstreatments(idappointment,idtreatment) SELECT appointments.idappointment as idappointment, treatments.nametreatment as idtreatment FROM appointments,treatments WHERE appointments.partner = (?) and appointments.date = (?) and appointments.starttime = (?) and treatments.nametreatment = (?)");
            pst.setString(1, a.getPartner().toString());
            pst.setString(2, a.getDate().toString());
            pst.setString(3, a.getStartTime().toString());
            pst.setString(4, t.getName());
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
    public static void removeTreatmentFromAppointment(Appointment a, Treatment t) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("DELETE FROM `mydb`.`appointmentstreatments WHERE appointments.partner = (?) and appointments.date = (?) and appointments.starttime = (?) and treatments.nametreatment = (?)");
            pst.setString(1, a.getPartner().toString());
            pst.setString(2, a.getDate().toString());
            pst.setString(3, a.getStartTime().toString());
            pst.setString(4, t.getName());
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
    public static void setAppointmentComplete(Appointment a) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("update appointments set iscomplete = TRUE where appointments.partner = (?) and appointments.starttime = (?) and appointments.date = (?)");
            pst.setString(1, a.getPartner().toString());
            pst.setString(2, a.getDate().toString());
            pst.setString(3, a.getStartTime().toString());
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
    }
