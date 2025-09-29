class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String s1="";
        for(String a:words){
            s1=s1+a.charAt(0);
        }
      return s.equals(s1);
    }
}