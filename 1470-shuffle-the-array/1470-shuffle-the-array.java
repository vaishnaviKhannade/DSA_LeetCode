class Solution {
    public int[] shuffle(int[] nums, int n) {
           int m=n;
          int[] a=new int[nums.length-n];
          int[] b=new int[nums.length-n];
          int x=0;
          int y=0;
        for(int i=0;i<nums.length-n;i++)
        {
           a[i]=nums[i];
           b[i]=nums[nums.length-m];
           m--;     
        }
        
            for(int l=0;l<nums.length;l++){
               
                if(l%2==0)
                {
                    nums[l]=a[x];
                    x++;
                }
                else
                {
                    nums[l]=b[y];
                    y++;
                }
        }
        return nums;
}
}