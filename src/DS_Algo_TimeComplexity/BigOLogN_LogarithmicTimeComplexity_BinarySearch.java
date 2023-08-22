package DS_Algo_TimeComplexity;

public class BigOLogN_LogarithmicTimeComplexity_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,5,6,7};
		int val= BinarySearch(arr,7);				
		System.out.println(val);
		
	}
	
	//Always works on sorted array
	//log(n)
	
	public static int BinarySearch(int arr[], int exp) {	
		int low=0;//0
		int high=arr.length-1;//5
		while(low<=high) {
			int mid = (low+high)/2;//3
			if (arr[mid]==exp) {
				return mid;
			}
			else if(arr[mid]<exp) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}	
		}	
		return -1;
	}
}
