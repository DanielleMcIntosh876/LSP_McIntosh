package org.howard.edu.lsp.assignment7;
import java.util.List;
import org.howard.edu.lsp.assignment7.EmptyListException;

/*
 * AverageStrategy public interface
 */
public interface AverageStrategy {
	public int compute(List<Integer>grades) throws EmptyListException;

}
