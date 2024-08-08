package week3day1Ass;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		String s1 = "changeme";
		
		char[] chararr = s1.toCharArray();
		for(int i =chararr.length-1;i>=1;i--) {
			
            if (i % 2 == 0) {
            	chararr[i]= Character.toUpperCase(chararr[i]);
      }
	}
		String s2= new String(chararr);
		System.out.println(s2);
	}
}