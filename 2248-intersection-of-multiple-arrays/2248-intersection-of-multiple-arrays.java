class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                list.add(nums[i][j]);
            }
        }
         
System.out.print(list);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int count=0;

            for(int j=0;j<list.size();j++){
if(list.get(i).equals(list.get(j)))
count++;
            }
            if(count==nums.length){
                if(!ans.contains(list.get(i))){
                ans.add(list.get(i));}
            }
            
        }
        Collections.sort(ans);
return ans;
    }
}