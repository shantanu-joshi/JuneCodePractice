package juneCode100Plus;

import java.util.Arrays;

public class MergeSort {

	public static void conquer(int arr[], int si, int mid, int ei) {
		int merge[] = new int[ei - si + 1];
		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;

		// Sorting the tow sorted arrays and merging them
		// conquer step
		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] <= arr[idx2]) {
				merge[x++] = arr[idx1++];
			} else {
				merge[x++] = arr[idx2++];
			}
		}

		// While lopp for remaining which are left to compared
		while (idx1 <= mid) {
			merge[x++] = arr[idx1++];
		}

		// While loop for second part which are left to compared
		while (idx2 <= ei) {
			merge[x++] = arr[idx2++];

		}
		// copying sorted array
		for (int i = 0, j = si; i < merge.length; i++, j++) {
			arr[j] = merge[i];
		}
	}

	public static void divide(int arr[], int si, int ei) {

		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2; // this step will reduce space issues in some other code editotrs , when si and
										// ei are very big  in terms of integer limit
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	public static void main(String[] args) {

		int arr[] = { 6, 3, 9, 2, 5, 8, 2 };
		int n = arr.length;
		divide(arr, 0, n - 1);

		System.out.println(Arrays.toString(arr));

	}
}
