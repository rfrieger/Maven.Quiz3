package rocks.zipcode.io.quiz3.arrays;

import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] result = new String[3];
        for (int i = 0; i <3 ; i++) {
            result[i] = board[i][value];
        }
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] arr = getRow(rowIndex);
        if(Stream.of(arr).distinct().toArray().length == 1) {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] arr = getColumn(columnIndex);
        if(Stream.of(arr).distinct().toArray().length == 1) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        for (int i = 0; i <3 ; i++) {
            if (isRowHomogenous(i)){
                return getRow(i)[0];
            } else if (isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
        }
        return "X";
    }

    public String[][] getBoard() {
        return null;
    }
}
