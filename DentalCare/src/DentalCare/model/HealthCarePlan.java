/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;

import java.time.LocalDate;

/**
 *
 * @author Martin
 */
public class HealthCarePlan {
    
    //Instances
    private String name;
    private int costMonthly;
    private LocalDate startDate;
    private int hygieneVisits;
    private int checkUpVisits;
    private int repairs;
    
    
    public HealthCarePlan(String name, LocalDate startDate, int hygiene, int checkUpVisits, int repairs, int costMonthly ) {
        this.name = name;
        this.startDate = startDate;
        this.hygieneVisits = hygieneVisits;
        this.checkUpVisits = checkUpVisits;
        this.repairs = repairs;
        this.costMonthly = costMonthly;
                
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hygieneVisits
     */
    public int getHygieneVisits() {
        return hygieneVisits;
    }

    /**
     * @param hygieneVisits the hygieneVisits to set
     */
    public void setHygieneVisits(int hygieneVisits) {
        this.hygieneVisits = hygieneVisits;
    }

    /**
     * @return the checkUpVisits
     */
    public int getCheckUpVisits() {
        return checkUpVisits;
    }

    /**
     * @param checkUpVisits the checkUpVisits to set
     */
    public void setCheckUpVisits(int checkUpVisits) {
        this.checkUpVisits = checkUpVisits;
    }

    /**
     * @return the repairs
     */
    public int getRepairs() {
        return repairs;
    }

    /**
     * @param repairs the repairs to set
     */
    public void setRepairs(int repairs) {
        this.repairs = repairs;
    }

    /**
     * @return the startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
