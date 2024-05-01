public class ArrangeMaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 25, 55, 35, 75, 45, 95, 50, 70, 40, 60, 90, 3};
        arrangeMaxMin(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void arrangeMaxMin(int[] arr) {
        int n = arr.length;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int tempMaxIndex = maxIndex;
        int tempMinIndex = minIndex;

        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[tempMaxIndex];
                tempMaxIndex = (tempMaxIndex + 1) % n;
            } else {
                arr[i] = arr[tempMinIndex];
                tempMinIndex = (tempMinIndex + 1) % n;
            }
        }
    }
}
