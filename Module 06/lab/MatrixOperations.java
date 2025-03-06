package lab;

public class MatrixOperations {
    public static void main(String[] args){
        // need 4x4
        int[][] matrix= new int[4][4];

        //need to generate random numbers to fill it (between 1 and 99)
        for (int i=0; i< matrix.length; i++) //since its 4x4 you need two variables so this is one way and the next line with j is another
        for (int j=0; j< matrix.length; j++)
        matrix[i][j] =(int)(Math.random()*99); //how do i get this to be between 1 and 99??
        

        //make sure it prints in a table form 
    for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();


        //find sum of row 
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[i][j];
            }
            //print sum of rows 
            System.out.println("Row sum: " + rowSum);
        }
        //find sum of columns 
        for (int j = 0; j < matrix.length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }

        //print sum of columns 5
        System.out.println("Column sum: "+ colSum);



    }
}
}
