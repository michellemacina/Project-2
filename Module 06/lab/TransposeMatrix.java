package lab;

public class TransposeMatrix {
    public static void main(String[] args) {
        // need 4x4
        int[][] matrix1 = new int[4][4];

        // need to generate random numbers to fill it (between 1 and 99)
        for (int i = 0; i < matrix1.length; i++) // since its 4x4 you need two variables so this is one way and the next
                                                 // line with j is another
            for (int j = 0; j < matrix1.length; j++)
                matrix1[i][j] = (int) (Math.random() * 99); // how do i get this to be between 1 and 99??

        // make sure it prints in a table form
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

    // Transpose the matrix

    //print the transposed matrix 

