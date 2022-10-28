package org.howard.edu.lsp.midterm.problem1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.howard.edu.lsp.assignment5.IntegerSetException;

/**
 * 
 * @author danielle
 *
 */

public class VotingMachine {
	/**
	 * Hash Maps with candidate_name and candidate_votes
	 */
	public HashMap <String,Integer> Votes = new HashMap<String,Integer>(); //key is a string, value is an integer
	
	/**
	 * Default Constructor
	 */
	public VotingMachine() {
	};
	
	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		// String candidate_name = "";
		// int candidate_votes = 0;
		Votes.put(name, 0); //adding a new entry to the HashMap
	}
	
	public void castVotes(String name, int votes) {
		// Cast votes to the candidate with the given name
		int current_votes = Votes.get(name);
		current_votes += votes;
		Votes.put(name,current_votes);
	}
	
	public int getVotes(String name)  throws UnknownCandidateException {
		// Throws UnknownCandidateException if name not present.   
		if (Votes.containsKey(name) == false) {
			throw new UnknownCandidateException("Candidate does not exist");
		}
		else {
			// Make this a checked exception.
			// Return the number of votes for a given candidate. 
			return Votes.get(name);
		} 

	}

	public int sum() {
		// Return the total number of votes for all candidates.	
		int sum_votes = Votes.values().stream().mapToInt(Integer::intValue).sum();
		return sum_votes;	
	}

	

}
