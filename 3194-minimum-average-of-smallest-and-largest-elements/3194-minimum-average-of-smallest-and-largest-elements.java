class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min=nums[nums.length-1];
        int start=0;
        int end=nums.length-1;
        while(start<end){
            
            float avg=((float)nums[start]+(float)nums[end])/2;
            min=Math.min(avg,min);
            end--;
            start++;

        }
        return min;
    }
}