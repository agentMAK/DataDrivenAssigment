/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import DentalCare.model;
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
import DentalCare.model.HealthCarePlan;
import DentalCare.model.Address;
import DentalCare.model.Partner;
import DentalCare.model.Patient;
import DentalCare.model.Treatment;
import java.time.LocalDateTime;
public class Queries {

    public static void addPatient(Patient p) {

        Connection con = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {

            
            con = DriverManager.getConnection(url, user, password);

            pst = con.prepareStatement("INSERT INTO Patients(forename) VALUES(?)");
            pst.setString(1, p.getForename());
            pst.executeUpdate();
            pst = con.prepareStatement("INSERT INTO Patients(surname) VALUES(?)");
            pst.setString(1, p.getSurname());
            pst.executeUpdate();
            pst = con.prepareStatement("INSERT INTO Patients(dob) VALUES(?)");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            String dob = dateFormat.format(p.getDateOfBirth());
            pst.setString(1, dob);
            pst.executeUpdate();
            pst = con.prepareStatement("INSERT INTO Patients(phone) VALUES(?)");
            pst.setString(1,Integer.toString(p.getContactNumber()));
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
    public class RetrieveAll {
    
    public void getAppointments(int i) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "password";

        try {
            
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Appointments WHERE partner = (?)");
            pst.setString(1, Integer.toString(i));
            rs = pst.executeQuery();

            while (rs.next()) {
                
                
            }

        } catch (SQLException ex) {
            
                Logger lgr = Logger.getLogger(RetrieveAll.class.getName());
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
                
                Logger lgr = Logger.getLogger(RetrieveAll.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
    }
}