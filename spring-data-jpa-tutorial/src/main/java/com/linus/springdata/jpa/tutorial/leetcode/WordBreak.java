package com.linus.springdata.jpa.tutorial.leetcode;

import org.apache.catalina.LifecycleState;

import java.lang.reflect.Array;
import java.util.*;

public class WordBreak {

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        Set<String> wordSet = new HashSet<>(wordDict);

        for (int i=1; i<=s.length(); i++) {
            for (int j=i-1; j>=0; j--) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[s.length()];
    }
}
