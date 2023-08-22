package DS_Algo_TimeComplexity;

public class CubictimeON3_MultivariableEquation {

	
	
	public static void multiEquation(int max, int exp) {
		
		for (int i=0;i<max;i++) {
			for (int j=0;j<max;j++) {
				for (int k=0;k<max;k++) {
					if(3*i+9*j+8*k==exp) {
						System.out.println(i+","+j+","+k );
					}
					
				}
			}
		}
		
		//(1+n+n)(1+n+n+n)(1+n+n+n)= o(n^3)
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	multiEquation(1000,79);

	}

}
