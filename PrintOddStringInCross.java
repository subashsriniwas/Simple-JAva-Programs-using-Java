public class PrintOddStringInCross {
    
    public static void main(String[] args) {
        
        String str = "welcome";
        int k = str.length()-1;

        for (int i=0; i<str.length(); i++) {

            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }

            System.out.print(str.charAt(i));
            
            for (int j=i; j<str.length()-1-i; j++){
                System.out.print(" ");
            }
            
            System.out.print(str.charAt(k--));
            
            System.out.println();

        }
    }
}
