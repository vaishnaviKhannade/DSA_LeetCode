class Solution {
    public String interpret(String command) {
      String p= command.replace("()","o");
       return p.replace("(al)","al");
    }
}