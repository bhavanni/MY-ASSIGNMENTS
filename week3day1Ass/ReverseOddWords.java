package week3day1Ass;

public class ReverseOddWords {
	
	    public static void main(String[] args) {
	        String str = "I am a software tester";
	        String[] words = str.split(" ");
	        
	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 != 0) {
	                words[i] = new StringBuilder(words[i]).reverse().toString();
	            }
	        }
	        
	        for (String word : words) {
	            System.out.print(word + " ");
	        }
	    }
	}


