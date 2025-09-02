class Solution {
    public int diagonalSum(int[][] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(i==j||i+j==nums.length-1)
                sum=sum+nums[i][j];
            }
        }
        return sum;
    }
}