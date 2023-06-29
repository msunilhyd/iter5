package BuySellStock;

import java.util.ArrayList;
import java.util.List;

public class Sol1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(4);

        System.out.println(maxProfit(list));
    }

    public static int maxProfit(List<Integer> list) {
        int l = 0; // left
        int r = 1; // sell
        int profit = 0;
        int max = 0;
        while (r < list.size()) {
            // profitable?
            int left = list.get(l);
            int right = list.get(r);
            if (left < right) {
                profit = left - right;
                max = Math.max(profit, max);
            } else
                l = l + 1;
            r = r + 1;
        }
        return max;
    }
}
