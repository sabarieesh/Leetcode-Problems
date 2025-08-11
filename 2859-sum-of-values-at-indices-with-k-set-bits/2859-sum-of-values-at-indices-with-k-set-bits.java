class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int arr[]=new int[nums.size()];
        int l=0;
        for(int i=0;i<nums.size();i++){
            String s=Integer.toBinaryString(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1')
                count++;
            }
            arr[l]=count;
            l++;

        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
         sum=sum+nums.get(i);
        }
        return sum;
    }
}