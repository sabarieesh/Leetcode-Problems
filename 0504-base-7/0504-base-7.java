class Solution {
    public String convertToBase7(int nums) {
        
boolean negative=nums<0;

       StringBuilder s=new StringBuilder();
       int num=Math.abs(nums);
       while(num!=0){
        int digit=num%7;
       s.append(digit);
        num=num/7;
       } 
       if(negative)
       {
        s.append('-');

       }
       
       return s.reverse().toString();
      
    }
}