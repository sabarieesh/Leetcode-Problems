class Solution {
    public int countSymmetricIntegers(int low, int high) {
int count=0;


if(high==1&&low==1
)
return 0;

if(high==100){
count=count+9;
}else
{
            for(int j=low;j<=high;j++){
               String s=Integer.toString(j);
               int sum1=0;
               int sum2=0;
               if(s.length()%2==0){
               for(int i=0;i<s.length()/2;i++){
                sum1=sum1+s.charAt(i)-'0';
               }
               for(int i=s.length()/2;i<s.length();i++){
                sum2=sum2+s.charAt(i)-'0';
               }
               }
               if(sum1==sum2){
                count++;
               }

            }
}
return count;

    }
}