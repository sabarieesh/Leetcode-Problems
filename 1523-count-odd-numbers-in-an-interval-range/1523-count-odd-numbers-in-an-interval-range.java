class Solution {
    public int countOdds(int low, int high) {
        int tot=(high-low+1);
        return tot/2+((low%2!=0&&high%2!=0)?1:0);
    }
}
