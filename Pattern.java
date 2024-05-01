/*
Program 16:
Sub topic: Arrays
Pattern
Sample Input 1
4
Sample Output 1
4444
4334
4334
4444

*/

public class Pattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows and columns

        // Iterate over each row
        for (int i = 0; i < n; i++) {
            // Iterate over each column
            for (int j = 0; j < n; j++) {
                // If it's the first or last row, or the first or last column, print '4'
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("4");
                } else {
                    // Otherwise, print '3'
                    System.out.print("3");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
