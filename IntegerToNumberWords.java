/*
 * Program 5
Sub Topic: Arrays
Convert number to words
range is 0-999
Sample Input 1
234
Sample Output 1
two hundred and thirty four

 */


public class IntegerToNumberWords {
    public static void main(String[] args) {
        final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        int num = 999;
        String result = "";
        if (num >= 100) {
            result += ones[num/100] + " " + "hundred";
            num %= 100;
        }
        if (num >= 20) {
            result += " " + tens[num/10];
            num %= 10;
        }
        if (num > 10) {
            result += " " + teens[num];
            num %= 10;
        }
        if (num > 0) {
            result += " " + ones[num];
        }

        // System.out.println(num);
        System.out.println(result);
    }
}
