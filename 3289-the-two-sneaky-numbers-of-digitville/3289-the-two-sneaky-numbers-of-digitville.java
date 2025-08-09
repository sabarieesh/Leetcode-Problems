class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[2];
        int j=0;
       for(int key:map.keySet()){
        if(map.get(key)==2){
        arr[j]=key;
        j++;
        }
        if(j==3)
        break;

       }
        return arr;
    }
}