class Solution {
    public boolean digitCount(String num) {
     for(int i=0;i<num.length();i++){
        int nums=num.charAt(i)-'0';
        int count=0;
        for(int j=0;j<num.length();j++){
            if(num.charAt(j)-'0'==i)
            count++;
        }
        if(count!=nums)
return false;

     }

      return true;
    }
}