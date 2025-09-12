class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            int dig=n%10;
            list.add(dig);
            n=n/10;
        }
        Collections.sort(list);
        return list.get(list.size()-1)*list.get(list.size()-2);
    }
}