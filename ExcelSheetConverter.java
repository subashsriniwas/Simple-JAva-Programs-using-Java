public class ExcelSheetConverter {
    public static void main(String[] args) {
        int[] inputs = {1, 26, 27, 676};
        for (int input : inputs) {
            String result = convertToExcelSheet(input);
            System.out.println(input + " -> " + result);
        }
    }

    public static String convertToExcelSheet(int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            num--; // Decrement by 1 since Excel column labels start from 1

            int remainder = num % 26; // Calculate remainder
            char digit = (char) (remainder + 'A'); // Convert remainder to corresponding alphabet
            result.append(digit);

            num /= 26; // Update number with quotient
        }

        return result.reverse().toString(); // Reverse the result to get correct order of alphabets
    }
}
