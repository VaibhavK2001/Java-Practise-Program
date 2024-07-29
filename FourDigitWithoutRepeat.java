import java.util.Random;

public class FourDigitWithoutRepeat {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        String num = "";

        while (num.length()<4) {
            int a = random.nextInt(9);
            String n  = String.valueOf(a);
            if (!num.contains(n)) {
                num = num+n;
            }
        }
        char[] str = num.toCharArray();
        if (num.charAt(0)==0) {
            char a = num.charAt(3);
            str[0]=a;
            str[3]=0;
        }
        System.out.println(str);
    }
}
