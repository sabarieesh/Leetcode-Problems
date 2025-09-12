class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0)
            even=even+i;
            else
            odd=odd+i;
        }
          int gcd=1;
          for(int i=1;i<=odd&&i<=even;i++){
            if(even%i==0&&odd%i==0)
            gcd=i;
          }
        return gcd;


    }
}