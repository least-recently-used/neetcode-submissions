class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Deque<String> st=new ArrayDeque<>();
        Integer result=0;
        for(int i=0; i<n;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                Integer b= Integer.parseInt(st.pop());
                Integer a= Integer.parseInt(st.pop());
                String operator=tokens[i];
                // System.out.println(a +" " + b);

                if (operator.equals("+")) {
                    result = a + b;
                } else if (operator.equals("-")) {
                    result = a - b;
                } else if (operator.equals("*")) {
                    result = a * b;
                } else if (operator.equals("/")) {
                    result = a / b;
                }
                st.push(result.toString());
            }else{
                // System.out.println("Out");
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.pop());
    }
}
