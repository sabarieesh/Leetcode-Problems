class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int arr[]=new int[points.length];
        int k=0;
        for(int i=0;i<points.length;i++){
arr[k++]=points[i][0];
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]-arr[i-1]);
        }
        return max;
    }
}