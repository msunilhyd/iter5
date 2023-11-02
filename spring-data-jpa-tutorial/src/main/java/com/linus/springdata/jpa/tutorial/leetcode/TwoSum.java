package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Given an array of integers nums and an integer target, return indices of the 2 numbers such that they add upto target

    // nums = [2, 7, 11, 15], target = 9
    // output = [0, 1]

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int diff = target-nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
