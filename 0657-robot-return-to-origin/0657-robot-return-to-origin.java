class Solution {
    public boolean judgeCircle(String moves) {
        int countup=0;
        int countlr=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')
            countup++;
            else if(moves.charAt(i)=='D')
            countup--;
            else if(moves.charAt(i)=='L')
            countlr++;
            else if(moves.charAt(i)=='R')
            countlr--;

        }
        boolean ans=false;
        if(countup==0&&countlr==0)
        ans=true;

        return ans;

    }
}