class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
       ArrayList<Integer> list=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++) {
  map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
for(int i=0;i<nums.length;i++){
    if(!list.contains(nums[i]))
    list.add(nums[i]);
}

 ArrayList<Integer> ans=new ArrayList<>();

for(int i:list){
    int a=map.get(i);
    if(a==2)
    ans.add(i);
    int count=0;
    for(int j=2;j<=a/2;j++){
        if(a%j==0)
        count++;
    }
    if(count==1)
    ans.add(i);
}

if(ans.size()>0)
return true;
       return false;
    }
}