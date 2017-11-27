/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;
import DentalCare.model.Treatment;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Patient {

    private int iD;
    private String title;
    private String forename;
    private String surname;
    private LocalDate dateOfBirth;
    private int contactNumber;
    private Address address;
    private HealthCarePlan plan;
    private Treatment[] pastTreatments;
    private Appointment[] appointments;
    
    public Patient(String title, String forname, String surname, Address address, LocalDate dateOfBirth, int contactNumber, HealthCarePlan plan, Appointment[] appointments){
        this.title = title;
        this.forename = forname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
        this.address = address;
        this.plan = plan;
        this.appointments = appointments;
        if(appointments != null) {
            updateAppointmentTreatmentForHealthPlan();
            setPastTreatmentList();
        }
               
    }
    
    public Patient(int iD, String title, String forname, String surname, Address address, LocalDate dateOfBirth, int contactNumber, HealthCarePlan plan, Appointment[] appointments){
        this(title,forname,surname,address,dateOfBirth,contactNumber,plan,appointments);
        this.iD = iD;
    }
    
// Appointment array must be in ascending order
    public Appointment lastAppointment(Partner p) {
        
        for(int i=appointments.length-1; i >= 0; i--) {
                if(appointments[i].getPartner() == p)
                    return appointments[i]; 
            }
        
        return null;
        }
    /**
     * Goes through appointment and gets all treatments that have been completed
     */
    private void setPastTreatmentList(){
        ArrayList<Treatment> treatmentsList = new ArrayList<Treatment>();
        for(Appointment a :appointments) {
            
            if(a.getAppointmentCompleted()){
                
                for(Treatment t: a.getTreatment()) {
                    treatmentsList.add(t);
                }
            }
        }
        Treatment[] treatmentsArr = new Treatment[treatmentsList.size()];
        treatmentsArr = treatmentsList.toArray(treatmentsArr);
        pastTreatments = treatmentsArr;
    }
    
    /**
     * Return all the treatment that are due, ( Need to get paid)
     */
    public Treatment[] getTreatmentsDue() {
        ArrayList<Treatment> treatmentsList = new ArrayList<>();
        if(pastTreatments != null) {
            for(Treatment t :pastTreatments) {
                if(t.isPaid() == false)
                treatmentsList.add(t);
            }
            Treatment[] treatmentsArr = new Treatment[treatmentsList.size()];
            treatmentsArr = treatmentsList.toArray(treatmentsArr);
            return treatmentsArr;
        }else
            return null;
     }
    
    /**
     * Re-adjust the cost of treatment to account for the healthPlan
     */
    private void updateAppointmentTreatmentForHealthPlan() {
        int checkUp = plan.getCheckUpVisits();
        int hygiene = plan.getHygieneVisits();
        int repair = plan.getRepairs();
        
        for(Appointment a :appointments) {
            
            if(a.getDate().isAfter(plan.getStartDate())){
                
                for(Treatment t: a.getTreatment()) {
                    
                    if(t.getType() == TreatmentType.CHECKUP && checkUp >0) {
                        t.setCost(0);
                        checkUp -=1;
                    }
                    
                    if(t.getType() == TreatmentType.HYGIENE && hygiene > 0 )
                        t.setCost(0);
                        hygiene -=1;
                    
                    if(t.getType() == TreatmentType.REPAIR && repair > 0 )
                        t.setCost(0);
                        repair -=1;
                }
            }
        }
        
        
    }
    
    public int getOutstandingBalance() {
        int balance = 0;
        if(getTreatmentsDue() != null) {
            for(Treatment t: getTreatmentsDue()) {
                balance+=t.getCost();
            }
            return balance;
        }else
            return 0;
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
    public Treatment[] getPastTreatments() {
        return pastTreatments;
    }
    
    

    /**
     * @return the appointments
     */
    public Appointment[] getAllAppointments() {
        return appointments;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }
    
    /**
     * @return the iD
     */
    public int getiD() {
        return iD;
    }

}
