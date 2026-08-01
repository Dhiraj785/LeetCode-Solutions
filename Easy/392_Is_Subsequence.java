class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sIndex = 0;
        int start = 0;
        int end = t.length()-1;
        if(s.length() == 0){
            return true;
        }
        while(start <= end){
            if(s.charAt(sIndex) == t.charAt(start)){
                sIndex++;
            }
            if(sIndex == s.length()){
                    return true;
            }
            start++;
        }
        return false;
    }
}