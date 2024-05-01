import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 3, 2, 7, 5, 9, 8};  // 1,2,3,4,5,6,7,8,9

        Arrays.sort(arr);
        
        int i = 0;
        int j =arr.length-1;
        int k = 0;
        int[] res = new int[arr.length];

        while (i < j) {
            res[k++] = arr[j--];
            res[k++] = arr[i++];
        }

        // while (i < j) {
        //     int temp = arr[j];
            
        //     for (int k=j; k>i; k--) {
        //         arr[k] = arr[k-1];
        //     }
        //     arr[i] = temp;

        //     i += 2;
        //     j--;
        // }
        
        System.out.println(Arrays.toString(res));
    }
}
