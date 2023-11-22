package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LISNlogN {

    public static void main(String[] args) {
        int arr[] = {10, 9, 2, 5, 3, 7, 101, 1};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for(int i=1; i<arr.length; i++) {
            if (arr[i] > list.get(list.size() - 1))
                list.add(arr[i]);
            else {
                int j = binarySearch(list, arr[i]);
                list.set(j, arr[i]);
            }
        }
        return list.size();
    }

    public static int binarySearch(List<Integer> list, int num) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) == num) {
                return mid;
            }
            if (num < list.get(mid) )
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
