package sub_arrays_set_sequence;

import java.util.*;

public class Subsequence {

	static void generateSubsequences(int[] arr, int index,
			ArrayList<Integer> subarray) {

		// Print the subsequences when we reach the end of recursion tree.
		if (index == arr.length) {
			if (subarray.size() > 0) {
				for (int i = 0; i < subarray.size(); i++)
					System.out.print(subarray.get(i) + " ");
				System.out.println();
			} else {
				System.out.println("[]");
			}
		} else {
			// adding the current index into the subsequence and calling the recursive
			// function.
			generateSubsequences(arr, index + 1, subarray);

			subarray.add(arr[index]);

			// not adding the current element into the subsequence.
			generateSubsequences(arr, index + 1, subarray);

			// removing the added index into the subsequence.
			subarray.remove(subarray.size() - 1);
		}
		return;
	}

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3 };
		ArrayList<Integer> subarray = new ArrayList<>();
		System.out.println("All the subsets are: ");
		generateSubsequences(arr, 0, subarray);
	}
}
