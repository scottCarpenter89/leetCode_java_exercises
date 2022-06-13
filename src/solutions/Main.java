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

        System.out.println(romanToInt("XXIV"));
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

    public static int romanToInt(String romanNumeral) {
        // input: a string
        // convert the values to UPPERCASE because .includes is case-sensitive
        romanNumeral = romanNumeral.toUpperCase();

        // define a variable to add values to
        int numericalResult = 0;
        if (romanNumeral.contains("IV") || romanNumeral.contains("IX")) {
            numericalResult -= 2;
        }
        if (romanNumeral.contains("XL") || romanNumeral.contains("XC")) {
            numericalResult -= 20;
        }
        if (romanNumeral.contains("CD") || romanNumeral.contains("CM")) {
            numericalResult -= 200;
        }

        // convert the string to a charArray
        char[] romanNumeralArray = romanNumeral.toCharArray();
        // loop over the string
        for (int i = 0; i < romanNumeralArray.length; i++) {
            // create a switch with numerals corresponding to specific values
//            System.out.println(romanNumeral.charAt(i));
            switch (romanNumeral.charAt(i)) {
                case 'I':
                    // add those values to the return variable
                    numericalResult += 1;
                    break;
                case 'V':
                    numericalResult += 5;
                    break;
                case 'X':
                    numericalResult += 10;
                    break;
                case 'L':
                    numericalResult += 50;
                    break;
                case 'C':
                    numericalResult += 100;
                    break;
                case 'D':
                    numericalResult += 500;
                    break;
                case 'M':
                    numericalResult += 1000;
                    break;
            }
        }

        // output: returns a numerical value
        return numericalResult;
    }
}
