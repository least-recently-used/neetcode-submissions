class Solution {
    public int search(int[] nums, int target) {
        int r=nums.length;
        int l=0;
        while(l<r){
            int mid = l + (r - l) / 2;

            if(target< nums[mid]){
                r=mid;
            }else if(target> nums[mid]){
                l=mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
