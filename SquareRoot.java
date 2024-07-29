public class SquareRoot {
    static int squareroot(int n)
    {
        int ans = 0;
 
        for (int i = 1; i <= n; ++i) {
                     
            // checking every number cube
            if (i * i <= n) {
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int number = 19;  
        System.out.println(squareroot(number));
    }
}
