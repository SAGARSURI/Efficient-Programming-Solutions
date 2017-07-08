package kotlin_version

/**
 * Most efficient way to compute the sum of divisors of N.

 * Solution:
 * Here is the most efficient which will most probably meet time constraints.
 * For every divisor i of N, there is also a corresponding divisisor N/i.
 * Thus to find all pairs of divisors, you need only to loop from 1 to the square root N.
 */
object SumOfFactors {
    @JvmStatic fun main(args: Array<String>) {
        //Test Cases
        val tests = intArrayOf(4, 10, 21, 55, 1005, 2000034)
        for (test in tests) {
            println("The sum of the factors of " + test + " is: " + getSumOfFactors(test))
        }
    }

    private fun getSumOfFactors(test: Int): Int {
        val maxLength = Math.sqrt(test.toDouble()).toInt()
        var sum = 1
        for (i in 2..maxLength) {
            if (test % i == 0) {
                sum += i
                val divisor = test / i
                if (divisor != i)
                    sum += divisor
            }
        }
        return sum
    }
}
