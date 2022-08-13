class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet <Integer> s=new HashSet<>();
         for (int j=0;j<nums.length;j++)
         {
           if(  !s.add(nums[j]))
           {
              
               return nums[j];
           }
         }
       return 0;
    }
    
}