public class tictacgame {
    
    private char[][] board;
    private char currentPlayer; 

    public tictacgame() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public boolean play(int row, int col) {
        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            switchPlayer();
            return true;
        } else {
            return false;
        }
    }
    

    private void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
    

    public boolean isGameOver() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }
    
    // Méthode pour vérifier si une ligne est gagnante
    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }
    
    // Méthode pour vérifier si une colonne est gagnante
    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }
    
    // Méthode pour vérifier si une diagonale est gagnante
    private boolean checkDiagonals() {
        return (checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[0][2], board[1][1], board[2][0]));
    }
    

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
    }
    public char getCurrentPlayer() {
        return currentPlayer;
    }
    public char getWinner() {
        for (int i = 0; i < 3; i++) {
            // check rows
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
            // check columns
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }
        // check diagonals
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }
        // if no winner yet
        return ' ';
    }
    

}
