package kotlin_version

import java.util.Arrays
import java.util.function.BinaryOperator
import java.util.stream.Collectors

/**
 * Created by sagarsuri on 08/07/17.
 * In this program we will learn different ways to add all the elements in an array
 * For example:
 * if we have an array
 * int[] array = {1,2,3,4,5}
 * and we need to add all the elements of the above array. How we are going to do this ?
 * Lets find out.
 */
object AddingElements {
    @JvmStatic fun main(args: Array<String>) {
        val test1 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        val test2 = IntArray(10000)
        for (i in test2.indices) {
            var temp = i
            test2[i] = temp++
        }
        //Simple logic to add all the elements in an array
        simpleAddingAllElements(test1)

        //method to add elements using java8 stream
        fastAddingAllElements(test1)

        //Efficient way to add large number of elements in an array using parallelStreams introduced in java8
        efficientAddingAllElements(test2)
    }

    private fun efficientAddingAllElements(test2: IntArray) {
        //kotlin style of converting IntArray to ArrayList
        val toList = test2.toCollection(ArrayList())
        //Using parallelstream introduced in java8 to add all the elements in array. Useful during large dataset
        val sum = toList.parallelStream().reduce(0, { a, b -> Integer.sum(a, b) })
        println("efficientAddingAllElements() output: " + sum)

    }

    private fun fastAddingAllElements(test1: IntArray) {
        //Short and clean way to add elements in an array using streams introduced in java8
        val sum = Arrays.stream(test1).sum()
        println("fastAddingAllElements() output: " + sum)
    }

    private fun simpleAddingAllElements(test1: IntArray) {
        //Simple way to add all the elements of the array test1
        var sum = 0
        for (aTest1 in test1) {
            sum += aTest1
        }
        println("simpleAddingElements() output: " + sum)
    }
}
