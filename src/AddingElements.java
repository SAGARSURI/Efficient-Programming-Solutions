import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sagarsuri on 08/07/17.
 * In this program we will learn different ways to add all the elements in an array
 * For example:
 * if we have an array
 * int[] array = {1,2,3,4,5}
 * and we need to add all the elements of the above array. How we are going to do this ?
 * Lets find out.
 */
public class AddingElements {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] test2 = new int[10000];
        for (int i = 0; i < test2.length; i++) {
            int temp = i;
            test2[i] = temp++;
        }
        //Simple logic to add all the elements in an array
        simpleAddingAllElements(test1);

        //method to add elements using java8 stream
        fastAddingAllElements(test1);

        //Efficient way to add large number of elements in an array using parallelStreams introduced in java8
        efficientAddingAllElements(test2);
    }

    private static void efficientAddingAllElements(int[] test2) {
        //java8 style of converting int[] to List<Integer>
        List<Integer> toList = Arrays.stream(test2).boxed().collect(Collectors.toList());
        //Using parallelstream introduced in java8 to add all the elements in array. Useful during large dataset
        int sum = toList.parallelStream().reduce(0, Integer::sum);
        System.out.println("efficientAddingAllElements() output: " + sum);

    }

    private static void fastAddingAllElements(int[] test1) {
        //Short and clean way to add elements in an array using streams introduced in java8
        int sum = Arrays.stream(test1).sum();
        System.out.println("fastAddingAllElements() output: " + sum);
    }

    private static void simpleAddingAllElements(int[] test1) {
        //Simple way to add all the elements of the array test1
        int sum = 0;
        for (int aTest1 : test1) {
            sum += aTest1;
        }
        System.out.println("simpleAddingElements() output: " + sum);
    }
}
