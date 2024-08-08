package week3day2Ass;
	import java.util.ArrayList;
	import java.util.List;

	public class IntersectionOfNumbers {
	    public static void main(String[] args) {
	       
	        int[] array1 = {3, 2, 11, 4, 6, 7};
	        int[] array2 = {1, 2, 8, 4, 9, 7};

	        List<Integer> list1 = new ArrayList<>();
	        for (int number : array1) {
	            list1.add(number);
	        }

	        List<Integer> list2 = new ArrayList<>();
	        for (int number : array2) {
	            list2.add(number);
	        }
	        List<Integer> intersection = new ArrayList<>();
	        for (Integer num : list1) {
	            if (list2.contains(num)) {
	                intersection.add(num);
	            }
	        }

	        System.out.println("Intersection of the two arrays: " + intersection);
	    }
}

