class Solution {
    public int insertPosition(int nums[], int target, int start, int end) {
        if (start > end)
            return start;
        
        int mid = start + (end - start) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (target < nums[mid])
            return insertPosition(nums, target, start, mid - 1);
        return insertPosition(nums, target, mid + 1, end);
    }

    public int searchInsert(int[] nums, int target) {
        return insertPosition(nums, target, 0, nums.length - 1);
    }
}