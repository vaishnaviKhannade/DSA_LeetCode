class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> result=new ArrayList<Boolean>(candies.length);
        Boolean t=true;
        
        for(int i=0;i<candies.length;i++)
        {  
            int count=0;
            for(int j=0;j<candies.length;j++)
          {
            if(candies[i]+extraCandies<candies[j])
            {
                count=1;
                break;
            }
          }
            if(count==1)
            {
                result.add(false);
            }
            else
            {
                result.add(true);
            }
            
        }
        return result;
    }
}