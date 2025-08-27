class Solution {
    public int secondHighest(String s) {
       TreeSet<Integer> set=new TreeSet<>();
       for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
         int a = Character.getNumericValue(s.charAt(i));
          set.add(a);
        }
       }
       Integer[] arr = set.toArray(new Integer[0]);
       System.out.println(Arrays.toString(arr));
       if(arr.length<2){
       return -1;}
       if(arr.length==2){
        return arr[0];
       }

       System.out.print(set);
    return arr[arr.length-2];
    }
}