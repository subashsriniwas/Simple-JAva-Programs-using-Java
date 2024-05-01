public class StringReversal {
    public static void main(String[] args) {
        String input = "i love india";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one word, return it as is
        if (str.isEmpty() || !str.contains(" ")) {
            return str;
        }

        // Split the string into words
        String firstWord = str.substring(0, str.indexOf(" "));
        String remainingWords = str.substring(str.indexOf(" ") + 1);

        // Recursive case: reverse the remaining words and append the first word at the end
        return reverseString(remainingWords) + " " + firstWord;
    }
}
