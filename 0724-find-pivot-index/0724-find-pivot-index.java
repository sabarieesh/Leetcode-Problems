class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=0;
         for(int j=0;j<i;j++){
            left=left+nums[j];
         }
         for(int k=i+1;k<nums.length;k++){
            right=right+nums[k];
         }
         if(right==left)
         return i;
        }
        return -1;
    }
}