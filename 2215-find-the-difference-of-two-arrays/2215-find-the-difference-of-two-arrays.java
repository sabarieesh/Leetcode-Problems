class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1=new ArrayList();
         ArrayList<Integer> list2=new ArrayList();
          
         for(int i=0;i<nums1.length;i++){
            int count=0;

            for(int j=0;j<nums2.length;j++){
           if(nums1[i]==nums2[j])
           count++;
            }
            if(count==0){
if(!list1.contains(nums1[i]))
 list1.add(nums1[i]);
            }
            
         }

         for(int i=0;i<nums2.length;i++){
            int count=0;

            for(int j=0;j<nums1.length;j++){
           if(nums2[i]==nums1[j])
           count++;
            }
            if(count==0){
                if(!list2.contains(nums2[i]))
 list2.add(nums2[i]);
            }
           
         }
System.out.print(list1);
System.out.print(list2);
         ArrayList<List<Integer>> ans=new ArrayList<>();
         ans.add(list1);
         ans.add(list2);
         return ans;
    }
}