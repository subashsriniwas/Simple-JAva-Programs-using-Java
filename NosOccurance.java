import java.util.*;

public class NosOccurance {
    public static void main(String[] args) {
        
        int[] nums = {4, 7, 18, 16, 14, 16, 7, 13, 10, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() >= 1) {
        //         System.out.println(entry.getKey() + " : " + entry.getValue());
        //     }
        // }

        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
