package com.linus.springdata.jpa.tutorial.leetcode;

public class MasSumSubArr {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] nums) {

        int curSum = 0;
        int maxSum = nums[0];
        // [-5, 4, -10, 7, 8]
        // 23
        // curSum = 15
        // maxSum = 15
        for (int i=0; i<nums.length; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum = curSum + nums[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}
