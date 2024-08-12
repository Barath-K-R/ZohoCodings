package sub_arrays_set_sequence;
//As we know, a subarray is a slice of the contiguous memory locations of the array. So, we can have n * (n+1)/2 non-empty subarrays of an array.
public class Subarrays {

	static void generateSubArrays(int arr[], int n) {
		// Picking one element in each outer loop
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				/*
				Printing the subarrays between the current starting point i.e. i and the current
				ending point i.e. j
				*/
				for (int k = i; k <= j; k++)
					System.out.print(arr[k] + " ");

				System.out.println();
			}
		}
	}

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3,4,5 };
		System.out.println("All the subarrays are: ");
		generateSubArrays(arr, arr.length);
	}
}
