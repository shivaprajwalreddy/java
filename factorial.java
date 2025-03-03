import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long fact = 1;

        System.err.println("enter number");
        n = sc.nextInt();

        for( long i = n; i >= 1; i--){
            fact *= i;
        }

        System.out.println("fcatorial :" + fact);
    }
}
