import java.util.ArrayList;
import java.util.List;

public class mismatchedPair {
    public static void main(String[] args) {
        
        String str1 = "abcdefgh";
        String str2 = "abdfhjfb";

        List<Character> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i<str1.length() && j<str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) {
                list.add(str1.charAt(i));
                list.add(str2.charAt(j));
            }
            i++;
            j++;
        }
        
        System.out.println(list.toString());
    }
}
