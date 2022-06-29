package solutions;

public class SearchInsertPosition {

    public static void main (String[] args) {
        System.out.println(searchInsert(new int[] {1,2,3,4}, 5));
        System.out.println(searchInsert(new int[] {1,2,3,4}, 2));
    }


    public static int searchInsert(int[] nums, int target) {
    // input: an array of numbers
        // strategy: use a binary search
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = low + ((high - low) / 2);
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        // output: an index of the missing target number
        return low;
    }
}
