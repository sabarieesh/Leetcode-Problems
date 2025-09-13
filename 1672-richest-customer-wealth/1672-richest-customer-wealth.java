class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];

            }
            list.add(sum);
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}