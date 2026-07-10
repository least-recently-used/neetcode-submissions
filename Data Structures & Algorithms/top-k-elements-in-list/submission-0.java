class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Map.Entry<Integer, Long>> list=
        Arrays.stream(nums)
        .mapToObj(i->(Integer) i)
        .collect(Collectors.groupingBy(x->x, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Comparator.comparing(Map.Entry<Integer, Long>::getValue).reversed())
        .limit(k)
        .toList();
        int i=0;
        int[] arr= new int[k];
        for(Map.Entry<Integer, Long> num : list){
            arr[i]=num.getKey();
            i++;
        }
        return arr;
    }
}
