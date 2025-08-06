class Solution {
    public List<Integer> findWordsContaining(String[] words, char x)
     {
        ArrayList<Integer> list=new ArrayList<>();

     for(int i=0;i<words.length;i++){
        if(words[i].indexOf(x)!=-1)
        list.add(i);
        // if(list.size()>1)
        // break;
     }
     return list;
    }
}