class Solution {
    public int reverseDegree(String s) {
        int sum=0;
int j=1;
        for(int i=0;i<s.length();i++){
sum=sum+(('z'-s.charAt(i)+1)*j);
j++;
        }
        return sum;
    }
}