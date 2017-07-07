/**
 * Most efficient way to compute the sum of divisors of N.
 *
 * Solution:
 * Here is the most efficient which will most probably meet time constraints.
 * For every divisor i of N, there is also a corresponding divisisor N/i.
 * Thus to find all pairs of divisors, you need only to loop from 1 to the square root N.
 */
public class SumOfFactors {
    public static void main(String[] args) {
        //Test Cases
        int[] tests = {4, 10, 21, 55, 1005, 2000034};
        for (int test : tests) {
            System.out.println("The sum of the factors of " + test + " is: " + getSumOfFactors(test));
        }
    }

    private static int getSumOfFactors(int test) {
        int maxLength = (int) Math.sqrt(test);
        int sum = 1;
        for (int i = 2; i <= maxLength; i++) {
            if (test % i == 0) {
                sum += i;
                int divisor = test / i;
                if (divisor != i)
                    sum += divisor;
            }
        }
        return sum;
    }
}
