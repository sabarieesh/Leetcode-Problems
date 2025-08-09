class Solution {
    public int countDigits(int nums) {
        int num=nums;
        
        int count=0;
        while(num>0){
            int digit=num%10;
            if(nums%digit==0)
            count++;
            num=num/10;
        }
        return count;
    }
}