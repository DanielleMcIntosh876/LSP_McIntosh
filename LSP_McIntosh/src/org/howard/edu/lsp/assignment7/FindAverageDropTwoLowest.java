/**
 * 
 */
package org.howard.edu.lsp.assignment7;
import org.howard.edu.lsp.assignment7.EmptyListException;
import java.util.*;

/**
 * @author danielle
 *
 */

/*
 * FindAverageDropTwoLowest Class
 */
public class FindAverageDropTwoLowest implements AverageStrategy{
	@Override
	/*
	 * Compute throws an EmptyListException if the set is either empty or too short.
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.size() == 0) {
			throw new EmptyListException("The set is empty. Operation cannot be performed.");
		}
		if (grades.size() <= 2) {
			throw new EmptyListException("The set is too short (set<=2). Operation cannot be performed.");
		}
		/*
		 * Sort the grades in ascending order
		 */
		Collections.sort(grades);
		/*
		 * Remove the two lowest grades
		 */
		grades.remove(0);
		grades.remove(0);
		IntSummaryStatistics averageGradesList = grades.stream().mapToInt((a)->a).summaryStatistics();
		int averageGrade = (int) averageGradesList.getAverage();
		return averageGrade;
	}

}
