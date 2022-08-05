class Solution {
    public int minimumOperations(int[] nums) {
        
        int min,i=0,count=0,reminder=1;
       
        i=0;
        
        
        while (reminder!=0)
        {
              reminder=0;i=0;
            
            min=101;
             while(i<nums.length){
            if(nums[i]<min && nums[i]!=0)
            {
                min=nums[i];
            }
            i++; 
        }
            
            if(min==101){return count;}
            
            
            i=0;
           while(i<nums.length)
          {
          
            if(nums[i]!=0)
              {
                nums[i]=nums[i]-min; 
                reminder=1;
                i++;
              }
            else{
                i++;
                }
          }
            count+=1;
      }
        
        return count;
    }
}