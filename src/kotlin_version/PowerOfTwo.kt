package kotlin_version

/**
 * In this program we will see various ways to check if a number is power of 2.
 * The question is asked in various programming interviews.
 *
 *
 * Using Bitwise operations (The efficient way):
 *
 *
 * If a number, n is power of 2 then it’s binary representation will have only one 1.
 * For example,
 * 8 is power of 2. It’s binary representation is 1000.
 * The previous number i.e. (n-1) in binary form will have zero in place of 1 and 1’s in place of zero. So binary representation of 7 (8-1) is 0111. We will perform binary & operation on n and n-1 and see the result.
 * So,  1000
 * &    0111
 * will be   0000
 */
object PowerOfTwo {
    @JvmStatic fun main(args: Array<String>) {
        //Test cases
        val tests = intArrayOf(4, 25, 64, 144)
        for (i in 0..3) {
            if (powerOf2(tests[i])) {
                println(tests[i].toString() + " is power of 2")
            } else {
                println(tests[i].toString() + " is not a power of 2")
            }
        }
    }

    private fun powerOf2(test: Int): Boolean {
        return test > 0 && test and test - 1 == 0
    }
}
