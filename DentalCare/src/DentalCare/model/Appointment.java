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
    private int patientID;
    private String fullName;
    private boolean isAppointmentCompleted = false;
    // Default time for appointment is an hour
    private final long DEFAULTDURATION = 3600;
    
    //Constants
    private final LocalTime OPENINGTIME = LocalTime.of(9,0);
    private final LocalTime CLOSINGTIME = LocalTime.of(17,0);;
    
    
    // Used when creating a brand new appointment
    public Appointment(Treatment[] treatments, Partner partner, 
            int patientID, LocalDate date, LocalTime startTime, LocalTime endTime)  throws IncorrectInputException{
        this.treatments = treatments;
        this.partner = partner;
        this.patientID = patientID;     
        this.date = date;
        
        this.startTime = startTime;
        checkTime(startTime);
        
        if(endTime == null) 
            calculateEndTime();
        else {
            checkTime(endTime);
            this.endTime = endTime;
        }
            
        checkCurrentTime(date,startTime);
        this.isAppointmentCompleted = false;
    }

    
    public Appointment(Treatment[] treatments, Partner partner, 
            int patientID, LocalDate date, LocalTime startTime, LocalTime endTime,String fullName, boolean isAppointmentCompleted)  throws IncorrectInputException{
        this.treatments = treatments;
        this.partner = partner;
        this.patientID = patientID;     
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fullName = fullName;
        this.isAppointmentCompleted = isAppointmentCompleted;
    }

    //MethodLocalTime endTime = calculateEndTime(startTime,treatments);
    private void calculateEndTime() throws IncorrectInputException{
        long durationSeconds = 0;
        if (treatments == null) {
            this.endTime = startTime.plusSeconds(DEFAULTDURATION); 
        
        } else {
            
            for(Treatment t: treatments) {
                durationSeconds += t.getDurationSeconds();
            }
            this.endTime = startTime.plusSeconds(durationSeconds);
            checkTime(this.endTime);
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
     * @return the patientID
     */
    public int getPatientID() {
        return patientID;
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
     * @return the isAppointmentCompleted
     */
    public boolean getAppointmentCompleted() {
        return isAppointmentCompleted;
    }
    
    /**
     * Checks that time is within opening times
     * @param t a time to check
     * @throws DentalCare.model.IncorrectInputException
     */
    public void checkTime(LocalTime t) throws IncorrectInputException{
        if(t.isBefore(OPENINGTIME) || t.isAfter(CLOSINGTIME))
            throw(new IncorrectInputException());
    }
    
    public void checkCurrentTime(LocalDate d,LocalTime t) throws IncorrectInputException{
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime current = LocalDateTime.of(d,t);
        
        if(current.isBefore(now))
            throw(new IncorrectInputException());
    }
    
    public void markAsCompleted() {
        isAppointmentCompleted = true;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }
}
