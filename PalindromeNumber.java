import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        int temp = num;
        int r,rev = 0;
        while (num > 0) {
         r = num%10;
         rev = rev*10+r;
         num = num/10;
        }

        if (rev == temp) {
            System.out.println(temp +" is Palindrome Number");
        }else{
            System.out.println(temp+" is NOT Palindrome Number");
        }
        scanner.close();
    }

}
