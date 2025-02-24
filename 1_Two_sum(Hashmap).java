import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int c = k- nums[i];
            if (map.containsKey(c)) {
                return new int[] { map.get(c), i };
            }
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int k = 9;
        int[] result1 = twoSum(nums1, k);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); //Output: [0, 1]

        

        
    }
}
