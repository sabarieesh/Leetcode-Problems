class Solution {
    public int gcdOfOddEvenSums(int n) {
       int even=n*(n-1);
       int odd=n*n;
          int gcd=1;
           while(odd!=0){
           int temp=odd;
            odd=even%odd;
            even=temp;
           }
          
        return even;


    }
}