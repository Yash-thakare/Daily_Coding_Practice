class Solution {
    public boolean isSubsequence(String s, String t) {
        int sx = 0, tx = 0; 

   
        while (sx < s.length() && tx < t.length()) {
         
            if (s.charAt(sx) == t.charAt(tx)) {
                sx++;
            }
            
            tx++; 
        }

       
        return sx == s.length(); 
    }

public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isSubsequence("abc", "ahbgdc")); // true
    System.out.println(solution.isSubsequence("axc", "ahbgdc")); // false
}

}
