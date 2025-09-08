class Solution {
    public boolean checkRecord(String s) {
       int countA=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A')
      countA++;
       }  
       boolean ans=false;
       
       for(int i=0;i<=s.length()-3;i++){
         if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L')
         ans=true;
       }
       

      return countA<2&&!ans;
    }
}