package sub_arrays_set_sequence;
//Now, a subset is nothing but any possible combination of the original array (or a set). We can have 2^(size of the array) i.e. 2^n subsets of an array.

public class Subsets {

	static void generateSubsets(int arr[], int n) {
		// calculating the power set for the array.
		long powerSet = (long) Math.pow(2, n);

		// Running a counter loop form 0 to to powerSet.
		for (int counter = 0; counter < powerSet; counter++) {
			for (int i = 0; i < n; i++) {
				// if the i-th bit is set then print the i-th element
				if ((counter & (1 << i)) > 0)
					System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3,4,5 };
		System.out.println("All the subsets are: ");
		generateSubsets(arr, arr.length);
	}
}
