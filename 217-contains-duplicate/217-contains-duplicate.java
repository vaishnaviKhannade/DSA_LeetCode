
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
  
        
        Set<Integer> s = new HashSet<>();
        for(int x : nums){
            s.add(x);
        }      
            if(s.size()==nums.length)
                return false;
            return true;

}
}