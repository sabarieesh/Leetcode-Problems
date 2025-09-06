class Solution {
    public int minOperations(String[] logs) {
        int counts=0;
        int count=0;
        String s1="../";
        String s2="./";

        for(String s: logs){
            if(s.equals(s1))
            count++;
            if(!s.equals(s2)&&!s.equals(s1))
            counts++;
        }
        if(count>counts)
        return 0;
        return counts-count;
    }
}