import java.util.Arrays;

public class wordsCount {
    public static void main (String a[]) {
        String input = "Hello World Im Subash";

        String[] result = input.split(" ");
        int count = result.length;
        System.out.println(Arrays.toString(result));
        System.out.println("It has " + count + " words");
    }
}
