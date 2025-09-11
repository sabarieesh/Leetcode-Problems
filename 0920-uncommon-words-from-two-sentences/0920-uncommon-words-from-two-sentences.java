class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
      ArrayList<String> list=new ArrayList<>();
      for(int i=0;i<arr1.length;i++){
        list.add(arr1[i]);
      }

      for(int i=0;i<arr2.length;i++){
        list.add(arr2[i]);
      }
HashMap<String,Integer> map=new HashMap<>();
      for(int i=0;i<list.size();i++){
map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
      }

       ArrayList<String> ans=new ArrayList<>();
      for(int i=0;i<list.size();i++){
        if(map.get(list.get(i))==1)
        ans.add(list.get(i));
      }

        String arr[]=new String[ans.size()];
     for(int i=0;i<ans.size();i++){
        arr[i]=ans.get(i);
     }
     return arr;
    }
}