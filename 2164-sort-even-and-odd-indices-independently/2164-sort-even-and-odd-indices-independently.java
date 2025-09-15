class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
         ArrayList<Integer> odd=new ArrayList<>();
            
            for(int i=0;i<nums.length;i++){
         if(i%2==0)
        even.add(nums[i]);
        else
        odd.add(nums[i]);
            }

Collections.sort(even);
Collections.sort(odd,Collections.reverseOrder());
int arr[]=new int[nums.length];
int k=0;
int h=0;

for(int i=0;i<arr.length;i++){
    if(i%2==0){
       arr[i]= even.get(k++);
    }
    else
     arr[i]= odd.get(h++);
}

return arr;
    }
}