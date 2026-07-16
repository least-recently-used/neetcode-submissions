class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=0;
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                int y=Math.min(heights[i], heights[j] );
                int x=j-i;
                max=Math.max(max, x*y);
            }
        }
        return max;
    }
}
