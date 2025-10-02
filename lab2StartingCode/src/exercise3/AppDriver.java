package exercise3;

import java.util.Random;

/****
 * @author Mona
 * @since 2025
 * @version 1.0
 */

public class AppDriver
{

	public static final int SIZE = 10;
	public static final int UPPER_BOUND = 100;

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		
		System.out.println("***** BEFORE SORTING *****");

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
			System.out.println( nums[i] );
		}
		
		quickSort(nums, 0, nums.length - 1);
		
		System.out.println(" **** After Sorting *****");
		for(int i = 0; i < SIZE; i++) {
			System.out.println(nums[i]);
		}
}
	 /**
     * QUICKSORT Algorithm
     * Divide-and-conquer: pick pivot, partition, recursively sort
     * Time Complexity: O(n log n) average, O(n²) worst
     * Space Complexity: O(log n) due to recursion
     */
	public static void quickSort(Integer[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int pivotIndex = partition(arr, low, high);
		
		quickSort(arr, low, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, high);
		
	}
	
	/**
     * Partition helper method for QuickSort
     * Rearranges array so elements < pivot are left, elements > pivot are right
     * Returns: final position of pivot
	 * @return 
     */
	
	public static int partition(Integer[] arr, int low, int high) {
		
		// choose end index element as pivot
		Integer pivot = arr[high];
		
		// index for smaller element, initial location should before low
		int i = low - 1;
		
		// traverse and rearrange elements
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
			i++;
			
			// swap element
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
		// place pivot in correct position
		int temp2 = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp2;
		
		return i + 1;
		
}
	
	
	
}
