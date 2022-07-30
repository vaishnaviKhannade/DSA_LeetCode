class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int temp;
        for(int i=0;i<sentences.length;i++)
        {  
           temp = sentences[i].split(" ").length;
         if (temp > count){
             count  = temp;
         }
        }
        return count;
        
    }
}