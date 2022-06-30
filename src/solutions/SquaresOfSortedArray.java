package solutions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 Example 1:

 Input: nums = [-4,-1,0,3,10]
 Output: [0,1,9,16,100]
 Explanation: After squaring, the array becomes [16,1,0,9,100].
 After sorting, it becomes [0,1,9,16,100].
 Example 2:

 Input: nums = [-7,-3,2,3,11]
 Output: [4,9,9,49,121]


 Constraints:

 1 <= nums.length <= 104
 -104 <= nums[i] <= 104
 nums is sorted in non-decreasing order.


 Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?*/


public class SquaresOfSortedArray {

        public static void main(String[] args) {
            System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        }


        public static int[] sortedSquares(int[] nums) {
            // input: an array of unsorted numbers
            // instantiates a new int array with the same length as the input array
           int[] sortedArray = new int[nums.length];
           // the left side starts at the 0th index and the right side starts with the last index
           int left = 0;
           int right = nums.length - 1;
            // use for i loop to square each number in the array starting from the end index
            for (int i = nums.length - 1; i >= 0; i--) {
                // if the squared value at the left is bigger than the squared value at the right, it gets squared and shoved into the new array at the same index and increments the index
              if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                sortedArray[i] = nums[left] * nums[left];
                left++;
                // if the right side is bigger then the same thing happens but to the number on the right and decrements the index
              } else {
                  sortedArray[i] = nums[right] * nums[right];
                  right--;
              }
            }
            return sortedArray;
            // output: an array of sorted & squared numbers
        }
/**
 * Notes: My first instinct was to loop through the array and square each value and then sort it, but that method is slower than O(logN) method here. There was also some complications reverting the sorted array back to an array rather than an address in memory*/
}
