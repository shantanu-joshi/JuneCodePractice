package juneCode100Plus;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 2, 3, 1 };

		// Insertion will basically sort the element in its right position
		//Assume sorting the cards according to their respective positions.

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}

		System.out.println(Arrays.toString(arr));

	}

}




////Dry Run for the above program
//i=1
//j=0
//key = 6
//
//ist iteration : -  5> 6 false 
//2nd iteration 
//i=2;
//j=1;
//key = 2;
//6>2 
//arr[2] = arr[j]  2 ki jagah 6 aaajaaye
//j=0;
//5>2
//arr[1] = 5 aajaye
//
//2  
//2 5 6