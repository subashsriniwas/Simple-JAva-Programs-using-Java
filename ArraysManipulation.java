public class ArraysManipulation {
    public static void main(String[] args) {
        
        int[] nums = {3, 2, 1, 7, 5, 4};
        System.out.println(helper(nums));
    }

    private static int helper(int[] nums) {

        if (nums.length <= 3) { return 0; }

        int firstEvenMax = Integer.MIN_VALUE;
        int firstOddMax = Integer.MIN_VALUE;
        int evenSecondMax = Integer.MIN_VALUE;
        int oddSecondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) { 
                if (nums[i] > firstOddMax) {
                    oddSecondMax = firstOddMax;
                    firstOddMax = nums[i];
                } 
                if (nums[i] > oddSecondMax && nums[i] != firstOddMax) {
                    oddSecondMax = nums[i];
                }
            } 
            else { 
                if (nums[i] > firstEvenMax) {
                    evenSecondMax = firstEvenMax;
                    firstEvenMax = nums[i];
                }
                if (nums[i] > evenSecondMax && nums[i] != firstEvenMax) {
                    evenSecondMax = nums[i];
                }
            }
        }

        return evenSecondMax + oddSecondMax;
    }
}
