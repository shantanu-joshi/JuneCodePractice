package juneCode100Plus;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 6, 7, 7, 8, 3, 4 };

		for (int i = 0; i < arr.length; i++) {

			// ist pass will place the bigger element at the last

			// To avoid iterating to last every time, we can iterate size-i as the last
			// places are already sorted
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		System.out.println("Sorted Array is :");
		System.out.println(Arrays.toString(arr));

	}

}
