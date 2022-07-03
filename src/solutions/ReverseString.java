package solutions;

import java.util.Arrays;

/**
Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]

        Example 2:
        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]

        Constraints:
        1 <= s.length <= 105
        s[i] is a printable ascii character.
*/
public class ReverseString {

    public static void main (String[] args) {
        reverseString(new char[] {'h','e','l','l','o'});
        reverseString(new char[] {'H','a','n','n','a','h'});
    }

    public static void reverseString(char[] s) {
        // input: an array of characters

        // define two pointer variables
        int right = s.length - 1;
        int left = 0;

        while (left < right) {
            int temp = s[left];
            s[left] = s[right];
            System.out.println(s);
            s[right] = (char) temp;
            System.out.println(s);
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
        // output: the array reversed
    }
}
