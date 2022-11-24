/**
 * 
 */
package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;


/**
 * @author danielle
 *
 */
/*
 * TestAverage
 */
class TestAverage {
	List <Integer> grades = new ArrayList<>();
	/*
	 * TestFindAverage
	 */
	@Test
	@DisplayName("Test FindAverage")
	void testFindAverage() {
		FindAverage tester1 = new FindAverage();
		int test1 = 0;
		grades.add(100);
		grades.add(90);
		grades.add(95);
		grades.add(75);
		try {
			test1 = tester1.compute(grades);
		}catch (EmptyListException exc){
			exc.printStackTrace();
		}
		assertEquals(test1, 90);
	}
	
	/*
	 * Test Find Average DropTwoLowest
	 */
	@Test
	@DisplayName("Test FindAverageDropTwoLowest")
	void testFindAverageDropTwoLowest() {
		FindAverageDropTwoLowest tester2 = new FindAverageDropTwoLowest();
		int test2 = 0;
		grades.add(0);
		grades.add(85);
		grades.add(65);
		grades.add(15);
		try {
			test2 = tester2.compute(grades);
		}catch (EmptyListException exc){
			exc.printStackTrace();
		}
		assertEquals(test2, 75);
	}
	
	/*
	 * Test FindAverageDropTwoLowest when there are only tow grades in the list
	 */
	@Test
	@DisplayName("Test findAverageDropTwoLowest (list of two should raise EmptyListException)")
	void testFindAverageDropTwoLowestOnlyTwo() {
		FindAverageDropTwoLowest tester3 = new FindAverageDropTwoLowest();
		int test3 = 0;
		grades.add(0);
		grades.add(100);
		try {
			test3 = tester3.compute(grades);
		}catch (EmptyListException exc){
			exc.printStackTrace();
		}
	}
	
	/*
	 * Test FindAverage with an empty list.
	 * Should raise and EmptyListException
	 */
	@Test
	@DisplayName("Test FindAverage (EmptyList)")
	void testFindAverageEmptyList() {
		FindAverage testEmpty1 = new FindAverage();
		try {
			testEmpty1.compute(grades);
		}
		catch (EmptyListException exc) {
			exc.printStackTrace();
		}
	}
	
	/*
	 * Test FindAverageDropTwoLowest with an empty list
	 * Should raise an EmptyListexception
	 */
	@Test
	@DisplayName("Test FindAverageDropTwoLowest (EmptyList)")
	void testFindAverageDropTwoLowestEmptyList() {
		FindAverageDropTwoLowest testEmpty2 = new FindAverageDropTwoLowest();
		try {
			testEmpty2.compute(grades);
		}
		catch (EmptyListException exc) {
			exc.printStackTrace();
		}
	}

}
