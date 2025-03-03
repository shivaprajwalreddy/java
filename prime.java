public class prime {
    public boolean isPrime(int n){
         for (int i = 2; i<=n-1; i++){
            if(n % i == 0){
                return false;
            }
         }
         return true;
    }
    
    public static void main(String[] args) {
        prime p = new prime();
        System.out.println(p.isPrime(2));
    }
}
