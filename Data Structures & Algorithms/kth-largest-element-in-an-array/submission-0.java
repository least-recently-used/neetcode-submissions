class Solution {
    PriorityQueue<Integer> minHeap= new PriorityQueue<>();
    public int findKthLargest(int[] nums, int k) {
        for(int i=0; i<k ; i++){
            minHeap.offer(nums[i]);
        }
        for(int i=k; i<nums.length ; i++){
            if(minHeap.peek()<nums[i]){
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }
}
