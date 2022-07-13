package p1;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int[] runningSumArray = runningSum(numbers);
        System.out.println(Arrays.toString(runningSumArray));
    }

    public static int[] runningSum(int[] nums) {
        int[] arraySum = new int[nums.length];
        arraySum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            arraySum[i] = arraySum[i-1] + nums[i];
        }

        return arraySum;
    }


    public static int[] runningSum2(int[] nums) {
        int[] arraySum = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            arraySum[i] = sum;
            sum = 0;
        }

        return arraySum;
    }
}
