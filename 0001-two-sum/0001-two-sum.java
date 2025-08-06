class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); // A mapping to store numbers and their indices
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required number to reach the target
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i}; // Return indices of the complement and current number
            }
            numMap.put(nums[i], i); // Store the number with its index
        }
        return new int[]{}; // This line is never reached due to the problem guarantee
    }
}