public class transpose {
    public static void main(String[] args) {
        int matrix[][] = {{11,12,13},{21,22,23}};
        int row = matrix.length, column = matrix[0].length;

        printTranspose(matrix);

        int transpose[][] = new int[column][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printTranspose(transpose);
    }

    public static void printTranspose(int a[][]) {
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
