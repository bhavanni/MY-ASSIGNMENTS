package week3day2Ass;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class SecondLargestNumber {
	    public static void main(String[] args) {
	       
	        int[] numbers = {3, 2, 11, 4, 6, 7};

	       List<Integer> numberList = new ArrayList<>();
	        for (int number : numbers) {
	            numberList.add(number);
	        }
 
	        Collections.sort(numberList);

	        int secondLargest = numberList.get(numberList.size() - 2);
	        System.out.println("The second largest number is: " + secondLargest);
	    }
}
