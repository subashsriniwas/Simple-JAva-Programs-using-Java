public class MedianOfTwoArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int totalLength = nums1.length + nums2.length;

        if (totalLength % 2 == 0) {
            return (findKthElement(nums1, nums2, totalLength / 2) + findKthElement(nums1, nums2, totalLength/2-1)) / 2.0;
        } else {
            return findKthElement(nums1, nums2, totalLength / 2);
        }
    }

    private double findKthElement(int[] nums1, int[] nums2, int k) {
        int index1 = 0, index2 = 0;
        int count = 0;
        int num1 = 0, num2 = 0;

        while (count <= k) {
            if (index1 == nums1.length) {
                num2 = nums2[index2++];
            } else if (index2 == nums2.length) {
                num1 = nums1[index1++];
            } else if (nums1[index1] <= nums2[index2]) {
                num1 = nums1[index1++];
            } else {
                num2 = nums2[index2++];
            }

            count++;
        }

        if (k % 2 == 0) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,9};
        int[] nums2 = {2,4};
        MedianOfTwoArrays solution = new MedianOfTwoArrays();
        System.out.println(solution.findMedianSortedArrays(nums1, nums2)); 
    }
}
