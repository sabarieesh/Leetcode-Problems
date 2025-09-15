class Solution {
    public int[] leftRightDifference(int[] nums) {
         
         int arr[]=new int[nums.length];
         for(int i=0;i<nums.length;i++){
            int left=0;
            int right=0;
            for(int j=0;j<i;j++){
                left=left+nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                right=right+nums[k];
            }
            arr[i]=Math.abs(left-right);
         }
         return arr;
    }
}