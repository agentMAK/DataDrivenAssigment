package DentalCare.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Martin
 */
public class IncorrectInputException extends Exception {

    /**
     * Creates a new instance of <code>incorrectInput</code> without detail
     * message.
     */
    public IncorrectInputException() {
    }

    /**
     * Constructs an instance of <code>incorrectInput</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectInputException(String msg) {
        super(msg);
    }
}
