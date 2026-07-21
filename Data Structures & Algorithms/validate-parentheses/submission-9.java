class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int l=0;
        if(s.charAt(l)==')' || s.charAt(l)=='}' || s.charAt(l)==']'){
            return false;
        }
        while(l<s.length()){

            if(s.charAt(l)=='(' || s.charAt(l)=='{' || s.charAt(l)=='['){
                st.push(s.charAt(l));
            }else if (!st.isEmpty() && ((s.charAt(l)==')' && st.peek()=='(' ) || (s.charAt(l)=='}' && st.peek()=='{')
                || (s.charAt(l)==']' && st.peek()=='[')))
                {
                    st.pop();
                }
                else {
                    st.push(s.charAt(l));
                
            }
            
            l++;
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
