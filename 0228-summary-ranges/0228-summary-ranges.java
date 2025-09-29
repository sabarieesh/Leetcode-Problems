class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start=0;
        int end=1;
         
         ArrayList<String> list=new ArrayList<>();
        while(end<=nums.length){
            if(end == nums.length || nums[end] != nums[end - 1] + 1){
            if(start==end-1){
            list.add(String.valueOf(nums[start]));
            }
            else{
                list.add(nums[start] + "->" + nums[end-1]);
            }

            start=end;
            }
            end++;
        }
        return list;
    }
}