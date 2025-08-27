class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count=0;
      char ch=s.charAt(0);
      for(int i=0;i<s.length();i++){
 if(ch==s.charAt(i))
 count++;

      }
      for(int i=0;i<s.length();i++){
        int count1=0;
        char c=s.charAt(i);
        for(int j=0;j<s.length();j++){
            if(c==s.charAt(j))
            count1++;
        }
        if(count!=count1){
            return false;
           
            
        }
        
      }

return true;

    }
}