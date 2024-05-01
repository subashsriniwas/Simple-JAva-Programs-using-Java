
import java.util.*;

public class Palin {
    public static void main(String a[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the palindrome to check:");
        String str = s.next();
        s.close();

        char[] A = str.toCharArray();

        isPalin(A);

    }   
    

    public static void isPalin(char[] A){

        boolean flag = true;

        int i = 0;
        int j = A.length -1;

        while (i<j){
            if (A[i] != A[j]){
                flag = false;
                break;
            }
                
            i++;
            j--;
        }

        if (flag == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
