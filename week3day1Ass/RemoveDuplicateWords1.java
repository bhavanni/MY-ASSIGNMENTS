package week3day1Ass;

public class RemoveDuplicateWords1 {
	
	    public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";
	        int count = 0;
	        String[] words = text.split(" ");
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	               if (words[i].equalsIgnoreCase(words[j])) {
	                  words[j] = "";
	                  count++;
 }
}
}
	        
	       if (count > 0) {
	           for (String word : words) {
	                System.out.print(word + " ");
  }
  }
 }
}

	

	



