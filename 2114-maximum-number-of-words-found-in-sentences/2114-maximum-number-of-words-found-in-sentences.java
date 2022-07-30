class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i=0;i<sentences.length;i++)
        {  int temp;
           temp = sentences[i].split(" ").length;
         if (temp > count){
             count  = temp;
         }
        }
        return count;
        
    }
}