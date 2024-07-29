import java.util.Scanner;

public class PalindromeString {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scanner.nextLine();
        String revString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            revString = revString+str.charAt(i);
        }
    System.out.println();
        if (str.equalsIgnoreCase(revString)) {
            System.out.println(revString+" is Palindrome String");
        }else{
            System.out.println(str+" is not Palindrome String");
        }
        scanner.close();
    }
}
