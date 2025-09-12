class Solution {
    public int gcdOfOddEvenSums(int n) {
       int even=n*(n-1);
       int odd=n*n;
          int gcd=1;
          for(int i=1;i<=odd&&i<=even;i++){
            if(even%i==0&&odd%i==0)
            gcd=i;
          }
        return gcd;


    }
}