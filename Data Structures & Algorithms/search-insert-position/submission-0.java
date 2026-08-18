class Solution {
    public int binarySearch(int nums[], int target, int start, int end) {
        if (start > end)
            return start;
        
        int mid = start + (end - start) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (target < nums[mid])
            return binarySearch(nums, target, start, mid - 1);
        return binarySearch(nums, target, mid + 1, end);
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}