package kotlin_version

/**
 * Created by sagarsuri on 08/07/17.
 * Today we will be looking at gcd implementation in different ways.
 * 1) Euclidean Algorithm
 * 2) Binary Algorithm (Its considered as one of the fastest algorithm to get GCD of 2 numbers)
 */
object GCD {
    @JvmStatic fun main(args: Array<String>) {
        val test = arrayOf(intArrayOf(12, 24), intArrayOf(144, 441))

        //Using euclid's algorithm
        println("Using Euclid's Algorithm gcd of 12 and 24 is :" + findGCDUsingEuclid(test[0][0], test[0][1]))

        //Using binary algorithm
        println("Using Binary Algorithm gcd of 36 and 64 is: " + findGCDUsingBinary(test[1][0], test[1][1]))

    }

    private fun findGCDUsingBinary(p: Int, q: Int): Int {
        if (q == 0) return p
        if (p == 0) return q

        // p and q even
        if (p and 1 == 0 && q and 1 == 0)
            return findGCDUsingBinary(p shr 1, q shr 1) shl 1
        else if (p and 1 == 0)
            return findGCDUsingBinary(p shr 1, q)
        else if (q and 1 == 0)
            return findGCDUsingBinary(p, q shr 1)
        else if (p >= q)
            return findGCDUsingBinary(p - q shr 1, q)
        else
            return findGCDUsingBinary(p, q - p shr 1)// p and q odd, p < q
        // p and q odd, p >= q
        // p is odd, q is even
        // p is even, q is odd
    }

    private fun findGCDUsingEuclid(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        } else {
            return findGCDUsingEuclid(b, a % b)
        }
    }

}
