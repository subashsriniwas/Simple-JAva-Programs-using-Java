public class DeletingStr2InStr1 {
    public static void main(String[] args) {
        String str1 = "experience";
        String str2 = "enc";

        int[] freq = new int[256]; // Increase array size to accommodate all possible characters
        StringBuilder sb = new StringBuilder();

        // Increment frequency of characters in str1
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }
        
        // Decrement frequency of characters in str2
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]++;
        }
        
        // Append characters from str1 to sb if their frequency is positive
        for (int i = 0; i < str1.length(); i++) {
            if (freq[str1.charAt(i)] == 1) {
                sb.append(str1.charAt(i));
            }
        }
        
        // Convert StringBuilder to String
        String result = sb.toString();
        System.out.println(result); // Print or use the result as needed
    }
}
