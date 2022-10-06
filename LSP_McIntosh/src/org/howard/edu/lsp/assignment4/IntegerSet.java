package org.howard.edu.lsp.assignment4;
/**
 * 
 * @author Danielle McIntosh
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSet {
	/**
	 * Integer Array List
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	// Default Constructor
	public IntegerSet() {
	};
	
	/**
	 * clear the internal representation of the set
	 */
	public void clear() {
		set = new ArrayList<Integer>();
	};

	/**
	 * Returns the length of the set
	 */
	public int length() {
		int setLength = set.size();
		return setLength;
	};
	
	/*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */
	public boolean equals(IntegerSet b) {
		if (this.length() == b.length()) {
			for (int i = 0; i < set.size(); i++) {
				if (!b.contains(set.get(i))) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Returns true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == value) {
				return true;
			}
		}
		return false;
	};
	
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	 */
	public int largest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("IntegerSet is empty!");
		}
		int largestValue = 0;
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) >= largestValue) {
				largestValue = set.get(i);
			}
		}
		return largestValue;
		
	};
	
	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		if (set.size() == 0) {
			throw new IntegerSetException("IntegerSet is Empty");
		}
		int smallestValue = set.get(0);
		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) <= smallestValue) {
				smallestValue = set.get(i);
			}
		}
		return smallestValue;
	}

	
	/**
	 * Adds an item to the set or does nothing it already there	
	 */
	public void add(int item) {
		if (!this.contains(item)) {
			set.add(item);
		}
	};
	
	/**
	 * Removes an item from the set or does nothing if not there
	 */
	public void remove(int item) {
		if (this.contains(item)) {
			set.removeAll(Arrays.asList(item));
		}
	};
	
	/**
	 * returns all elements
	 */
	public List<Integer> getAllElements(){
		return set;
	}
	
	/**
	 * Set union
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> setB = intSetb.getAllElements();
		for (int i = 0; i < setB.size();i++) {
			if (!this.contains(setB.get(i))) {
				this.add(setB.get(i));
			}
		}
		
	};
	
	/**
	 * Set Intersection
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> setB = intSetb.getAllElements();
		List<Integer> newSet = new ArrayList<Integer>();
		for (int i = 0; i < setB.size(); i++) {
			if (this.contains(setB.get(i))) {
				newSet.add(setB.get(i));
			}
		}
		set = newSet;
	};
	
	/**
	 * Set difference, i.e., s1 –s2
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> setB = intSetb.getAllElements();
		set.removeAll(setB);
	};
	
	/**
	 * Returns true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		if (this.length() == 0) {
			return true;
		}
		return false;
	};
	
	/*
	 * Converts the set value to a string value
	 */
	
	public String toString() {
		String stringList = set.toString();
		return stringList;
	};
	
}
