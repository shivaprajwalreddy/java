public class patterns {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pyramid(int a){
        for (int i = 1; i <= a; i++) {
            for(int j = 1; j <= a-i; j++){
                System.out.print(" ");
            }   
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramid_number(int n){
        for( int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floid_triangle(int n){
        int counter = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                if ((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

    public static void diamond(int n){
        for (int i = 1; i<= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i>= 1; i--){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //hollow_rectangle(5, 5);
        //pyramid(6);
        //pyramid_number(9);
        //floid_triangle(4);
        //zero_one_triangle(5);
        //butterfly(15);
        //solid_rhombus(8);
        //hollow_rhombus(9);
        diamond(7);
    }
}

