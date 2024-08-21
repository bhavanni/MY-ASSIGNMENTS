package week4day1Ass;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String name="Bhavanni";
		char[] ch = name.toCharArray();
		
		Set<Character>unqi=new LinkedHashSet<Character>();
			for (Character character : ch) {
					unqi.add(character);
				}
			for (Character s : unqi) {
				String name1="";
				name1+=s;
					System.out.print(name1);

				}
			}
	}


