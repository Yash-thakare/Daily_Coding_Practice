 class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
      
        int left = 0;
        int right = numbers.length - 1;

  
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
          
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++; 
            } else {
                right--;
            }
        }

        return new int[] {-1, -1}; 
    }

    public static void main(String[] args) {
       
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(numbers1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Output: [1, 2]

        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        int[] result2 = twoSum(numbers2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 3]

       
    }
}
