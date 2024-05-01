import java.util.Scanner;

public class fibonacci {
    public static void main (String a[]) {

        System.out.println("Enter the number?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int prevNum = 1, currNum = 2;
        int result = prevNum + currNum;

        for (int i=3; i<=num; i++) {
            result += i;
            currNum = i;
            prevNum = currNum;
        }
        System.out.println("sum of fibonacci is : " + result);
    }
}