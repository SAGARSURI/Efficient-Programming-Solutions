import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by sagarsuri on 08/07/17.
 * In this program we are trying to find common elements between two Lists and then store those elements into one list
 * Example:
 * list1 = {1,2,3,4,5}
 * list2 = {4,5,6,7,8}
 * 
 * Common elements are:
 * {4,5}
 */
public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(6);
        list1.add(2);
        list1.add(11);

        list2.add(5);
        list2.add(3);
        list2.add(1);
        list2.add(6);
        list2.add(9);
        list2.add(10);

        list1.retainAll(new HashSet<>(list2));  //If there are any common elements between both the lists. Those common elements will be retained in list1

        //java8 style of printing the common elements in both list1 and list2
        if (!list1.isEmpty()) {
            list1.forEach(System.out::println);
        } else {
            System.out.println("No common elements to be retained");
        }

    }
}
