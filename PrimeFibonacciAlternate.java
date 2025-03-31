
import java.util.Scanner;

public class PrimeFibonacciAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int num = 2,a = 0, b = 1, c;

        for (int i = 1; i <= n; i++){
            while (true) { 
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(num); j++){
                    if (num % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.print(num + " ");
                    num++;
                    break;
                }
                num++;
            }
            
            if(i < n){
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
            i++;
        }

    }
}
