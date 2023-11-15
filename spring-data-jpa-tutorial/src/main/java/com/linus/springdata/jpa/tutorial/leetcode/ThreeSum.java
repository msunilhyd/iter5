package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

//        int[] nums = {-2, -1, -1, 0, 1, 2, 3};
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ansList = find(nums);
        for (List<Integer> list : ansList) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> find(int[] nums) {

        List<List<Integer>> ansList = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0; i<nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int l = i+1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) {
                        ansList.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        l = l + 1;
                        r = r - 1;
                    } else if (sum > 0)
                        r = r - 1;
                    else
                        l = l + 1;
                }
            }
        }
        return ansList;
    }
}
