import java.util.Scanner;

/**
 * SwapTwoNumber
 */
public class SwapTwoNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = scanner.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("\nAfter Swapping...");
        System.out.println("Number 1 : "+a);
        System.out.println("Number 2 : "+b);
        scanner.close();
    }
}