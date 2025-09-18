class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        
        for(int i=0;i<k;i++){
           int min=Collections.min(list);
            for(int j=0;j<list.size();j++){
                if(list.get(j)==min){
                    list.set(j,min*multiplier);
                    break;
                }
            }

        }
        System.out.println(list);
int arr[]=new int[list.size()];
for(int i=0;i<arr.length;i++){
    arr[i]=list.get(i);
}
return arr;
    }
}