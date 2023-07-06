package sols;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrExceptSelf {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(prodExSelf(list));
    }

    public static List<Integer> prodExSelf(List<Integer> list) {

        int prod = 1;
        for (int i = 0; i<list.size(); i++) {
            prod = prod * list.get(i);
        }
        List<Integer> ansList = new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            ansList.add(prod/list.get(i));
        }
        return ansList;
    }
}
