class Solution {
    public int[] plusOne(int[] digits) {
        
          
        int i= digits.length-1;
        while(i> -1 && digits[i] == 9){
            digits[i]=0;
            i--;
        }

        if(i==-1){
            int[] data = new int[digits.length+1];
            data[0] = 1;
            return data;
        }
        digits[i]++;
        
        return digits;
    }
 }