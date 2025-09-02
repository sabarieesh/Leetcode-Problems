class Solution {
    public String firstPalindrome(String[] words) {
        String s2="";
        for(String s:words){
            String s1="";
            for(int i=s.length()-1;i>=0;i--){
                s1=s1+s.charAt(i);
            }
            if(s.equals(s1))
            return s;
        }
        return s2;
    }
}