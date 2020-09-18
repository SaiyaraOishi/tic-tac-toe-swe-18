

public class RandomAI implements AI {

    public static int computer_move(int[][] board) {
        int move = (int)(Math.random()*9);

        while(board[move/3][move%3] != 0)
            move = (int)(Math.random()*9);

        return move;
    }
}
