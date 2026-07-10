class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // each word-> sort - Map <sorted word, list>
        Map<String, List<String>> map= new HashMap<>();
        for(String str: strs){
            // sort key
            char[] arr= str.toCharArray();
            Arrays.sort(arr);
            String key=String.copyValueOf(arr);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
