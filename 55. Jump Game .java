class JumpGame {
    public boolean canJump(int[] nums) {
        int maxV = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxV) {
                return false; 
            }
            maxV = Math.max(maxV, i + nums[i]); 
            if (maxV >= nums.length - 1) {
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(new int[]{2, 3, 1, 1, 4})); // Output: true
        System.out.println(jumpGame.canJump(new int[]{3, 2, 1, 0, 4})); // Output: false
    }
}
