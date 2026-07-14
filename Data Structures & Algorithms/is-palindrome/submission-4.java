class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0, r=n-1;
        // s=s.toLowerCase();
        

        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!= Character.toLowerCase(s.charAt(r))){
                // System.out.println(s.charAt(l) + " != " +s.charAt(r));
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
