import java.util.Scanner;

public class TemperatureConvert {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature : ");
        double temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter unit C for Celcius | F for Fahrenheit : ");
        String ch = scanner.nextLine();
        if (ch.equalsIgnoreCase("c")) {
            double Fahrenheit = (temp*1.8)+32;
            System.out.println("Temp in Fahrenheit :"+Fahrenheit);
        }else{
            double Celcius = (temp-32)/1.8;
            System.out.println("Temp in Celcius :"+Celcius);
        }
        scanner.close();
    }
}
