public class pov {
    public static void main(String a[]) {
        povv(20, 10);
    }
    
    private static void povv(double x, int n) {
        double res = 1.0;
        long nn = n;
        if (nn<0) {
            nn *= -1;
        }
        while (nn >= 0) {
            if (nn % 2 == 1) {
                res = res * n;
                nn--;
            }
            else {
                x = x*x;
                nn = nn/2;
            }
        }
        if(n<0) {
            res = (double) (1.0) / (double) (res);
        }
        System.out.println(res);
    }
}
