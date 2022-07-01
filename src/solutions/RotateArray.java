package solutions;

import java.util.Arrays;

import static java.util.Collections.reverse;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Example 2:
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 *
 *
 * Follow up:
 *
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?*/
public class RotateArray {
    public static void main (String[] args) {
        System.out.println(rotate(new int[]{1,2,3,4,5,6,7}, 3));
    }

    public static boolean rotate(int[] nums, int k) {

        k %= nums.length; // ex) 3 % 7 = 3; 7 does not fit into, so it just returns 3
        reverse(nums, 0, nums.length - 1); // calls reverse method and reverses the numbers; [7, 6, 5, 4, 3, 2, 1]

        reverse(nums, 0, k - 1); // this reverse ends at k - 1 (which is at the index of 2 here); [5, 6, 7, 4, 3, 2, 1]

        reverse(nums, k, nums.length - 1); // this reverse ends nums.length - 1; [5, 6, 7, 1, 2, 3, 4]
        // needed to return a static boolean for it to compile for some reason
        return false;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // a temp variable is set the starting number of nums
            int temp = nums[start];
            // the starting number becomes the ending number
            nums[start] = nums[end];
            // the ending number begins at whatever temp has it assigned as
            nums[end] = temp;
            // the start increments through the array
            start++;
            // the end decrements through the array
            end--;
            // the loop starts over
        }
    }

}
