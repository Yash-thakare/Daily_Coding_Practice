import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
       
        Arrays.sort(citations);
        int n = citations.length;

     
        for (int i = 0; i < n; i++) {

            if (citations[i] >= n - i) {
                return n - i; 
            }
        }
        
        return 0; 
    }

    public static void main(String[] args) {
        HIndex hIndexCalculator = new HIndex();
        
        // Example 1
        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println("H-Index: " + hIndexCalculator.hIndex(citations1)); // Output: 3
        
        // Example 2
        int[] citations2 = {1, 3, 1};
        System.out.println("H-Index: " + hIndexCalculator.hIndex(citations2)); // Output: 1
    }
}
