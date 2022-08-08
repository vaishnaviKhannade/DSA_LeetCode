class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int count=0;
        
        for( int j=0;j<jewels.length();j++)
        {
            for(int k=0;k<stones.length();k++)
            {   
                char p=jewels.charAt(j);
                char c=stones.charAt(k);
                if(p==c)
                    count+=1;
            }
        }
        return count;
    }
}