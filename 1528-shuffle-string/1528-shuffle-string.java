class Solution {
    public String restoreString(String s, int[] indices) {
        
      
        char [] array=new char[indices.length];
        for(int i=0;i<s.length();i++){
          int temp=indices[i];
           array[temp] = s.charAt(i);
                 
        }
           String sb=new String(array);
     return sb;
    }
   
}