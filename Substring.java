public class Substring {
    public static void main(String[] args) {
        String str1 = "thistest123string";
        String str2 = "123";

        boolean flag = false;

        for (int i=0; i<str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                System.out.println("At index : " + i);
                flag = true;
                break;
            }
        }
        if (flag == false) { System.out.println("no substring found"); }
    }
}
