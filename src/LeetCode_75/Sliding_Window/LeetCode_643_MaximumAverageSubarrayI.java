package LeetCode_75.Sliding_Window;

import java.util.*;

public class LeetCode_643_MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums;
        int k;

        nums = new int[]{1, 12, -5, -6, 50, 3};
        k = 4;
        System.out.println(new LeetCode_643_MaximumAverageSubarrayI().findMaxAverage(nums, k));

        nums = new int[]{5};
        k = 1;
        System.out.println(new LeetCode_643_MaximumAverageSubarrayI().findMaxAverage(nums, k));

        nums = new int[]{-1};
        k = 1;
        System.out.println(new LeetCode_643_MaximumAverageSubarrayI().findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }

        double answer = (double) windowSum / k;

        for(int i = k; i < nums.length; i++){
            windowSum += nums[i] - nums[i - k];
            answer = Math.max(answer, (double)windowSum/k);
        }

        return answer;
    }
}
