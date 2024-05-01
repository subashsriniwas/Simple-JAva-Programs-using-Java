public class tcsques1 {
    public static void main(String[] args) {

        int[] nums = {3,4,-5,-1, 3, 2, 2};
        int target = 711;
        System.out.println(helper(nums, target));
    }

    private static String helper(int[] nums, int target) {

        int sum = 0;
        String res = "";

        for (int i=0; i<nums.length; i++) {

            sum += nums[i];
            res += i;

            if (sum>target) { 
                sum = 0; 
                res = "";
            }

            if (sum == target) { 
                return res;
            }
        }
        return res;
    }
}
