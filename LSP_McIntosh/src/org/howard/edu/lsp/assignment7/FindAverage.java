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
 * FindAverage class implements AveragStrategy
 * Finds the average grade
 */
public class FindAverage implements AverageStrategy{
	@Override
	/*
	 * Compute finds the Average of the list of grades
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		/*
		 * Raises an EmptyListException if the list is empty
		 */
		if (grades.size() == 0) {
			throw new EmptyListException("The set is empty. Operation cannot be performed.");
		}
		IntSummaryStatistics averageGradesList = grades.stream().mapToInt((a)->a).summaryStatistics();
		int averageGrade = (int) averageGradesList.getAverage();
		return averageGrade;
	}

}
