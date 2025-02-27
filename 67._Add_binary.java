 class Solution {
   public  String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;

        while (i >= 0 || j >= 0 || c > 0) {
            int sum = c;
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; 
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; 
            }
            result.append(sum % 2); 
            c = sum / 2; 
        }

        return result.reverse().toString(); 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1"));
        System.out.println(solution.addBinary("1010", "1011")); 
    }
}
