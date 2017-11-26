/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;
import DentalCare.model.Treatment;
import java.time.LocalDate;

/**
 *
 * @author Martin
 */
public class Patient {

    private String title;
    private String forename;
    private String surname;
    private LocalDate dateOfBirth;
    private int contactNumber;
    private HealthCarePlan plan;
    private Treatment[] treatments;
    private Appointment[] appointments;
    
    public Patient(String title, String forname, String surname, LocalDate dateOfBirth, int contactNumber, HealthCarePlan plan, Treatment[] treatments, Appointment[] appointments){
        this.title = title;
        this.forename = forname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.plan = plan;
        this.treatments = treatments;
        this.appointments = appointments;
               
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the forename
     */
    public String getForename() {
        return forename;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @return the dateOfBirth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @return the contactNumber
     */
    public int getContactNumber() {
        return contactNumber;
    }

    /**
     * @return the plan
     */
    public HealthCarePlan getPlan() {
        return plan;
    }

    /**
     * @return the treatments
     */
    public Treatment[] getTreatments() {
        return treatments;
    }
    
    

    /**
     * @return the appointments
     */
    public Appointment[] getAllAppointments() {
        return appointments;
    }
    
    
    
}
