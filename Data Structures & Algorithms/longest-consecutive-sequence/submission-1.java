class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int length;
        int max=0;
        for(Integer num: set){
            length=1;

            while(set.contains(num+length)){
                length++;
            }
            max=Math.max(max, length);
        }
        return max;
    }
}
