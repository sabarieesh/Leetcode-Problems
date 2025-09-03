class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][]=new int[r][c];
       if(mat.length*mat[0].length!=r*c)
       return mat;

ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        int a=0;
        // int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            if(a<list.size()){
arr[i][j]=list.get(a);
a++;}
         }
        }
        return arr;
    }
}