public class question {
    public static void sum(int a){
        int sum = 0;
        while (a > 0){
            sum = sum + (a % 10);
            a = a / 10;
        }
        System.out.println(sum);
    }
    public static boolean palindrome(int a){
        int num = a;
        int rev = 0;

        while (num > 0){
            int last_digit = num % 10;
            rev = rev * 10 + last_digit;
            num =  num / 10;
        }

        if (a == rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isEven(int a){
        if (a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void avg(int a, int b, int c){
        int avg = (a + b + c)/3;
        System.out.println(avg); 
    }
    public static void main(String[] args) {
        //avg(3,6,9);
        //boolean bool = isEven(999);
        //System.out.println(bool);
        //boolean bool = palindrome(10101);
        //System.out.println(bool);
        sum(1216);
    }


}
