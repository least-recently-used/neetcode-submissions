class Solution {
    public int[] twoSum(int[] nums, int target) {
        // key=num and val=index
        Map<Integer, Integer> map = new HashMap<>();
        int i=0;
        for(Integer num: nums){
            if(map.containsKey(target-num)){
                return new int[]{map.get(target-num), i};
            }else{
                map.put(num,i);
            }
            i++;
        }
        return null;
    }
}
