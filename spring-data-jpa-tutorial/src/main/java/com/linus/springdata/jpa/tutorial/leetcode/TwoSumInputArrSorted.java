package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumInputArrSorted {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 8, 9, 11, 14};
        List<int[]> ansList = search(nums, 17);
        for(int[] arr: ansList) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static List<int[]> search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        List<int[]> ansList = new ArrayList<>();
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum > target)
                r = r - 1;
            else if (sum < target )
                l = l + 1;
            else {
                ansList.add(new int[] {l, r});
                l = l + 1;
                r = r - 1;
            }

        }
        return ansList;
    }
}
