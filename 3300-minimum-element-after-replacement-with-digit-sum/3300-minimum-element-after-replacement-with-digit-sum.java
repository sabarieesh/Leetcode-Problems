class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                
                int dig=n%10;
                sum=sum+dig;
                n=n/10;
            }
            list.add(sum);
        }
       return Collections.min(list);
    }
}