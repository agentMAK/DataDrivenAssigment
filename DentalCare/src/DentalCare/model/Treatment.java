/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;

import java.time.Duration;
import DentalCare.model.TreatmentType;

/**
 *
 * @author Martin
 */
public class Treatment {

    /**
     * @return the duration
     */
    public long getDurationSeconds() {
        return duration.getSeconds();
    }
    
    //Instances
    private String name;
    private int cost;
    private final Duration duration;
    private boolean paid;
    private TreatmentType type;

    
    //Constructor
    
    public Treatment(String name,TreatmentType type, int cost,int durationMinutes) {
        this.name = name;
        this.cost = cost;
                this.type = type;
        this.duration = Duration.ofMinutes(durationMinutes);
        this.paid = false;
    }
    
    public Treatment(String name,TreatmentType type, int cost,int durationMinutes,boolean paid) {
        this(name,type,cost,durationMinutes);
        this.paid = paid;
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
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the paid
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * @return the type
     */
    public TreatmentType getType() {
        return type;
    }
    
    
}
