/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Martin
 */
public class Appointment {
    
    //Instances
    private Treatment[] treatments;
    private Partner partner;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String fullName;
    
    
    
    public Appointment(Treatment[] treatments, Partner partner, String fullName, LocalDateTime startTime, LocalDateTime endTime) {
        this.treatments = treatments;
        this.partner = partner;
        this.fullName = fullName;
        this.startTime = startTime;
        this.endTime = endTime;
         
        
    }
    
    //Method
    
    public boolean hasPassed() {
        LocalDateTime now = LocalDateTime.now();
        return !startTime.isAfter(now);

    }

    //Accessor + Mutators
    /**
     * @return the treatment
     */
    public Treatment[] getTreatment() {
        return treatments;
    }

    /**
     * @param treatment the treatment to set
     */
    public void setTreatment(Treatment treatment) {
        this.treatments = treatments;
    }

    /**
     * @return the partner
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * @param partner the partner to set
     */
    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    /**
     * @return the startTime
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void removeAllItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
