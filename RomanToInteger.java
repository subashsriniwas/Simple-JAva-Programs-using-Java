
import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
        String romanQues = "XXIII";
        int preNum = 0;
        int result = 0;
        
        for (int i=0; i<romanNumerals.length; i++) {
            map.put(romanNumerals[i], i+1);
        }

        for (int i=romanQues.length()-1; i>=0; i--) {
            int currNum = map.get(String.valueOf(romanQues.charAt(i)));
            if (currNum < preNum) {
                result -= currNum;
            }
            else {
                result += currNum;
            }
            preNum = currNum;
        }
        System.out.println(result);
    }
}
