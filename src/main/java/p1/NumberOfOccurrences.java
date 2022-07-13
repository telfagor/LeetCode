package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.merge(ch, 1, (integer, integer2) -> integer + 1);
        }

        Integer firstValue = map.values().iterator().next();
        for (Integer value : map.values()) {
            if(!value.equals(firstValue)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberOfOccurrences obj = new NumberOfOccurrences();
        System.out.println(obj.areOccurrencesEqual(scanner.nextLine()));
    }
}
