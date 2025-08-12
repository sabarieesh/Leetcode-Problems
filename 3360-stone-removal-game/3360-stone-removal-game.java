class Solution {
    public boolean canAliceWin(int n) {
        int i = 10;
        boolean aliceTurn = true;

        while (n > 0 && i > 0) {
            if (n >= i) {
                n -= i;
            } else {
                return !aliceTurn;
            }
            i--;
            aliceTurn = !aliceTurn;
        }
        return !aliceTurn;
    }
}
