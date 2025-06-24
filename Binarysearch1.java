public class Binarysearch1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {5, 7, 7, 8, 9, 10};
        int target = 9;

        int[] result = sol.searchRange(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}


class Solution {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            findIndex(nums, target, true),   // Find first occurrence
            findIndex(nums, target, false)   // Find last occurrence
        };
    }

    private int findIndex(int[] nums, int target, boolean findFirst) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                index = mid;
                if (findFirst) {
                    right = mid - 1; // Keep looking on the left
                } else {
                    left = mid + 1; // Keep looking on the right
                }
            }
        }

        return index;
    }
}

