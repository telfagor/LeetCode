package p1;

public class OddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {10,11,12};
        int oddLengthSubarraysSum = sumOddLengthSubarrays(arr);
        System.out.println("The oll length Subarrays sum is: " + oddLengthSubarraysSum);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        if (arr.length == 2) {
            return arr[0] + arr[1];
        }

        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }

        for (int k = 2; k < arr.length; k += 2) {
            for (int i = k, c = 0; i < arr.length; i++, c++) {
                for (int j = c; j <= i; j++) {
                    sum += arr[j];
                }
            }
        }

        return sum;
    }
}
