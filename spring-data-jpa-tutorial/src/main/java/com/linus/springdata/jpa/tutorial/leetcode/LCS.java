package com.linus.springdata.jpa.tutorial.leetcode;

public class LCS {

    // j a c k i e
    // c k a i x b
    // ans = 3

    public static void main(String[] args) {
        String s1 = "jackieee";
        String s2 = "ckaixbee";
        System.out.println(find(s1, s2));
    }

    public static int find(String s1, String s2) {

        int[][] mat = new int[s1.length() + 1][s2.length() + 1];

        for (int i=s1.length()-1; i>=0; i--) {
            for (int j=s2.length()-1; j>=0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    mat[i][j] = mat[i+1][j+1] + 1;
                } else {
                    mat[i][j] = Math.max(mat[i+1][j], mat[i][j+1]);
                }
            }
        }
        return mat[0][0];
    }
}
