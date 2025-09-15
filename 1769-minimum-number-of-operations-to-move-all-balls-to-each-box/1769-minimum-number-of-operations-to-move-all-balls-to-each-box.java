class Solution {
    public int[] minOperations(String boxes) {
      int arr[]=new int[boxes.length()];
       for(int i=0;i<boxes.length();i++){
        int dif=0;
        for(int j=0;j<boxes.length();j++){
            if(boxes.charAt(j)=='1')
            dif=dif+Math.abs(i-j);
            
        }
        arr[i]=dif;       }  
        return arr;
    }
}