class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    backtrack(nums, 0, path, result);
    return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> path, List<List<Integer>> result) {
        // At each call, the current `path` represents one subset — add a snapshot
        result.add(new ArrayList<>(path));
        
        // Try adding each remaining element
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);                              // MAKE the choice
            backtrack(nums, i + 1, path, result);           // RECURSE
            path.remove(path.size() - 1);                   // UNDO the choice
        }
    }
}
