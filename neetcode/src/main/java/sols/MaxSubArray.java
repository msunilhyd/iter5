package sols;

import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

    public static void main(String[] args) {

        System.out.println(maxSubArr(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4)));
    }

    public static int maxSubArr(List<Integer> list) {

        int maxSum = list.get(0);
        int curSum = 0;

        for (int n : list) {
            if(curSum < 0) {
                curSum = 0;
            }
            curSum = curSum + n;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
