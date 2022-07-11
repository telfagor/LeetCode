package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                int oldValue = map.get(ch);
                map.put(ch, oldValue + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int[] values = new int[map.size()];
        int[] occurrences = new int[map.size()];

        int k = 0;
        for (Character ch : map.keySet()) {
            values[k++] = (map.get(ch));
        }

        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    counter++;
                }
            }
            occurrences[i] = counter;
            counter = 0;
        }

        boolean isGood = true;
        for (int i = 0; i < occurrences.length - 1; i++) {
            if (values[i] != values[i + 1]) {
                isGood = false;
            }
        }

        return isGood;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberOfOccurrences obj = new NumberOfOccurrences();
        System.out.println(obj.areOccurrencesEqual(scanner.nextLine()));
    }
}
