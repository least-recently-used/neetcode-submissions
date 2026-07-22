class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        Deque<Integer> s=new ArrayDeque<>();
        int[] ans= new int[n];
        s.push(0);
        for(int i=1; i<n;i++){
            
            while(!s.isEmpty() && temp[i]>temp[s.peek()]){
                ans[s.peek()]=i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        return ans;
    }
}
