class Solution {
    public String largestGoodInteger(String num) {
    TreeSet<Character> set=new TreeSet<>();
String s="";
    for(int i=1;i<num.length()-1;i++){
        if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i-1))
      set.add(num.charAt(i));
    }


    if(set.size()==0)
    return s;
    else{
    System.out.print(set);
    String str = set.toString();

    System.out.print(str);
    for(int i=0;i<3;i++){
s=s+str.charAt(str.length()-2);
    }}
    return s;
     
    }
}