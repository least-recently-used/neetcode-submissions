class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1){
            return s.length();
        }
        int n=s.length();
        int l=0;
        int r=1;
        int max=0;
        Set<Character> set=new HashSet<>();
        set.add(s.charAt(l));
        

        while(r<n){

            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max=Math.max(max,set.size());
            r++;
        
        }
        return max;
}
}