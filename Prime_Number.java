import java.util.*;

public class Prime_Number {
    public static void main (String a[]) {
        while(true) {
            System.out.println("Enter the Number to check prime or not?");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(prime(num));
        }
    }
    
    public static boolean prime(int num) {
        if (num <= 1) { return false; }
        if (num <= 3) { return true; }
        if (num%2 == 0 || num%3 == 0) { return false; }

        for (int i=5; i*i <=num; i+=6) {        // for (int i=5; i<=num/2; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}