package lab;

public class WordSearch {

    // method
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // loop through the grid
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (exist(board, word, row, cols, 0)) {
                    return true;
                }

            }
        }

        return false;

    }

    // helper method
    public static boolean exist(char[][] board, String word, int row, int cols, int index) {
        // base case
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || cols < 0 || cols >= board[0].length
                || board[row][cols] != word.charAt(index)) {
            return false;
        }
        // explore all directions
        boolean directions = exist(board, word, row - 1, cols, index + 1);
        exist(board, word, row + 1, cols, index + 1);
        exist(board, word, row, cols - 1, index + 1);
        exist(board, word, row, cols + 1, index + 1);

        return directions;

    }

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";

        System.out.println(exist(board, word));

    }
}
