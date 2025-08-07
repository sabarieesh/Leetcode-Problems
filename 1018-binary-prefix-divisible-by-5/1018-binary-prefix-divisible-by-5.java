class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Boolean> list1=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            String s="";
            for(int j=0;j<=i;j++)
            {
             s=s+nums[j];

            }
            list.add(s);
         }
 ArrayList<Long> list2=new ArrayList<>();
for(int i=0;i<list.size();i++){
    list2.add(Long.parseLong(list.get(i),2));
}
// System.out.print(list2);

for(int i=0;i<list2.size();i++){
    if(list2.get(i)%5==0)
    list1.add(true);
    else
    list1.add(false);
}
      return list1;   
         
    }
}