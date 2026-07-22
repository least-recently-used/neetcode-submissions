class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Deque<Integer> st=new ArrayDeque<>();
        
        for(int i=0; i<n;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int b= st.pop();
                int a= st.pop();
                String operator=tokens[i];
                // System.out.println(a +" " + b);
                int result=0;
                if (operator.equals("+")) {
                    result = a + b;
                } else if (operator.equals("-")) {
                    result = a - b;
                } else if (operator.equals("*")) {
                    result = a * b;
                } else if (operator.equals("/")) {
                    result = a / b;
                }
                st.push(result);
            }else{
                // System.out.println("Out");
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}
