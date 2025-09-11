class Solution {
    public int countWords(String[] words1, String[] words2) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words1.length;i++){
            int count=0;
            int count1=0;
            for(int j=0;j<words1.length;j++){
                if(words1[i].equals(words1[j]))
                count++;
            }

             for(int j=0;j<words2.length;j++){
                if(words1[i].equals(words2[j]))
                count1++;
            }
            if(count==1&&count1==1&&!list.contains(words1[i]))
            list.add(words1[i]);
        }
        return list.size();
    }
}