class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        if(s1.length() > s2.length()){
            return false;
        }   
        int l=0;
        int r=s1.length();
        int n= s2.length();
        while(r<=n){
            String sub=s2.substring(l,r);
            if(isPermutation(s1, sub)){
                return true;
            }
            l++;
            r++;
        }

        return false;
        
    }

    boolean isPermutation(String s1, String s2){
        int[] charArr=new int[26];
        for(int i=0; i<s1.length();i++){
            charArr[s1.charAt(i)-'a']++;
            charArr[s2.charAt(i)-'a']--;
        }

        for(int i: charArr){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}
