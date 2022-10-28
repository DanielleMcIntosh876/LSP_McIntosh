package org.howard.edu.lsp.midterm.problem2;

/**
 * 
 * @author danielle
 *
 */

public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person("Danielle","123-45-6789",19);
		System.out.println("TEST CONSTRCUCTOR: ");
		System.out.println("Should be: Name: Danielle, SSN: 123-45-6789, Age: 19");
		System.out.println("           " + "Name: " + p1.getName() + ", SSN: " + p1.getSSN() + ", Age: " + p1.getAge());
		
		System.out.println("");
		
		Person p2 = new Person("Ben","393-39-3020",77);
		System.out.println("TEST toString: ");
		System.out.println("Should be: Name: Ben, SSN: 393-39-3020, Age: 77");
		System.out.println("           " + p2.toString());
		
	}

}
