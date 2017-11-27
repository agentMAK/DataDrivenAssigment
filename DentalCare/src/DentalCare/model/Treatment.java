/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;

import java.time.Duration;

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

    
    //Constructor
    
    public Treatment(String name, int cost,int durationMinutes) {
        this.name = name;
        this.cost = cost;
        this.duration = Duration.ofMinutes(durationMinutes);
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
    
    
}
