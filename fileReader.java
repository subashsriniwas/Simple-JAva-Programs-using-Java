import java.io.*;
import java.util.*;

public class fileReader {
    public static void main (String a[]){
        Scanner sc = null;
        try {
            File file = new File ("D:\\Notepad\\Demo.txt");
            sc = new Scanner(file);
            while (sc.hasNextLine()) { System.out.println(sc.nextLine());}
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            if (sc !=null) { sc.close(); }
        }
    }
}
