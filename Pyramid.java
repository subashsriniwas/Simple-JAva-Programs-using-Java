public class Pyramid {
    public static void main (String a[]) {

        star(5);
        triangle(5);
        alpha(26);

    }

    private static void triangle(int n) {
        for (int i=0; i<n; i++){
            for (int j=n-i; j>=0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void star(int n) {
        for (int i=0; i<=n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=0; i--){
            for (int j=i; j>=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void alpha (int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
