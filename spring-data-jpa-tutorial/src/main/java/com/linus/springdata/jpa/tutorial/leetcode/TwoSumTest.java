package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 7};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> diffMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if (diffMap.containsKey(diff)) {
                return new int[]{diff, nums[i]};
            }
            diffMap.put(nums[i], 0);
        }
        return null;
    }
}
