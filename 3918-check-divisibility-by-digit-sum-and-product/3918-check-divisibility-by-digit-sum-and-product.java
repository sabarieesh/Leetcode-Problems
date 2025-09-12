class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum=0;
        int mul=1;
        while(a>0){
            int dig=a%10;
            sum=sum+dig;
            mul=mul*dig;
            a=a/10;
        }
        if(n%(mul+sum)==0)
        return true;
        return false;

    }
}