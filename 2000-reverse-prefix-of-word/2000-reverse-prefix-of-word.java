class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=word.indexOf(ch);
        String s="";
        for(int i=ind;i>=0;i--){
            s=s+word.charAt(i);
        }
        for(int i=ind+1;i<word.length();i++){
            s=s+word.charAt(i);
        }
        return s;
    }
}