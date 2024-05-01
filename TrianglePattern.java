public class TrianglePattern {
    public static void main(String[] args) {
        int N = 7;
        generateTrianglePattern(N);
    }

    public static void generateTrianglePattern(int n) {

        // Initialize the starting number
        int startNumber = 1;

        // Iterate over each row
        for (int i = n; i > 0; i--) {
            // Initialize the current number for this row
            int currentNumber = startNumber;
            for (int j = 0; j < i; j++) {
                System.out.print(currentNumber + " ");
                // Calculate the next number for this row
                currentNumber += n - j;
            }

            // Update the start number for the next row
            startNumber++;

            System.out.println();
        }
    }
}
