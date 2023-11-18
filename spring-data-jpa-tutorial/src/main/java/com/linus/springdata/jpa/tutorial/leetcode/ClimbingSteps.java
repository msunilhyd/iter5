package com.linus.springdata.jpa.tutorial.leetcode;

public class ClimbingSteps {

    public static void main(String[] args) {

        System.out.println(noOfWays(5));
    }

    public static int noOfWays(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int one = 1;
        int two = 2;
        int total = 0;
        for (int i=3; i<=n; i++) {
            total = one + two;
            one = two;
            two = total;
        }
        return total;
    }
}
