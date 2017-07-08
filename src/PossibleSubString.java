/**
 * Created by sagarsuri on 08/07/17.
 * Today we will be looking into a problem that is related to Strings.
 * In this program we will find all the substrings from the given String.
 * Example:
 * if "1234" is the string
 * All the possible substrings of the given string will be:
 * 1 12 123 1234
 *
 * 2 23 234
 * 
 * 3 34
 *
 * 4
 */
public class PossibleSubString {
    public static void main(String[] args) {
        String str = "Sagar";
        //method to find all substrings from the given string
        subStrings(str, 0, 1);
    }

    private static void subStrings(String str, int start, int end) {
        if (start == str.length() && end == str.length()) {
            return;
        } else {
            if (end == str.length() + 1) {
                subStrings(str, start + 1, start + 1);
            } else {
                //Printing the substring
                System.out.println(str.substring(start, end));
                subStrings(str, start, end + 1);
            }
        }
    }
}
