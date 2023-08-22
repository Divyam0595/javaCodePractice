package DS_Algo_TimeComplexity;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {45,3,98,23,-10,5,99};
		
		selectionSort(arr);
	
	System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	public static void selectionSort(int arr[]) {
		
		
		
		for (int i=0;i<arr.length;i++) {
		
			
			int minIndex=i;
			for (int j=i+1; j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
					
				}
				
				
			}
			
			
			int lowest= arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=lowest;
			
		}
		
		
	}

}
