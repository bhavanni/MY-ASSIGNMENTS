package week3day2Ass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementsList {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 10, 6, 8};

        List<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            numberList.add(number);
        }
        Collections.sort(numberList);
        System.out.println("Missing numbers:");
        for (int i = 0; i < numberList.size() - 1; i++) {
            int current = numberList.get(i);
            int next = numberList.get(i + 1);
        
            for (int j = current + 1; j < next; j++) {
                System.out.println(j);
            }
        }
    }
}