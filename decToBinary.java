public class decToBinary {
    public static void decToBin(int dec){
        int pow = 0;
        int Bin = 0;

        while (dec > 0){
            int rem = dec % 2;
            Bin = Bin + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec/2;
        }
        System.out.println("binary is " +Bin);

    }
    public static void main(String[] args) {
        decToBin(7);
    }
    
}
