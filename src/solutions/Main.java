package solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        runSolutions();
    }

    public static void runSolutions() {
        int[] array = {1, 11, 6, 4, 9};
        System.out.println(Arrays.toString(twoSums(array, 10)));
        int palindrome1 = 1221;
        System.out.println(isPalindrome(palindrome1));
    }

    public static int[] twoSums(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static boolean isPalindrome(int num) {
        if(num < 0) {
            return false;
        }
        int reversed = 0, remainder, original = num;
        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            num  /= 10;  //the last digit is removed from num after division by 10.
        }
        // palindrome if original and reversed are equal
        return original == reversed;


    }

}
