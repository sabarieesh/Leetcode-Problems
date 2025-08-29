import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums); 
        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        
        if(map.isEmpty()) return -1; 
        
        int maxFreq = 0;
        int ans = -1;
        
        // Traverse in sorted order to ensure smallest number chosen in tie
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                int freq = map.get(nums[i]);
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = nums[i];
                }
            }
        }
        
        return ans;
    }
}
