package sols;

public class Sol2 {

    public static void main(String[] args) {

        int[] arr = {4, 1, 8, 0};

        int l = 0;
        int r = 1;

        int max = 0;

        while(r < arr.length) {
            if (arr[r] > arr[l]) {
                max = Math.max(arr[r] - arr[l], max);
            } else {
                l = l + 1;
            }
            r = r + 1;
        }

        System.out.println(max);
    }

}
