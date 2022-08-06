class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        int j=0;
       
        while(i!=m+n)
        {
            nums1[i]=nums2[j];
            j++;
            i++;
        }
        for( i=0;i<(m+n);i++)
        {
             for( j=i+1;j<(m+n);j++)
            if(nums1[i]>nums1[j])
            {
                int p=nums1[j];
                nums1[j]=nums1[i];
                nums1[i]=p;
            }
        }
    }
}