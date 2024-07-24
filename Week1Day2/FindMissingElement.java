package Week1Day2;

public class FindMissingElement {
	
	 public static void main(String[] args) {
		 
	        int a[] = {1, 4, 3, 2, 8, 6, 7};
	        int n=a.length;
	        int sum1=0,sum2=0;
	        System.out.println("Input of the Array - {1, 4, 3, 2, 8, 6, 7}");
	       for (int i = 1; i <=8; i++) {
		      sum1=sum1+i;	
		}
	       
	        for (int i = 0; i < n; i++) {
				sum2=sum2+a[i];
			}
	      
	        int m=sum1-sum2;
	        System.out.println("The Missing Element is: "+m);
	        
	    }
	}

