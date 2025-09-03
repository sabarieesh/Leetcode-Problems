class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       ArrayList<Integer> list=new ArrayList<>();
    for(int i=left;i<=right;i++){
   int a=i;
boolean ans=true;
   while(a>0){
      int dig=a%10;
     if(dig==0||i%dig!=0){
     ans=false;
     break;
     }
     a=a/10;

   }

   if(ans)
   list.add(i);
    
        }
        return list;
    }
}