package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 9};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i=0; i<arr.length; i++) {
            if (hashSet.contains(arr[i]))
                return true;
            hashSet.add(arr[i]);
        }
        return false;
    }
}
