package solutions;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?*/
public class MoveZeros {
    public static void main (String[] args) {
       moveZeroes(new int[] {0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        // input: an array of integers
        // if the array is empty or only contains one element it returns
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int left = 0;
        int right = 0;
        int temp;

        while (right < nums.length) {
            // if a non-zero element is encountered at the right pointer
            if (nums[right] != 0) {
                System.out.println("Non-zero number encountered at right pointer");
                /** the temp is set to the number at the left pointer. This is crucial because we immediately set the
                 * and swap it with the right number. We then set the right pointer with the number on the left (aka
                 * the temp we just set). If we didn't set the temp with the left number, then we duplicate the right
                 * number twice and mess up the entire array.*/
                temp = nums[left];
                // the left element is swapped with the right element
                System.out.println("Left number before swap: " + nums[left]);
                nums[left] = nums[right];
                System.out.println("Left number after swap: " + nums[left]);
                System.out.println(Arrays.toString(nums));
                // and the right element swaps withe left element
                System.out.println("Right number before swap: " + nums[right]);
                nums[right] = temp;
                System.out.println("Right number after swap: " + nums[right]);
                System.out.println(Arrays.toString(nums));
                // then the left pointer increments
                left++;
                System.out.println("Left pointer increments: " + left);
                System.out.println(Arrays.toString(nums));
                System.out.println("\n");
            }
            // and the right point increments
            System.out.println("Zero encountered at right pointer");
            right++;
            System.out.println("Right pointer increments: " + right);
            System.out.println("Left pointer: " + left + ", right pointer: " + right);
            System.out.println(Arrays.toString(nums));
            System.out.println("\n");
        }
        System.out.println("Final array solution: " + Arrays.toString(nums));
        // output: an array of integers with the zeroes at the end
    }
}
