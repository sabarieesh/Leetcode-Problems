class Solution {
    public String sortVowels(String s) {
        
  ArrayList<Character> list=new ArrayList<>();
  for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
    list.add(s.charAt(i));

  }

  Collections.sort(list);
  
  System.out.print(list);
StringBuilder str=new StringBuilder();
int k=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
str.append(list.get(k)) ;
k++;}
else
str.append(s.charAt(i));
}
System.out.print(str);
  return str.toString();


    }
}