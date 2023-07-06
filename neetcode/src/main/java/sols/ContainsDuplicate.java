package sols;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(4);

        System.out.println(containsDuplicate(list));
    }

    public static boolean containsDuplicate(List<Integer> list) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int n : list) {
            if (hashSet.contains(n))
                return true;
            hashSet.add(n);
        }
        return false;
    }
}
