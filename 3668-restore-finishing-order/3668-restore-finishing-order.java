class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> frd=new ArrayList<>();
        for(int i=0;i<friends.length;i++)
{
    frd.add(friends[i]);

}        
for(int i=0;i<order.length;i++){
    if(frd.contains(order[i]))
    list.add(order[i]);
}
int arr[]=new int[list.size()];
for(int i=0;i<list.size();i++){
    arr[i]=list.get(i);
}
return arr;
    }
}