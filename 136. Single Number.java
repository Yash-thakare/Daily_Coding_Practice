public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;

 
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();

        // Test cases
        int[] nums1 = {2, 2, 1};
        System.out.println(sn.singleNumber(nums1)); // Output: 1

     
    }
}
