package DS_Algo_TimeComplexity;

import java.util.Arrays;

public class InsertionSortingAlgorith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {8,4,9,3,54,1,-5};
		
		insertionSort(arr);

	}
	
	
	public static void insertionSort(int arr[]) {
		

		
		for(int i=1;i<arr.length;i++) {
			
			int current =arr[i]; 
			
			int j=i-1;
			
			
			while (j>=0&& arr[j]>current) {
				
				arr[j+1]=arr[j];
				
				j--;
				
			}
			
			arr[j+1]=current;
			
			System.out.println(Arrays.toString(arr));
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
