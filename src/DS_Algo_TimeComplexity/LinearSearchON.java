package DS_Algo_TimeComplexity;

public class LinearSearchON {
	
	public void printNum() {
		
		int n=100;//o(1)
		//   O(n) o(n) O(n)
		for (int i=0; i<=n;i++) {
		System.out.println(i);	
		}
		// 1+n+n+n = 3n+1 --> linear equation
	}
	
	
	public static boolean findKeyInArray(int arr[], int keyVa) {
		boolean value = false;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==keyVa) {
				value=true;
				index = i;
			}
		}
		
		return value;
	}
	
	
	public static void main(String args[]) {
		int array[]= {1,2,3,4,5,67};
		boolean key= findKeyInArray(array,67);
		
		if (key==true) {
			System.out.println("Value is found in array");
		}
		else {
			System.out.println("Value is not found");
		}
		
	}
	
	
	
	

}
