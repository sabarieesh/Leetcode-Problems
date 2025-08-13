class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           int max=Math.max(0,i-nums[i]);
            for(int j=max;j<=i;j++){
                sum=sum+nums[j];
            }
        }
        return sum;
    }
}