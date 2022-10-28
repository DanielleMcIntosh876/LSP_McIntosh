package org.howard.edu.lsp.midterm.problem1;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class VotingMachineTest {
	
	public HashMap <String,Integer> Votes = new HashMap<String,Integer>(); //key is a string, value is an integer
	
	/**
	 * 
	 * @Test
	@DisplayName("Test getVotes")
	 * @throws UnknownCandidateException
	 *
	 */
	@Test
	@DisplayName("Test getVotes")
	public void getVotesTest() throws UnknownCandidateException {
		VotingMachine machine1 = new VotingMachine();
		
		machine1.addCandidate("Danielle");
		int test1 = machine1.getVotes("Danielle");
		assertEquals(test1, 0);
		
		machine1.addCandidate("Bob");
		machine1.castVotes("Bob", 10);
		int test2 = machine1.getVotes("Bob");
		assertEquals(test2, 10);
		
		
		try {
			int test3 = machine1.getVotes("Marissa");
			assertThrows(UnknownCandidateException.class, () -> machine1.getVotes("Marissa"));
		}
		catch (UnknownCandidateException exc){
			System.out.println(exc.getMessage());
		}
		
	}
	/**
	 * @Test
	@DisplayName("Test sum")
	 */
	@Test
	@DisplayName("Test sum")
	public void sumTest() {
		VotingMachine machine2 = new VotingMachine();
		
		machine2.addCandidate("Dana");
		int test4 = machine2.sum();
		assertEquals(0, test4);
		
		machine2.addCandidate("Marcus");
		machine2.castVotes("Marcus", 5);
		int test5 = machine2.sum();
		assertEquals(5,test5);
		
		machine2.addCandidate("Jacob");
		machine2.castVotes("Jacob", 3);
		int test6 = machine2.sum();
		assertEquals(8, test6);
	}
	
	

}
