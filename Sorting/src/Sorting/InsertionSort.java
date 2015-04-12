package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			
			int temp = a[i];
			int j;
			
			for (j = i - 1; j >= 0 && temp < a[j]; j--) {
				a[j+1] = a[j]
			}
			
			a[j+1] = temp
		}
		return null;
	}
}
