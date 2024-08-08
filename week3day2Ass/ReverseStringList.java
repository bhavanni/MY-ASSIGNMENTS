package week3day2Ass;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class ReverseStringList {
		    public static void main(String[] args) {
		       
		        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

		        List<String> companyList = new ArrayList<>();
		        Collections.addAll(companyList, companies);

		        Collections.sort(companyList);

		        System.out.println("Required output:");
		        for (int i = companyList.size() - 1; i >= 0; i--) {
		            System.out.println(companyList.get(i));
		        }
		    }
		}
