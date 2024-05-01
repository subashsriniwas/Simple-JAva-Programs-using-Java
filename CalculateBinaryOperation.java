public class CalculateBinaryOperation {
    public static void main(String[] args) {
        
        String str = "1C0C1C1A0B1";
        System.out.println(helper(str));
    }

    private static int helper(String str) {
        if (str.length()%2 == 0 || str == null) {
            return -1;
        }

        int res = Character.getNumericValue(str.charAt(0));

        for (int i=1; i<str.length()-1; i+=2) {
            char operator = str.charAt(i);
            int operand = Character.getNumericValue(str.charAt(i+1));

            if (operator == 'A') {
                res = res & operand;
            }
            else if (operator == 'B') {
                res = res | operand;
            }
            else if (operator == 'C') {
                res = res ^ operand;
            }
        }

        return res;

    }
}
