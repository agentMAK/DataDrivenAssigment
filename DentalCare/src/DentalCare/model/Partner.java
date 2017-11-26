/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.model;

/**
 *
 * @author Martin
 */

public enum Partner {
    DENTIST, HYGIENIST;
    
    @Override
    public String toString() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }

}
