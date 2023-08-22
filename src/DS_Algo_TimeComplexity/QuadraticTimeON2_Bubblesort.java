package DS_Algo_TimeComplexity;

import java.util.Arrays;

public class QuadraticTimeON2_Bubblesort {

	public static void bubbleSort(int array[]) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 1; j < array.length - i ; j++) {
				if (array[j] > array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 0, 3, 9, 6 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
