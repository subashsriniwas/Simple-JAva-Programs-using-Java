public class IntegerToBinary {
    public static void main(String[] args) {
        int number = 11;
        String binary = integerToBinary(number);
        System.out.println(binary);
    }

    public static String integerToBinary(int number) {
        // Base case: if the number is 0, return "0"
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        // Convert the number to binary representation
        while (number > 0) {
            // Append the least significant bit to the binary string
            binary.append(number % 2);
            // Shift bits to the right
            number /= 2;
        }

        // Reverse the binary string to get the correct binary representation
        return binary.reverse().toString();
    }
}
