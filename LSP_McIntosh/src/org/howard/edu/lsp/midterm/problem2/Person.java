package org.howard.edu.lsp.midterm.problem2;
import java.util.Arrays;

/**
 * 
 * @author danielle
 *
 */

class Person {
	private String name; 
	private String socialSecurityNumber;
	private int age; 

	public Person(String name,  String socialSecurityNumber, int age) {
		// initialize private variables
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.age = age;
	}
		
	//override the default implementation of the toString() method and return the person’s name, age and social security number. (5 pts.)
	public String toString() {
		String return_value = "Name: " + name + ", " + "SSN: " + socialSecurityNumber + ", " + "Age: " + age;
		return return_value;
	}
	
	//override the default implementation of the equals(Object) method.  
	//Two Person instances are equal if their social security numbers are the same. 
	public String equals(Person p2) {
		char social_p1[] = this.socialSecurityNumber.toCharArray();
		char social_p2[] = p2.socialSecurityNumber.toCharArray();
		
		int i = 0;
		while (i < 10) {
			if (social_p1[i] != social_p2[i]) {
				return "Not the same!";
			}
		}
		return "These are the same!";
	}
	public String getName() {
		return this.name;
	}
	
	public String getSSN() {
		return this.socialSecurityNumber;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
}
