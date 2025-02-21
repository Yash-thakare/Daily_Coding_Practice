class ValidPalindrome {
    public static boolean isPalindrome(String s) {
       
        StringBuilder sc= new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
               sc.append(Character.toLowerCase(c));
            }
        }
        
       
        String Str = sc.toString();
        int left = 0;
        int right = Str.length() - 1;
        
        while (left < right) {
            if (Str.charAt(left) != Str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        
        return true; 
    }

    public static void main(String[] args) {
       
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); 
        System.out.println(isPalindrome("race a car")); 
        System.out.println(isPalindrome(" ")); 
    }
}
