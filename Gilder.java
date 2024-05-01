import java.util.*;
import java.io.*;

class Outcome {
    public static List<Float> smoothData(List<Integer> ar, int K) {
        List<Float> list = new ArrayList<>();
        
        for (int i = 0; i <= ar.size() - K; i++) {
            List<Integer> temp = ar.subList(i, i + K);
            int sum = 0;
            for (int num : temp) {
                sum += num;
            }
            float res = (float) sum / K;
            // Round the result to two decimal places
            res = Math.round(res * 100.0) / 100.0f;
            list.add(res);
        }
        
        return list;
    }
}

public class Gilder {
    public static void main(String[] args) throws IOException {
        

        Integer[] arr = {1,1,1,4,5};

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, arr);
        

        // Read the window size K
        int K = 3;;

        // Smooth the data
        List<Float> outcome = Outcome.smoothData(list, K);

        // Print the smoothed data
        for (int i = 0; i < outcome.size(); i++) {
            System.out.print(outcome.get(i));
            if (i < outcome.size() - 1)
                System.out.print(" ");
        }
    }
}
