class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq= new HashMap<>();
        int n=s.length();
        int l=0;
        int r=0;
        int win_size=0;
        int maxFreq=0;
        int rep_count=0;
        int maxWin=0;

        while(r<n){
            win_size=r-l+1;
            Character c=s.charAt(r);
            if(freq.get(c)!=null){
                freq.put(c,freq.get(c)+1);
            }else{
                freq.put(c,1);
            }

            maxFreq=Math.max(freq.get(c), maxFreq);
            rep_count=win_size-maxFreq;
            
            if(rep_count<=k){
                maxWin=Math.max(win_size, maxWin);
            }else if (rep_count>k){
                freq.put(s.charAt(l), freq.get(s.charAt(l))-1);
                l++;
            }
            r++;
        }
        return maxWin;
    }
}
