package com.linus.springdata.jpa.tutorial.leetcode;


public class SearchInRotSortArr2 {

    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(search(nums, 17));
    }

    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            int mid = (l+r) / 2;
//            System.out.println("mid = " + mid);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] > nums[mid]) {
                if (target > nums[mid] && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            } else {
                if (target >= nums[l] && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return -1;
    }
}
