class Solution {
    public int sumOfMultiples(int n) {
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=1;i<=n;i++){
        if(i%3==0||i%5==0||i%7==0)
        list.add(i);
    }
    System.out.print(list);
    int sum=0;
    for(int i=0;i<list.size();i++){
        sum=sum+list.get(i);
    }
    return sum;
    }
}