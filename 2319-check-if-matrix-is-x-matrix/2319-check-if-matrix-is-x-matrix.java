class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int sum1=0;
        int sumz=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==j||i+j==grid.length-1){
                if(grid[i][j]!=0)
               sum1++;
                }
                else{
                    if(grid[i][j]==0)
                    sumz++;
                }
            }
        }
        if(sum1+sumz==grid.length*grid.length){
        return true;}
        return false;
    }
}