import java.util.*;

public class AverageOfElementsAtEachWindow {
    public static void main(String[] args) {
        
        int[] nums = {1,1,1,2,3,4,5};
        int k = 3;

        List<Double> res = new ArrayList<>();
        for (int i=0; i<nums.length-k; i++) {
            int sum = 0;
            for (int j=i; j<i+k; j++) {
                sum += nums[j];
            }
            double avg = (double)sum/k;
            avg = Math.round(avg * 100.0) / 100.0;
            
            res.add(avg);
        }

        System.out.println(res.toString());
    }
}
