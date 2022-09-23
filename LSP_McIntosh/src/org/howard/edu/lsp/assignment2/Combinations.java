package org.howard.edu.lsp.assignment2;

public class Combinations {
	public combinationSum(int[] int_array, int target){
		if (int_array == null) {
			return null;
		}
		
		List<List<Integer>> result = new ArrayList<>();
		
		findCOmbinations(int_array, 0, target, new ArrayList<>(), result);
		
		return result;
	}
	
	public void findCOmbinations(int[] int_array, int index, int target, List<Integer> current, List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		for (int i = index; i < candidates.length; i++) {
			if (int_array[i] <= target) {
				current.add(int_array[i]);
				findCombinates(int_array, i, target-int_array[i], current, result);
				current.remove(new Integer(int_array[i]));
			}
		}
	}

}


