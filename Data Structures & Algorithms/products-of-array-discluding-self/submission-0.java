class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
       int[] res= new int[n];

        res[0]=1;
       for(int i=1; i<n; i++){
        res[i]=res[i-1]*arr[i-1];
       }
       int suffix=1;
       for(int i=n-1;i>=0; i--){
        res[i]=suffix*res[i];
        suffix=suffix*arr[i];
       }
        // 1,1,2,6
        // 1,2,4,6
       return res;

    }
}  
