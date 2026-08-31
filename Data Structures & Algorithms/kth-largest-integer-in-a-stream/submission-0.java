class KthLargest {

    PriorityQueue<Integer> minHeap;
    int maxSize=0;
    public KthLargest(int k, int[] nums) {
        minHeap= new PriorityQueue<>();
        maxSize=k;
        for(int num:nums){
            add(num);
        }
        

    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>maxSize){
            minHeap.poll();
        }
        return minHeap.peek();

    }
}
