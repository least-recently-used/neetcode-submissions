class Solution {
    PriorityQueue<Integer> maxHeap;
    Map<Integer, Integer> map;
    public int lastStoneWeight(int[] stones) {
        maxHeap=new PriorityQueue<>((a,b)-> b-a);
 
        for(int stone: stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size()>1){
            int heavy=maxHeap.poll();
            int light= maxHeap.poll();

            if(heavy!=light){
                maxHeap.offer(heavy-light);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
