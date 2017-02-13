package Week3Folder.ChessGame;

import Week3Folder.*;

/**
 * insight on how to make a chess board 64 squares, 8 rows 8 columns
 *
 * @author Administrator Gabe
 */
public class Chess {

    public static void display(char[][] b) {
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//        [][][] page, row and column
//        [][] row, column
        char[][] board = {
            {'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'}

        };
        display(board);
        board[0][1] = '-';
        board[2][2] = 'h';
        System.out.println("");
        display(board);
    }
}
