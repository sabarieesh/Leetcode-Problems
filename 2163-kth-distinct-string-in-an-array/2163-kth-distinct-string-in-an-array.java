class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        HashMap<String,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
       map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<String>ans=new ArrayList<>();
        for(String i:arr){
            if(map.get(i)==1)
            ans.add(i);
        }
if(ans.size()<k)
return "";

return ans.get(k-1);
    }
}