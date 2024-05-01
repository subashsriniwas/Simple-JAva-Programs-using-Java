public class addBinaryNum {
    public static void main(String[] args) {
        String num1 = "1010";
        String num2 = "11001";
        int base = 2;
        int carry = 0;

        StringBuilder res = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;

        while (i >=0 || j >=0) {
            int digit1 = (i >= 0) ? Character.digit(num1.charAt(i), base) : 0;
            int digit2 = (j >= 0) ? Character.digit(num2.charAt(j), base) : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / base;

            res.insert(0, sum%base);

            i--;
            j--;
        }

        if (carry > 0) {
            res.insert(0, carry);
        }

        System.out.println(res.toString());
    }
}
