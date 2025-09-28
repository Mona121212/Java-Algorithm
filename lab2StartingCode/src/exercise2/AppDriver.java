package exercise2;

import java.util.Random;
import java.util.Scanner;

/**
 * AppDriver class implements a binary search algorithm on a sorted array of 
 * cumulative integers generated randomly
 * 
 * This program generates a sorted array by creating cumulative sums of random numbers,
 * then allows the user to search for a specific value using binary search.
 * 
 * @author Mona
 * @version 1.0
 * @since 2025
 
 */

public class AppDriver
{
	/**the size of the array to be generated*/
	public static final int SIZE = 100;
	
	/**the upper bound (exclusive) for random number generation*/
	public static final int UPPER_BOUND = 10;
	
	/**
	 * Main method that executes the program
	 * generates a sorted array of cumulative integers, prompts user for input,
	 * and performs binary search to find the target value.
	 * */
	public static void main( String[] args )
	{
		// generate the sorted array of cumulative sums
		Integer[] nums = new Integer[SIZE];    // create an array with size is 100
		Random rand = new Random();   //create random number
		int randnum = rand.nextInt( UPPER_BOUND );   // product 0-9 random number
		nums[0] = randnum;    // the first one
		
		/**System.out.println( "Generated sorted array: ");
		System.out.println(nums[0]);*/
		
		// generate remaining elements as cumulative sums
		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}
		
		// get target value from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter a target value to search for: ");
		int target = scanner.nextInt();
		
		int result = binarySearch(nums, target);
		
		if(result == -1) {
			System.out.print("not found in the array");
		} else {
			System.out.print("Target " + target + " found at index: " + result);
			System.out.print(" Value at index " + result + ": " + nums[result]);
		}
		
		scanner.close();
	}
	
	
	
	public static int binarySearch(Integer[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int mid =  (right + left) / 2;
			
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
