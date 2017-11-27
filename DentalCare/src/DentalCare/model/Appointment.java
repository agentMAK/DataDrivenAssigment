/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Martin
 */
public class Appointment {
    
    //Instances
    private Treatment[] treatments;
    private Partner partner;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String fullName;
    private boolean isAppointmentCompleted = false;
    // Default time for appointment is an hour
    private final long DEFAULTDURATION = 3600;
    
    
    
    public Appointment(Treatment[] treatments, Partner partner, String fullName, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.treatments = treatments;
        this.partner = partner;
        this.fullName = fullName;
        this.date = date;
        this.startTime = startTime;
        if(endTime == null) 
            calculateEndTime();
        else
            this.endTime = endTime;   
    }
    
    //Method
    private void calculateEndTime(){
        long durationSeconds = 0;
        if (treatments == null)
            this.endTime = startTime.plusSeconds(DEFAULTDURATION);
        
        else {
            
            for(Treatment t: treatments) {
                //durationSeconds += t.getDurationSeconds();
                System.out.print("A treatment");
            }
            this.endTime = startTime.plusSeconds(durationSeconds);
        }
        
    }
    public boolean hasPassed() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startDateTime = LocalDateTime.of(getDate(), getStartTime());
        return !startDateTime.isAfter(now);

    }

    //Accessor + Mutators
    /**
     * @return the treatment
     */
    public Treatment[] getTreatment() {
        return treatments;
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
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * @return the endTime
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(LocalTime endTime) {
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

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the isAppointmentCompleted
     */
    public boolean isIsAppointmentCompleted() {
        return isAppointmentCompleted;
    }

    /**
     * @param isAppointmentCompleted the isAppointmentCompleted to set
     */
    public void setIsAppointmentCompleted(boolean isAppointmentCompleted) {
        this.isAppointmentCompleted = isAppointmentCompleted;
    }
    
    
    
}
