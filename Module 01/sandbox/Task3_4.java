package sandbox;

    import java.util.Random;

public class Task3_4 {
    public static void main(String[] args) {
        // Generates a 4×4 matrix with random integers between 1 and 99.
        Random random = new Random();
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(99) + 1;
            }
        }
        // Displays the matrix in a tabular format.
        System.out.println("Generated 4x4 Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //Finds and prints the sum of each row and sum of each column.
        int[] rowSums = new int[4];
        int[] columnSums = new int[4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rowSums[i] += matrix[i][j];
                columnSums[j] += matrix[i][j];
            }
        }
        System.out.print("Row Sums: [");
        for (int i = 0; i < rowSums.length; i++) {
            if (i == rowSums.length - 1) {
                System.out.print(rowSums[i]);
            } else {
                System.out.print(rowSums[i] + ", ");
            }
        }
        System.out.println("]");
        System.out.print("Column Sums: [");
        for (int i = 0; i < columnSums.length; i++) {
            if (i == columnSums.length - 1) {
                System.out.print(columnSums[i]);
            } else {
                System.out.print(columnSums[i] + ", ");
            }
        }
        System.out.println("]");

        // Transposes the matrix and displays the result.
        int[][] transposedMatrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.printf("%2d ", transposedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
    

