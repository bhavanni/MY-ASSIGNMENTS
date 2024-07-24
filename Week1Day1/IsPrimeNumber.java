package Week1Day1;

public class IsPrimeNumber {
	

		  public static void main(String[] args) {
				int n=5;
				System.out.println("The Given Number is:"+n);
		int c=0;
		
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				c++;
			}
		}
			
		if (c==2) {
			
			System.out.println("Number " +n+ " is a Prime Number");
		} else {
			
		System.out.println("Number " +n+  " is Not a Prime Number");
		}	
		}
}
