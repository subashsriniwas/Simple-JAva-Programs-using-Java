import java.util.*;

public class printOddNos {
    public static void main(String[] args) {
        
        int start = 2;
        int end = 15;
        List<Integer> list = new ArrayList<>();
        
        for (int i=start; i<end; i++) {
            if (i%2 == 1) {
                list.add(i);
            }
        }
        System.out.println(list.toString());
    }
}
