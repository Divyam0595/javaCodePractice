package DS_Algo_TimeComplexity;

public class ConstantTimeO1 {
//All the line will be executed only once as no loops so Time complexity is O(1)
	public static int sum(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

	public static void main(String args[]) {
		int d = sum(10, 20);
		System.out.println(d);

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(arr[3]);

	}
}
