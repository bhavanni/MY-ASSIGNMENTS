package week3day1Ass;

import java.util.Arrays;

public class Anagram {

	 public static boolean Anagrams(String s1, String s2)
	    {
	        // Sort both strings
	        char[] chaArr1 = s1.toCharArray();
	        char[] chaArr2 = s2.toCharArray();
	        Arrays.sort(chaArr1);
	        Arrays.sort(chaArr2);

	        // Compare sorted strings
	        return Arrays.equals(chaArr1, chaArr2);
	    }

	    public static void main(String[] args)
	    {
	        String str1 = "stops";
	        String str2 = "potss";

	        if (Anagrams(str1, str2)) {
	            System.out.println("True");
	        }
	        else {
	            System.out.println("False");
	        }
		}

}
