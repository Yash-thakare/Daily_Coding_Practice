class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
 
        if (strs == null || strs.length == 0) {
            return ""; 
        }
        String arr = strs[0];

         for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(arr) != 0) {
                  arr = arr.substring(0, arr.length() - 1);
                       if (arr.isEmpty()) {
                                               return "";
                                            }
            }
        }

     
        return arr;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        
   
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(lcp.longestCommonPrefix(strs2)); // Output: ""
    }
}
