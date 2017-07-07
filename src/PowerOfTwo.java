/**
 * In this article we will see various ways to check if a number is power of 2.
 * The question is asked in various programming interviews.
 * <p>
 * Using Bitwise operations (The efficient way):
 * <p>
 * If a number, n is power of 2 then it’s binary representation will have only one 1.
 * For example,
 * 8 is power of 2. It’s binary representation is 1000.
 * The previous number i.e. (n-1) in binary form will have zero in place of 1 and 1’s in place of zero. So binary representation of 7 (8-1) is 0111. We will perform binary & operation on n and n-1 and see the result.
 * So,  1000
 * &    0111
 * will be   0000
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        //Test cases
        int[] tests = {4, 25, 64, 144};
        for (int i = 0; i < 4; i++) {
            if (powerOf2(tests[i])) {
                System.out.println(tests[i] + " is power of 2");
            } else {
                System.out.println(tests[i] + " is not a power of 2");
            }
        }
    }

    private static boolean powerOf2(int test) {
        return test > 0 && (test & (test - 1)) == 0;
    }
}
