class Solution {
    public String replaceDigits(String s) {
        StringBuilder str=new StringBuilder();

        for(int i=0;i<s.length();i++){
  if(Character.isDigit(s.charAt(i))){
  int a=(int)s.charAt(i-1);
  int b=s.charAt(i)-'0';
  int sum=a+b;
  str.append((char)sum);
  
  }
  else
  str.append(s.charAt(i));

        }
        return str.toString();
    }
}