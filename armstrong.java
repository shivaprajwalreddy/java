import java.util.Scanner;

public class armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int t = n, d = 0, arm = 0;
        while(t > 0)
        {
            t /= 10;
            d++;
        }
        t = n;
        while(t > 0)
        {
            int r = t % 10;
            arm += (int)Math.pow(r, d);
            t /= 10;
        }
        if(arm == n)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}
