/* Input:n = 4 
Output:
   0     j = 1, i = 0
  101    j = 1,i = 1
 21012   j = 1, i = 2
3210123
*/

public class zohoPattern {
    public static void main(String[] args) {

        int n = 4;

        for (int i=0; i<n; i++) {

            int spaces = n-(i+1);
            
            for (int k=1; k<=spaces; k++) {
                System.out.print(" ");
            }
            for (int j=i; j>=0; j--) {
                System.out.print(j);
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            if (i != n-1)
               System.out.println();
        }
    }
}
