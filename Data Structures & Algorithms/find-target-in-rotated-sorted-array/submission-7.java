class Solution {
    public int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1;
    
    while (l <= r) {
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) return mid;
        
        // Determine which half is sorted
        if (nums[l] <= nums[mid]) {
            // LEFT half [l..mid] is sorted
            if (nums[l] <= target && target < nums[mid]) {
                r = mid - 1;   // target in sorted left half
            } else {
                l = mid + 1;   // target in unsorted right half
            }
        } else {
            // RIGHT half [mid..r] is sorted
            if (nums[mid] < target && target <= nums[r]) {
                l = mid + 1;   // target in sorted right half
            } else {
                r = mid - 1;   // target in unsorted left half
            }
        }
    }
    return -1;
}
}
