.package org.howard.edu.lsp.assignment5;

/**
 * 
 * @author danielle
 *
 */

import org.howard.edu.lsp.assignment4.IntegerSet;

public class Driver {
	

	public static void main(String[] args) {
		
		/**
		 * Create a new, empty list
		 * Check isEmpty, length
		 */
		System.out.println("- Create a new, empty set");
		IntegerSet testSet1 = new IntegerSet();
		if (testSet1.isEmpty() == true) {
			System.out.println("testSet1: " + testSet1.toString());
			System.out.println(" isEmpty works!");
		}
		else {
			System.out.println(" isEmpty is buggin'");
		}
		System.out.println("Length of the empty set: " + testSet1.length());
		if (testSet1.length() ==0) {
			System.out.println(" length works!");
		}
		else {
			System.out.println(" length is buggin'");
		}
		
		System.out.println("");
		
		/**
		 * Add elements to the list
		 * check add, isEmpty, length
		 */
		System.out.println("- Add elements to the set (1, 2, 3, 4, 5, 4)");
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet1.add(4);
		System.out.println("testSet1: " + testSet1.toString());
		if (testSet1.isEmpty() == false) {
			System.out.println(" add, isEmpty work!");
		}
		else {
			System.out.println(" isEmpty or add is buggin'");
		}
		System.out.println("Length of testSet1 : " + testSet1.length());
		if (testSet1.length() == 5) {
			System.out.println(" length works!");
		}
		else {
			System.out.println(" length is buggin'");
		}
		
		System.out.println("");
		
		/**
		 * Clear a list
		 * check clear
		 */
		IntegerSet testSet2 = new IntegerSet();
		testSet2.add(6);
		testSet2.add(7);
		testSet2.add(8);
		testSet2.add(9);
		testSet2.add(10);
		System.out.println("- Clear a set");
		System.out.println("testSet2 before clearing: " + testSet2.toString());
		testSet2.clear();
		System.out.println("testSet2 after clearing: " + testSet2.toString());
		if (testSet2.length() == 0) {
			System.out.println(" clear works!");
		}
		else {
			System.out.println(" clear is buggin'");
		}
		
		System.out.println("");
		
		/**
		 * Check if two sets are equal
		 * check toString, equals
		 */
		IntegerSet testSet3 = new IntegerSet();
		testSet3.add(1);
		testSet3.add(2);
		testSet3.add(3);
		testSet3.add(4);
		testSet3.add(5);
		System.out.println("- Check if two sets are equal");
		System.out.println("testSet1: " + testSet1.toString());
		System.out.println("testSet3: " + testSet3.toString());
		if (testSet1.equals(testSet3)) {
			System.out.println(" toString, equals work!");
		}
		else {
			System.out.println(" toString or equals is buggin'");
		}
		System.out.println("testSet1: " + testSet1.toString());
		System.out.println("testSet2: " + testSet2.toString());
		if (testSet1.equals(testSet2)) {
			System.out.println(" toStringo r equals is buggin'");
		}
		else {
			System.out.println(" toString, equals work!");
		}
		
		System.out.println("");
		
		/**
		 * Check if the set contains a value
		 * check contains
		 */
		System.out.println("testSet1: " + testSet1.toString());
		System.out.println("testSet3: " + testSet3.toString());
		if (testSet1.contains(0)) {
			System.out.println("  contains fails");
		}
		else {
			System.out.println(" testSet1 does not contain 0");
			System.out.println("  contains works!");
		}
		if (testSet1.contains(5)) {
			System.out.println(" testSet1 contains 1");
			System.out.println("  contains works!");
		}
		else {
			System.out.println("  contains fails");
		}
		if (testSet3.contains(30)) {
			System.out.println("  contains fails");
		}
		else {
			System.out.println(" testSet3 does not contain 3");
			System.out.println("  contains works!");
		} 
		
		System.out.println("");
		
		/**
		 * Find the largest and smallest value in a set
		 * testing largest, smallest
		 */
		System.out.println("- Finding the largest and smallest in each set");
		System.out.println("testSet1: " + testSet1.toString());
		System.out.println("testSet2: " + testSet2.toString());
		System.out.println("testSet3: " + testSet2.toString());
		try {
			System.out.println(" Largest in testSet1: " + testSet1.largest());
			System.out.println("  largest works!");
		}
		catch (IntegerSetException EmptyError){
			System.out.println(" testSet1: " +EmptyError.getMessage());
		}
		
		try {
			System.out.println(" Largest in testSet2: " + testSet2.largest());
		}
		catch (IntegerSetException EmptyError){
			System.out.println(" testSet2: " +EmptyError.getMessage());
			System.out.println("  largest works!");
			
		}
		try {
			System.out.println(" Largest in testSet3: " + testSet3.largest());
			System.out.println("  largest works!");
		}
		catch (IntegerSetException EmptyError){
			System.out.println(" testSet3: " + EmptyError.getMessage());
		}
		
		
		try {
			System.out.println(" Smallest in testSet1: " + testSet1.smallest());
			System.out.println("  smallest works!");
		}
		catch (IntegerSetException EmptyError){
			System.out.println(" testSet1: " +EmptyError.getMessage());
		}
		
		try {
			System.out.println(" Smallest in testSet2: " + testSet2.smallest());
		}
		catch (IntegerSetException EmptyError){
			System.out.println(" testSet2: " +EmptyError.getMessage());
			System.out.println("  smallest works!");
			
		}
		try {
			System.out.println(" Smallest in testSet3: " + testSet3.largest());
			System.out.println("  smallest works!");
		}
		catch (IntegerSetException EmptyError){
			System.out.println(" testSet3: " + EmptyError.getMessage());
		}
		
		
		System.out.println("");
		
		/**
		 * remove an item from the set
		 */
		System.out.println("- Removing an element from a set");
		System.out.println("testSet1 before removing 5: " + testSet1.toString());
		testSet1.remove(5);
		System.out.println("testSet1 after removing 5: " + testSet1.toString());
		if (testSet1 == testSet3) {
			System.out.println(" remove failed");
		}
		else {
			System.out.println(" remove works!");
		}
		
		/**
		 * Finding the union of two sets
		 */
		
		System.out.println("");
		
		IntegerSet testSetA = new IntegerSet();
		testSetA = testSet1;
		IntegerSet testSetB = new IntegerSet();
		testSetB.add(13);
		testSetB.add(4);
		testSetB.add(100);
		testSetB.add(4);
		IntegerSet testSetC = new IntegerSet();
		testSetC = testSet3;
		IntegerSet testSetD = new IntegerSet();
		
		System.out.println("- Finding the union of 2 sets");
		System.out.println("testSetA: " + testSetA.toString());
		System.out.println("testSetB: " + testSetB.toString());
		System.out.println("testSetC: " + testSetC.toString());
		System.out.println("testSetD: " + testSetD.toString());
	
		testSetA.union(testSetB);
		System.out.println("The union of testSetA and testSetB is: " + testSetA.toString());
		
		testSetC.union(testSetD);
		System.out.println("The union of testSetC and testSetD is: " + testSetC.toString());
		
		System.out.println("");
		
		/**
		 * Finding the intersection of 2 sets
		 */
		
		System.out.println("- Finding the intersection of 2 sets");
		IntegerSet testSetM = new IntegerSet();
		testSetM.add(0);
		testSetM.add(7);
		testSetM.add(14);
		testSetM.add(21);
		testSetM.add(28);
		
		IntegerSet testSetN = new IntegerSet();
		testSetN.add(0);
		testSetN.add(7);
		testSetN.add(14);
		testSetN.add(21);
		testSetN.add(28);
		
		IntegerSet testSetP = new IntegerSet();
		testSetP.add(1);
		testSetP.add(2);
		testSetP.add(3);
		testSetP.add(5);
		
		IntegerSet testSetQ = new IntegerSet();
		testSetQ.add(1);
		testSetQ.add(2);
		testSetQ.add(3);
		testSetQ.add(9);
		testSetQ.add(0);
		
		System.out.println("testSetM: " + testSetM.toString());
		System.out.println("testSetN: " + testSetN.toString());
		System.out.println("testSetP: " + testSetP.toString());
		System.out.println("testSetQ: " + testSetQ.toString());
		
		testSetM.intersect(testSetN);
		System.out.println("The intersection of testSetM and testSetN is: " + testSetM.toString());
		
		testSetP.intersect(testSetQ);
		System.out.println("The intersection of testSetP and testSetQ is: " + testSetP.toString());
		
		/**
		 * Finding the difference between 2 sets
		 */
		
		System.out.println("");
		System.out.println("- Finding the difference between 2 sets");
		
		IntegerSet testSetW = new IntegerSet();
		testSetW.add(1);
		testSetW.add(2);
		testSetW.add(3);
		testSetW.add(9);
		testSetW.add(0);
		
		IntegerSet testSetX = new IntegerSet();
		testSetX.add(7);
		testSetX.add(14);
		testSetX.add(21);
		testSetX.add(28);
		
		IntegerSet testSetY = new IntegerSet();
		testSetY.add(0);
		testSetY.add(1);
		testSetY.add(2);
		testSetY.add(3);
		
		IntegerSet testSetZ = new IntegerSet();
		testSetZ.add(0);
		testSetZ.add(1);
		testSetZ.add(2);
		testSetZ.add(3);
		
		System.out.println("testSetW: " + testSetW.toString());
		System.out.println("testSetX: " + testSetX.toString());
		System.out.println("testSetY: " + testSetY.toString());
		System.out.println("testSetZ: " + testSetZ.toString());
		
		testSetW.diff(testSetX);
		System.out.println("The difference between testSetW and testSetX is: " + testSetW.toString());
		
		testSetY.diff(testSetZ);
		System.out.println("The difference between testSetY and testSetZ is: " + testSetZ.toString());
		
		
		

	}

}
