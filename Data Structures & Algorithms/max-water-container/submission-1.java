class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=0;
        int l=0;
        int r=n-1;
        while(l<r){
            int x=r-l;
            int y=Math.min(heights[l], heights[r]);
            int area= x*y;
            if(max<area){
                max=area;
            }
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
