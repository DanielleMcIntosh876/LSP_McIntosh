/**
 * 
 */
package org.howard.edu.lsp.assignment7;

/**
 * @author danielle
 *
 */

/*
 * EmptyListException public class extends Exception
 */
public class EmptyListException extends Exception {
	public EmptyListException() {}
	public EmptyListException(String errors) {
        super(errors);
    }

}
