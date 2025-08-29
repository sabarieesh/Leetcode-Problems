class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                String temp=""+Character.toUpperCase(ch);
                if(word.contains(temp) && !arr.contains(ch)){
                    arr.add(ch);
                }
            }
        }
        return arr.size();
    }
}