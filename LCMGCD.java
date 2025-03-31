
import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A:");
        int a = sc.nextInt();
        System.out.print("enter B:");
        int b = sc.nextInt();
            if (a < b){
                int temp = a;
                a = b;
                b = temp;
            }
        for (int i = a; i <= a*b; i+=a){
            if (i%a == 0 && i%b ==0){
                System.out.println("LCM:"+i);
                break;
            }
        }    

        for (int j = b; j >= 1; j--){
            if (a%j == 0 && b%j == 0){
                System.out.println("GCD:"+j);
                break;
            }
        }
    }
}
