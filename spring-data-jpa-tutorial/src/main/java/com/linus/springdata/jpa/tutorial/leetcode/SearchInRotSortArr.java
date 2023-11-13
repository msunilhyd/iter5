package com.linus.springdata.jpa.tutorial.leetcode;

public class SearchInRotSortArr {

    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 4, 5, 6};
        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if(nums[left] <= nums[mid]) {
                if (target < nums[left] || target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target > nums[right] || target < nums[mid]) {
                    right = mid -1 ;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
