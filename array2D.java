
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3x3 matrix");
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        int key = 5, min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (key == matrix[i][j]){
                    System.out.println("found at index ("+ i+")"+"("+j+")");
                }

                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }

                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("max = "+max+" min = "+min);
    }
}
