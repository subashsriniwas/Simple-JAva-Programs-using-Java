public class DecompressString {
    public static void main(String[] args) {
        
        String str = "j8b8n9j7m7v87";
        StringBuilder sb = new StringBuilder();

        // int prevDigi = 0;
        char prevChar = ' ';
        for (int i=0; i<str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                prevChar = str.charAt(i);
            }
            else if (Character.isDigit(str.charAt(i))) {
                int n = str.charAt(i) - '0';
                for (int j=0; j<n; j++)
                    sb.append(prevChar);
            }
        }
        System.out.println(sb.toString());
    }
}
