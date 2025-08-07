class Solution {
    public int sumBase(int n, int k) {
  String s="";
  while(n>0){
    int r=n%k;
    s=r+s;
    n=n/k;
  }
int sum=0;
int num=Integer.parseInt(s);
while(num>0){
    int r=num%10;
    sum=sum+r;
    num=num/10;
}
return sum;
    }
}