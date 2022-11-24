/**
 * 
 */
package org.howard.edu.lsp.assignment7;
import java.util.*;

/**
 * @author danielle
 *
 */

/*
 * Driver public class
 */
public class Driver {
	public static void main(String[] args) {
		List <Integer> grades = new ArrayList<>();
		grades.add(85);
		grades.add(75);
		grades.add(20);
		grades.add(100);
		grades.add(100);
		
		FindAverage Average1 = new FindAverage();
		int test1 = 0;
		try {
			test1 = Average1.compute(grades);
			System.out.println("Average should be: 76");
			System.out.println("Average from FindAverage: " + test1);
		}catch (EmptyListException exc) {
			exc.printStackTrace();
		}
		
		FindAverageDropTwoLowest Average2 = new FindAverageDropTwoLowest();
		int test2 = 0;
		try {
			test2 = Average2.compute(grades);
			System.out.println("Average should be: 95");
			System.out.println("Average from FindAverageDropTwoLowest: " + test2);
		}catch (EmptyListException exc) {
			exc.printStackTrace();
		}
	}

}
