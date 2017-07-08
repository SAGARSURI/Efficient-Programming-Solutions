import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Perfect numbers or Amicable numbers are those numbers which are equal to the sum of their proper divisors.
 * Example: 6 = 1 + 2 + 3
 */
public class AmicableNumber {
    public static void main(String[] args) {
        int[] tests = {6, 12, 24, 28, 36, 121};
        for (int test : tests) {
            int sum = 1;
            int[] totalFactors = getTotalFactors(test); //Getting all the factors of the given number

            //java8 style of adding all the elements in an array
            sum += Arrays.stream(totalFactors).sum();
            if (sum == test) {
                System.out.println(test + " is an Amicable Number or Perfect Number");
            }
        }
    }

    private static int[] getTotalFactors(int test) {
        int maxLength = (int) Math.sqrt(test);
        List<Integer> factors = new ArrayList<>(); //list to store all the factors of the number
        for (int i = 2; i <= maxLength; i++) {
            if (test % i == 0) {
                factors.add(i);
                int divisor = test / i;
                if (divisor != i)
                    factors.add(divisor);
            }
        }
        //.filter(i -> i != null) will also work to avoid NullPointerException
        int[] toArray = factors.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();   //Converting ArrayList<Integer> to int[] using streams introduced in java8
        return toArray;
    }
}
