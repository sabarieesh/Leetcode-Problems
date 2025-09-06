import java.util.*;

class Solution {
    public int calPoints(String[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("C")) {
                
                list.remove(list.size() - 1);
            } 
            else if (arr[i].equals("D")) {
         
                list.add(list.get(list.size() - 1) * 2);
            } 
            else if (arr[i].equals("+")) {
               
                int size = list.size();
                list.add(list.get(size - 1) + list.get(size - 2));
            } 
            else {
                
                list.add(Integer.parseInt(arr[i]));
            }
        }

        int total = 0;
        for (int score : list) {
            total += score;
        }
        return total;
    }
}
