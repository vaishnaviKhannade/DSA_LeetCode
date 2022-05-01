class Solution {
    public boolean isPalindrome(int x) {
           int check=x;
        int ans=0;
      int   reminder=0;
        
         if(x<0)
        {
              return false;
        }
        else
        {      
          while(x!=0)
           {
            reminder= x %10;
            x=x/10;   
            ans=ans *10+reminder; 
           }
       
          
            if(ans==check)
           {
             return true;
            }
            else 
            {return false;}
         }
    }
}