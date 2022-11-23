/**
 * 
 */
package org.howard.edu.lsp.assignment7;
import java.util.*;

/**
 * @author danielle
 *
 */
public class Driver {
	public static void main(String[] args) {
		List <Integer> grades = new ArrayList<>();
		grades.add(81);
		grades.add(97);
		grades.add(17);
		grades.add(95);
		grades.add(100);
		grades.add(97);
		
		FindAverage Average1 = new FindAverage();
		try {
			Average1.compute(grades);
		}catch (EmptyListException exc) {
			exc.printStackTrace();
		}
		FindAverageDropTwoLowest Average2 = new FindAverageDropTwoLowest();
		try {
			Average2.compute(grades);
		}catch (EmptyListException exc) {
			exc.printStackTrace();
		}
	}

}
