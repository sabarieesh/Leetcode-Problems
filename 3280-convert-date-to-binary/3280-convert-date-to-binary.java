class Solution {
    public String convertDateToBinary(String date) {
         String s[]=date.split("-");
         String s1="";
        //  System.out.print(Arrays.toString(s));
        //  return s1;
for(int i=0;i<s.length;i++){
    int a=Integer.parseInt(s[i]);
    s1 += Integer.toBinaryString(a)+"-";
}

return s1.substring(0,s1.length()-1);
    }
}