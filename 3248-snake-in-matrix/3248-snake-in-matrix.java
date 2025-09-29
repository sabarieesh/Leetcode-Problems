class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int count=0;
        for(String s:commands){
            if(s.equals("RIGHT"))
            count++;
            else if(s.equals("LEFT"))
            count--;
            else if(s.equals("DOWN"))
            count=count+n;
            else
            count=count-n;
        }
        return count;
    }
}