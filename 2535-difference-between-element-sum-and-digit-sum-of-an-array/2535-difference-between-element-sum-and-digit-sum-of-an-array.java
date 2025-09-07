class Solution {
    public int differenceOfSum(int[] nums) {
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
     }
     int sum1=0;
     for(int i:nums){

        while(i>0){
            int dig=i%10;
            sum1=sum1+dig;
            i=i/10;
        }
     }
     return sum-sum1;

    }
}