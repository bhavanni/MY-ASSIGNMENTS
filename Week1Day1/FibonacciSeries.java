package Week1Day1;

public class FibonacciSeries {
	public static void main(String[] args) {

		 int n = 8, firstTerm = 0, secondTerm = 1;
		 
		    System.out.println("Fibonacci Series of " + n + " Numbers:");

		    for (int i = 1; i <= n; ++i) {
		    	
		      System.out.print(firstTerm +" "+'\n');

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
		}