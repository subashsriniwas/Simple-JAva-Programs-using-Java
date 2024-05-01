public class Passw {
    public static void main(String[] args) {
        String input = "Subash2";
        System.out.println(helper(input));
    }

    private static int helper(String str) {

        if (str.length() < 4 || str.charAt(0) == ' ' || str.charAt(0) == '/') { return 0; }

        boolean charflag = false;
        boolean numflag = false;

        for (char ch : str.toCharArray()) {

            if (!Character.isUpperCase(ch)) {
                charflag = true;
            }
            if (Character.isDigit(ch)) {
                numflag = true;
            }
        }
        return (charflag && numflag) ? 1 : 0;
    }
}