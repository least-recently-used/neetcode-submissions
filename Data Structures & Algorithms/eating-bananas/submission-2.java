class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // find min and max of piles
        // means in one hour koko can eat one of min to max values

        int l=1;
        int r=Integer.MIN_VALUE;

        for(int pile:piles){
            
            r=Math.max(r, pile);
        }
        int res=0;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(canFinish(mid, h, piles)){
                res=mid;
                r=mid-1;
            }else {
                l=mid+1;
            }

        }
        return res;
    }

    boolean canFinish(int mid, int h, int[] piles){
        int hrsTaken=0;
        for(int pile : piles){
            hrsTaken=hrsTaken+ (int)Math.ceil((double) pile/mid);
            if(hrsTaken>h) return false;
        }
        return true;
    }
}
