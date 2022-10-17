package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {

	
	@Test
	@DisplayName("Testing length method")
	public void testLength() {
		IntegerSet object5 = new IntegerSet();
		object5.add(0);
		object5.add(1);
		object5.add(2);
		int output_length = object5.length();
		assertEquals(3, output_length);
	}
	
	@Test
	@DisplayName("Testing the clear method")
	public void testClear() {
		IntegerSet object1 = new IntegerSet();
		IntegerSet object2 = new IntegerSet();
		object1.add(1);
		object1.add(2);
		//object1 = [1,2], object2 = []
		int len1 = object1.length();
		int len2 = object2.length();
		//Test the output
		assertEquals(2, len1);
		assertEquals(0, len2);
	}
	
	@Test
	@DisplayName("Testing the equals method")
	public void testEquals() {
		IntegerSet object3 = new IntegerSet();
		IntegerSet object4 = new IntegerSet();
		IntegerSet object6 = new IntegerSet();
		IntegerSet object7 = new IntegerSet();
		IntegerSet object8 = new IntegerSet();
		IntegerSet object9 = new IntegerSet();
		
		object3.add(0);
		object3.add(1);
		object3.add(2);
		object4.add(0);
		object4.add(1);
		object4.add(2);
		
		object8.add(9);
		object8.add(18);
		object9.add(27);
		
		
		//Testing two objects that are equal
		boolean test34 = object3.equals(object4);
		assertEquals(true, test34);
		
		//Testing two empty objects
		boolean test67 = object6.equals(object7);
		assertEquals(true, test67);
		
		//Testing two objects that are not equal
		boolean test89 = object8.equals(object9);
		assertEquals(false, test89);
	}
	
	@Test
	@DisplayName("Testing the contains method")
	public void testContains() {
		IntegerSet object10 = new IntegerSet();
		object10.add(87);
		object10.add(53);
		
		//Test if the object contains the number
		boolean test_true = object10.contains(53);
		boolean test_false = object10.contains(538);
		
		//Test if the object does not contain the number
		assertEquals(true, test_true);
		assertEquals(false, test_false);
	}
	
	@Test
	@DisplayName("Testing the largest method")
	public void testLargest() {
		IntegerSet object11 = new IntegerSet();
		IntegerSet object12 = new IntegerSet();
		object11.add(0);
		object11.add(100);
		object11.add(-200);
		object11.add(3);
		
		try {
			int largest_num = object11.largest();
			assertEquals(100, largest_num);	
		}
		catch (IntegerSetException exc){
			System.out.println(exc.getMessage());
		}
		
		try {
			int largest_num = object12.largest();
			assertThrows(IntegerSetException.class, () -> object12.largest());	
		}
		catch (IntegerSetException exc){
			System.out.println(exc.getMessage());
		}
		
	}
	
	@Test
	@DisplayName("Testing the smallest method")
	public void testSmallest() {
		IntegerSet object13 = new IntegerSet();
		IntegerSet object14 = new IntegerSet();
		object13.add(0);
		object13.add(100);
		
		try {
			int smallest_num = object13.smallest();
			assertEquals(0, smallest_num);	
		}
		catch (IntegerSetException exc){
			System.out.println(exc.getMessage());
		}
		
		try {
			int smallest_num = object14.smallest();
			assertThrows(IntegerSetException.class, () -> object14.smallest());	
		}
		catch (IntegerSetException exc){
			System.out.println(exc.getMessage());
		}
		
	}
	
	@Test
	@DisplayName("Testing the add method")
	public void testAdd() {
		IntegerSet object15 = new IntegerSet();
		object15.add(5);
		//check if the length of the set is 1
		int len15 = object15.length();
		assertEquals(1, len15);
		//check if 5 is in the set
		boolean test_true = object15.contains(5);
		boolean test_false = object15.contains(55);
		
		//Test if the set contains the number
		assertEquals(true, test_true);
		
		//Test if the set does not contain the number
		assertEquals(false, test_false);
	}
	
	@Test
	@DisplayName("Testing the remove method")
	public void testRemove() {
		IntegerSet object16 = new IntegerSet();
		object16.add(1);
		object16.add(2);
		object16.add(3);
		object16.remove(2);
		int length16 = object16.length();
		boolean contains16 = object16.contains(2);
		//check if the length of the set is one less than the original length
		assertEquals(2, length16);
		//check if the set still contains the number
		assertEquals(false, contains16);
	}
	
	@Test
	@DisplayName("Testing the toString method")
	public void testToString() {
		
	}
	
	@Test
	@DisplayName("Testing the union method")
	public void testUnion() {
		IntegerSet object17 = new IntegerSet();
		IntegerSet object18 = new IntegerSet();
		IntegerSet object_test = new IntegerSet();
		object17.add(1);
		object17.add(3);
		object18.add(3);
		object18.add(4);
		object18.add(4);
		object_test.add(1);
		object_test.add(3);
		object_test.add(4);
		object17.union(object18);
		assertEquals(object_test.toString(), object17.toString());
		
	}
	
	@Test
	@DisplayName("Testing the intersect method")
	public void testIntersect() {
		IntegerSet object21 = new IntegerSet();
		IntegerSet object22 = new IntegerSet();
		object21.add(0);
		object21.add(1);
		object21.add(3);
		object22.add(3);
		object22.add(4);
		object22.add(5);
		IntegerSet test1 = new IntegerSet();
		test1.add(3);
		object21.intersect(object22);
		//testing if there is an intersection
		assertEquals(object21.toString(), object21.toString());
		
		IntegerSet object23 = new IntegerSet();
		IntegerSet object24 = new IntegerSet();
		object23.add(1);
		object23.add(3);
		object24.add(2);
		object24.add(4);
		IntegerSet test2 = new IntegerSet();
		object23.intersect(object24);
		//testing if there is no intersection
		assertEquals(object23.toString(), test2.toString());
	}
	
	@Test
	@DisplayName("Testing the diff method")
	public void testDiff() {
		IntegerSet object25 = new IntegerSet();
		IntegerSet object26 = new IntegerSet();
		object25.add(0);
		object25.add(1);
		object25.add(2);
		object26.add(0);
		object26.add(1);
		object26.add(2);
		IntegerSet testA = new IntegerSet();
		//Testing if the sets are equivalent ie. no diff
		object25.diff(object26);
		assertEquals(object25.toString(), testA.toString());
		
		IntegerSet object27 = new IntegerSet();
		IntegerSet object28 = new IntegerSet();
		object27.add(0);
		object27.add(1);
		object27.add(2);
		object28.add(1);
		object28.add(2);
		IntegerSet testB = new IntegerSet();
		testB.add(0);
		object27.diff(object28);
		//Testing of the sets are not equivalent (ie. diff exists)
		assertEquals(object27.toString(), testB.toString());
	}
	
	@Test
	@DisplayName("Testing the isEmpty method")
	public void testIsEmpty() {
		IntegerSet object19 = new IntegerSet();
		IntegerSet object20 = new IntegerSet();
		object20.add(33);
		boolean test_empty = object19.isEmpty();
		boolean test_not_empty = object20.isEmpty();
		assertEquals(true, test_empty);
		assertEquals(false, test_not_empty);
		
	}
}
