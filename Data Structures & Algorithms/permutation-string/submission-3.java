class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        if(s1.length() > s2.length()){
            return false;
        }   
        int l=0;
        Map<Character, Long> freq= s1.chars()
            .mapToObj(c-> (char) c)
            .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        

        int r=s1.length();
        int n= s2.length();
        while(r<=n){
            String sub=s2.substring(l,r);
            Map<Character, Long> subfreq= sub.chars()
            .mapToObj(c-> (char) c)
            .collect(Collectors.groupingBy(c->c, Collectors.counting()));

            if(freq.equals(subfreq)){
                return true;
            }

            l++;
            r++;
        }

        return false;
        
    }

    // boolean isPermutation(String s1, String s2){
    //     int[] charArr=new int[26];
    //     for(int i=0; i<s1.length();i++){
    //         charArr[s1.charAt(i)-'a']++;
    //         charArr[s2.charAt(i)-'a']--;
    //     }

    //     for(int i: charArr){
    //         if(i>0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
