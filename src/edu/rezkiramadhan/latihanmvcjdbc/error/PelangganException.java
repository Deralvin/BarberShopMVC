/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkiramadhan.latihanmvcjdbc.error;

/**
 *
 * @author ENG-DEV23
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganExeption</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
