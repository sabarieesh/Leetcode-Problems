class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set=new HashSet<>();
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(end>start)
        {
            double avg=(nums[start]+nums[end])/2;
            set.add(avg);
            start++;
            end--;
        }

        return set.size();
    }
}