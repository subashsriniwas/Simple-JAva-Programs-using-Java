/*
 * Program 6
Sub topic: Number crunching
cyclic number verification
verify the given number is cyclic or not
Input Format
Num1 num2
Constraints
1<=range<=9999999999
Sample Input 1
12345 45123
Sample Output 1
Yes

 */

public class CyclicInteger {
    public static void main(String[] args) {
        System.out.println(helper(12345, 54123));
    }

    private static boolean helper (int num1, int num2) {
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        String str = str1 + str1;
        return str.contains(str2);
    }
}
