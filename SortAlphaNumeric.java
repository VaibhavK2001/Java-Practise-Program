import java.util.Scanner;

public class SortAlphaNumeric {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Aplhanumeric String :");
        String str = scanner.nextLine();
        String chars = "";
        String nums = "";

        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if ((value > 64 && value < 91)||(value > 96 && value < 123)) {
                chars = chars+str.charAt(i);
            }else{
                nums = nums+str.charAt(i);
            }
        }

        System.out.println();        
        System.out.println("Alphabets : "+chars);
        System.out.println("Numbers : "+nums);

        scanner.close();
    }
}
