package sols;

public class PrintMultiplesOf3and5 {

    public static void main(String[] args) {

        for (int i=1; i<=20; i++) {
            if (i % 3 == 0 && i%5 == 0) {
                System.out.println(i + " FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            }
            if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
    }
}
