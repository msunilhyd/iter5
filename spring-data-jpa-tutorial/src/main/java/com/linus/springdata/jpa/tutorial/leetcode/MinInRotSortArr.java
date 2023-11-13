package com.linus.springdata.jpa.tutorial.leetcode;

public class MinInRotSortArr {

    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 3, 4, 5, 6};

        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int ans = arr[0];

//        int[] arr = {7, 8, 2, 3, 4, 5, 6};
        while (left <= right) {
            if (arr[left] < arr[right]) {
                ans = Math.min(ans, arr[left]);
            }
            int mid = (left + right) / 2;
            ans = Math.min(ans, arr[mid]);
            if (arr[left] < arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
