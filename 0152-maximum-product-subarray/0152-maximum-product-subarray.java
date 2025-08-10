class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0]; // start with first element
        
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) { // start from i, go to end
                product *= nums[j];
                max = Math.max(max, product);
            }
        }
        return max;
    }
}
