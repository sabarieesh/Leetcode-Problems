class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        HashMap<Character,Integer> mapc=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
            mapc.put(s.charAt(i),mapc.getOrDefault(s.charAt(i),0)+1);

        }
        int max1=0;
        for(Character ch:map.keySet()){
            max1=Math.max(max1,map.get(ch));
        }

int max2=0;
        for(Character ch:mapc.keySet()){
            max2=Math.max(max2,mapc.get(ch));
        }
        
        return max1+max2;
    }
}