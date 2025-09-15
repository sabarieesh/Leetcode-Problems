class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String s:word1){
            for(int i=0;i<s.length();i++){
                s1=s1+s.charAt(i);
            }
        }
        for(String s:word2){
            for(int i=0;i<s.length();i++){
                s2=s2+s.charAt(i);
            }
        }
if(s1.equals(s2))
return true;

return false;

    }
}