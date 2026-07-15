class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target=0;
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if (nums[i] > 0) break;
        // Skip duplicate first numbers
        if (i > 0 && nums[i] == nums[i-1]) continue;
            l=i+1;
            r=nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]>target){
                    r--;
                }else if(nums[i]+nums[l]+nums[r]<target){
                    l++;
                }else{
                    
                    list.add(List.of(nums[i],nums[l],nums[r]));
                  while (l < r && nums[l] == nums[l+1]) l++;
                while (l < r && nums[r] == nums[r-1]) r--;
                l++;
                r--;
                }
                
            }
        }
        return list;
    }
}
