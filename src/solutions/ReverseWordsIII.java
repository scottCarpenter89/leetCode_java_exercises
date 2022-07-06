package solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

        Example 1:
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"

        Example 2:
        Input: s = "God Ding"
        Output: "doG gniD"

        Constraints:
        1 <= s.length <= 5 * 104
        s contains printable ASCII characters.
        s does not contain any leading or trailing spaces.
        There is at least one word in s.
        All the words in s are separated by a single space.
*/
public class ReverseWordsIII {

    public static void main (String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }


    public static String reverseWords(String inputString) {
        // convert the string to a character array
        char[] charArray = inputString.toCharArray();
        // instantiate index of the beginning of the word and the end; the end (word) needs to be defined outside the
        // for loop because it is being called later in the function
        int wordStart = 0, word = 0;
        // we iterate over the entire charArray where word is the index
        for (; word < charArray.length; word++) {
            System.out.println(charArray[word]);
            // when an empty space is encountered the reverseWord is called with the beginning and ending index
            if (charArray[word] == ' ') {
//                System.out.println(charArray[j - 1]);
                reverseWord(charArray, wordStart, word - 1);
                // the starting chart is shifted to the next letter after the space
                wordStart = word + 1;
            }
        }
        // a final call needs to be made here to avoid an index out of bounds exception
        reverseWord(charArray, wordStart, word - 1);
        // returns the charArray as a new String
        return new String(charArray);
    }

    private static void reverseWord(char[] characterArray, int firstChar, int lastChar) {
        // standard two pointer indexing with characters instead of numbers or strings
        while (firstChar < lastChar) {
            char temp = characterArray[firstChar];
            characterArray[firstChar] = characterArray[lastChar];
            characterArray[lastChar] = temp;
            firstChar++;
            lastChar--;
        }
    }
}
