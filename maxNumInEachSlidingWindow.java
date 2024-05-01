

public class maxNumInEachSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 1, 8, 6, 9};
        int k = 3;

        int max;
        for (int i=0; i<nums.length-k; i++) {
            max = Integer.MIN_VALUE;
            for (int j=i; j<i+k+1; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
