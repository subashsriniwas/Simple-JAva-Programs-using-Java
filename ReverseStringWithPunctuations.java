import java.util.*;

public class ReverseStringWithPunctuations {
    public static void main(String[] args) {
        String input = "house no : 123@ cbe";
        String reversed = reverseStringWithPunctuations(input);
        System.out.println(reversed);
    }

    public static String reverseStringWithPunctuations(String input) {
        // Step 1: Identify the indices of punctuations and spaces
        List<Integer> punctuationIndices = new ArrayList<>();
        List<Integer> spaceIndices = new ArrayList<>();
        List<Integer> atIndices = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                if (ch == '@') {
                    atIndices.add(i);
                }
                if (ch != ' ' && ch != '@') {
                    punctuationIndices.add(i);
                }
                else {
                    spaceIndices.add(i);
                }
            }
        }

        // Step 2: Reverse the string excluding punctuations and spaces
        StringBuilder reversed = new StringBuilder(input.replaceAll("[^a-zA-Z0-9]", ""));
        reversed.reverse();

        // Step 3: Insert punctuations and spaces back into their original positions
        for (int index : punctuationIndices) {
            char ch = input.charAt(index);
            reversed.insert(index, ch);
        }
        for (int index : spaceIndices) {
            reversed.insert(index, ' ');
        }
        for (int index : atIndices) {
            reversed.insert(index, "@");
        }

        return reversed.toString();
    }
}
