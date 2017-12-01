/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.SQL;

import java.sql.ResultSet;
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
import java.sql.Driver;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Enumeration;
public class Queries {
    
    private String url = "jdbc:mysql://localhost:3306/mydb";
    private String user = "root";
    private String password = "password";
    private DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
    private DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    //Take in the database url, username and password
    public Queries(String url,String user,String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addPatient(Patient p) throws SQLException {

        Connection con = null;
        PreparedStatement pst = null;
        int addressID = addAddress(p.getAddress());
        try {

            con = DriverManager.getConnection(url, user, password);
            
            pst = con.prepareStatement("INSERT INTO Patients(forename,surname,title,phone,dob,address,healthplan,healthPlanStartDate) VALUES(?,?,?,?,?,?,?,?)");
            pst.setString(1, p.getForename());
            pst.setString(2, p.getSurname());
            pst.setString(3, p.getTitle());
            pst.setString(4,Integer.toString(p.getContactNumber()));
            String dob = p.getDateOfBirth().format(formatterDate);
            pst.setString(5, dob);
            pst.setString(6, Integer.toString(addressID));
            if(p.getPlan() != null) {
                pst.setString(7, p.getPlan().getName());
            }else {
                pst.setString(7, "");
                pst.setString(8, LocalDate.now().format(formatterDate));
            }
            
            
            pst.executeUpdate();
        } finally {

                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }
        }
    }
    
    public int addAddress(Address a) {

        Connection con = null;
        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        int lastID = 0;
        try {

            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("INSERT INTO address(`housenumber`,`street`,`district`,`city`,`postcode`) VALUES(?,?,?,?,?)");
            pst.setString(1, Integer.toString(a.getHouseNumber()));
            pst.setString(2, a.getStreet());
            pst.setString(3,a.getDistrict());
            pst.setString(4,a.getCity());
            pst.setString(5,a.getPostCode());
            pst.executeUpdate();
            pst2 = con.prepareStatement("SELECT last_insert_id()");
            rs = pst2.executeQuery();
            rs.next();
            lastID = rs.getInt(1);

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
        return lastID;
    }
    
    public void addAppointment(Appointment p) throws SQLException{

        Connection con = null;
        PreparedStatement pst = null;

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT INTO appointments(partner,date,starttime,endtime,patient) VALUES(?,?,?,?,?)");
            pst.setString(1, p.getPartner().toString());
            
            DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String date = p.getDate().format(formatterDate);
            String startTime = p.getStartTime().format(formatterTime);
            String endTime = p.getEndTime().format(formatterTime);
            
            pst.setString(2, date);
            pst.setString(3, startTime);
            pst.setString(4, endTime);
            pst.setString(5,Integer.toString(p.getPatientID()));
            //pst.setString(6,"false");
            pst.executeUpdate();


        } finally {

                if (pst != null) {
                    pst.close();
                }
                
                if (con != null) {
                    con.close();
                }
        }

    }
    public Appointment[] getAppointments(Partner p) throws IncorrectInputException {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE partner = (?)");
            pst.setString(1, p.toString());
            rs = pst.executeQuery();
           
            while (rs.next()) {
                LocalDate date = rs.getDate("date").toLocalDate();
                LocalTime starttime = rs.getTime("startTime").toLocalTime();
                LocalTime endtime = rs.getTime("endTime").toLocalTime();
                int patientID = rs.getInt("patient");
                boolean isAppointmentCompleted = rs.getBoolean("iscomplete");
                appointments.add(new Appointment(null,p,patientID,date,starttime,endtime,getPatientName(patientID),isAppointmentCompleted));
               
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
                
                Logger lgr = Logger.getLogger(Queries.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        return appointments.toArray(new Appointment[appointments.size()]);
    }
    public Appointment[] getAppointmentsbyWeek(Partner p, LocalDateTime currentweek) throws IncorrectInputException {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        
        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE partner = (?) AND Appointments.date BETWEEN (?) and (?)ORDER BY starttime ASC");
            pst.setString(1, p.toString());
            pst.setString(2, currentweek.format(formatterDate));
            pst.setString(3, currentweek.plusWeeks(1).format(formatterDate));
            rs = pst.executeQuery();
           
            while (rs.next()) {
                LocalDate date = rs.getDate("date").toLocalDate();
                LocalTime starttime = rs.getTime("startTime").toLocalTime();
                LocalTime endtime = rs.getTime("endTime").toLocalTime();
                int patientID = rs.getInt("patient");
                Partner partner = Partner.valueOf(rs.getString("partner").toUpperCase());
                Boolean b = rs.getBoolean("iscomplete");
                Appointment appointment = null;
                try {
                    appointment =  new Appointment(null,partner,patientID,date,starttime,endtime,getPatientName(patientID),b);
                } catch (IncorrectInputException ex) {
                    Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
                }
                Treatment[] treatments = getTreatments(appointment);
                appointments.add(new Appointment(treatments,partner,patientID,date,starttime,endtime,getPatientName(patientID),b));
               
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
                
                Logger lgr = Logger.getLogger(Queries.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        return appointments.toArray(new Appointment[appointments.size()]);
    }
    public Appointment[] getAppointmentsbyDay(Partner p, LocalDate currentDay) throws IncorrectInputException {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();

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
                    appointment =  new Appointment(null,partner,patientID,date,starttime,endtime,getPatientName(patientID),b);
                } catch (IncorrectInputException ex) {
                    Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Treatment[] treatments = getTreatments(appointment);
                appointments.add(new Appointment(treatments,partner,patientID,date,starttime,endtime,getPatientName(patientID),b));
               
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
                
                Logger lgr = Logger.getLogger(Queries.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        return appointments.toArray(new Appointment[appointments.size()]);
    }
    public Patient[] getPatients(LocalDate dob, int housenumber, String postcode) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Patient> patients = new ArrayList<Patient>();

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT patients.* FROM patients,address WHERE dob = (?) AND patients.address = address.idaddress AND address.postCode = (?) AND address.houseNumber = (?)");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String dobString = dob.format(formatter);
            pst.setString(1, dobString);
            pst.setString(2,postcode);
            pst.setString(3, Integer.toString(housenumber));
            rs = pst.executeQuery();
           
            while (rs.next()) {
          
                int patientID = rs.getInt("patientID");
                patients.add(new Patient(patientID,rs.getString("title"), rs.getString("forename"), rs.getString("surname"),getAddress(patientID), dob, rs.getInt("phone"), getHealthPlan(patientID), null,rs.getDate("healthPlanStartDate").toLocalDate()));
               
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
                
               Logger lgr = Logger.getLogger(Queries.class.getName());
               lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        return patients.toArray(new Patient[patients.size()]);
    }
    public Treatment[] getTreatments(Appointment appointment) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Treatment> treatments = new ArrayList<Treatment>();

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT treatments.* FROM treatments, appointments, appointmentstreatments WHERE treatments.nametreatment = appointmentstreatments.idtreatment AND appointments.idappointment = appointmentstreatments.idappointment AND appointments.starttime = (?) AND appointments.partner = (?) AND appointments.date = (?)");
            pst.setString(1, appointment.getStartTime().format(formatterTime));
            pst.setString(2, appointment.getPartner().toString());
            pst.setString(3, appointment.getDate().format(formatterDate));
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
                
               Logger lgr = Logger.getLogger(Queries.class.getName());
               lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
        return treatments.toArray(new Treatment[treatments.size()]);
    }
    public Address getAddress(int patientID) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Address address = null;

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT address.* FROM patients, address WHERE patients.patientID = (?) AND patients.address = address.idaddress");
            pst.setString(1,Integer.toString(patientID));
            rs = pst.executeQuery();
            while (rs.next()) {
                address = new Address(rs.getInt("houseNumber"),rs.getString("street"),rs.getString("district"),rs.getString("city"),rs.getString("postCode"));
             }
            

        } catch (SQLException ex) {
            
               //JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error", JOptionPane.ERROR_MESSAGE);

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
    public HealthCarePlan getHealthPlan(int patientID) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        HealthCarePlan healthplan = null;

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT healthplan.* FROM patients, healthplan WHERE patients.patientID = (?) AND patients.healthplan = healthplan.namehealthplan");
            pst.setString(1,Integer.toString(patientID));
            rs = pst.executeQuery();
            
            while (rs.next()) {
                healthplan = new HealthCarePlan(rs.getString("namehealthplan"),rs.getInt("hygieneVisits"),rs.getInt("checkupVisits"),rs.getInt("repairVisits"),rs.getInt("cost"));
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
        return healthplan;
    }
    public void deleteAppointment(Appointment p) {

        Connection con = null;
        PreparedStatement pst = null;

               try {

            
            con = DriverManager.getConnection(url,user,password);
            pst = con.prepareStatement("DELETE appointments.* from appointments where appointments.partner = (?) and appointments.starttime = (?) and appointments.date = (?)");
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
                
                JOptionPane.showMessageDialog(null, "Incorrect Input  - Try again","Error - deleteAppointment", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void setTreatmentPaid(Patient p) {

        Connection con = null;
        PreparedStatement pst = null;


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
                
               Logger lgr = Logger.getLogger(Queries.class.getName());
               lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
    public void addTreatmentToAppointment(Appointment a, Treatment t) {

        Connection con = null;
        PreparedStatement pst = null;

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT into appointmentstreatments(idappointment,idtreatment) SELECT appointments.idappointment as idappointment, treatments.nametreatment as idtreatment FROM appointments,treatments WHERE appointments.partner = (?) and appointments.date = (?) and appointments.starttime = (?) and treatments.nametreatment = (?)");
            pst.setString(1, a.getPartner().toString());
            pst.setString(2, a.getDate().toString());
            pst.setString(3, a.getStartTime().toString());
            pst.setString(4, t.getName());
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
                
                Logger lgr = Logger.getLogger(Queries.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
    public void removeTreatmentFromAppointment(Appointment a, Treatment t) {

        Connection con = null;
        PreparedStatement pst = null;


        try {   
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("DELETE appointmentstreatments.* FROM appointmentstreatments, appointments, treatments WHERE appointments.partner = (?) and appointments.date = (?) and appointments.starttime = (?) and appointmentstreatments.idtreatment = (?) and appointments.idappointment = appointmentstreatments.idappointment");
            pst.setString(1, a.getPartner().toString());
            pst.setString(2, a.getDate().toString());
            pst.setString(3, a.getStartTime().toString());
            pst.setString(4, t.getName());
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
                
                Logger lgr = Logger.getLogger(Queries.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
    public void setAppointmentComplete(Appointment a) {

        Connection con = null;
        PreparedStatement pst = null;

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
                
                Logger lgr = Logger.getLogger(Queries.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
    public String getPatientName(int PatientID) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Treatment> treatments = new ArrayList<Treatment>();
        String title = null,forename = null,surname = null;

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM patients WHERE patientID = ?");
            pst.setString(1,Integer.toString(PatientID));
            rs = pst.executeQuery();
           
            while (rs.next()) {
                title = rs.getString("title");
                forename = rs.getString("forename");
                surname = rs.getString("surname");   
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
                
               Logger lgr = Logger.getLogger(Queries.class.getName());
               lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        return (title+" "+forename+" "+surname);
        }
    }
        
}
