package com.linus.springdata.jpa.tutorial.leetcode;

public class MaxSumSubArray {

    // [2, 4, -1, 5, -8, 9 ]
    public static void main(String[] args) {
        int[] arr = {2, 4, -1, 5, -8, 9};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int curSum = 0;
        int maxSum = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum = curSum + arr[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}
