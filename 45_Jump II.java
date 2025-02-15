public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            
            farthest = Math.max(farthest, i + nums[i]);
            
         
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        
        return jumps;
    }

    public static void main(String[] args) {
        JumpGameII jumpGame = new JumpGameII();
        
       
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps for nums1: " + jumpGame.jump(nums1)); // Output: 2
        
       
        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println("Minimum jumps for nums2: " + jumpGame.jump(nums2)); // Output: 2
    }
}
