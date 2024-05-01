public class ThresholdInArray {
    public static void main(String[] args) {
        int[] arr = {5,8,10,13,6,2};
        int k = 3;

        int count = 0;

        for (int num : arr) {
            if (num % k == 0) {
                count += num/k;
            }
            else {
                count += num/k+1;
            }

        }
        System.out.println(count);
    }
}


/*
 ** Program 4

Sub Topic : Arrays

Array with threshold value
 Given an array and a threshold value find the o/p
i/p {5,8,10,13,6,2}
threshold = 3
o/p count = 17
explanation:
Number          parts               counts
5                    {3,2}                2
8                     {3,3,2}             3
10                   {3,3,3,1}          4
13                   {3,3,3,3,1}       5
6                     {3,3}                2
2                     {2}                   1

 */