/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exercise09tauregayasofiarose;

/**
 *
 * @author sofia
 */
public class FullTeamException extends Exception {

    /**
     * Creates a new instance of <code>FullTeamException</code> without detail
     * message.
     */
    public FullTeamException() {
    }

    /**
     * Constructs an instance of <code>FullTeamException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FullTeamException(String msg) {
        super(msg);
    }
}
