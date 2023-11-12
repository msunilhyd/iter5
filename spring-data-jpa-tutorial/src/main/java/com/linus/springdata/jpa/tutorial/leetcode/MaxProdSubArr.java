package com.linus.springdata.jpa.tutorial.leetcode;

public class MaxProdSubArr {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, -2, 0, -5, 8, -3};
        System.out.println(maxProd(arr));
    }

    public static int maxProd(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        int max = nums[0];
        int result = max;

        // [2, 1, 0];

        for (int i=1; i<nums.length; i++) {
            int cur = nums[i];
            max = Math.max(cur, Math.max(max*cur, min*cur));
            min = Math.min(cur, Math.min(min*cur, max*cur));

            result = Math.max(result, max);
        }
        return result;
    }
}
