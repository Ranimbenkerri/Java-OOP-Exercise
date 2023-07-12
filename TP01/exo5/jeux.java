import java.util.Scanner;

public class jeux{
    public static void main(String[] args){
        tictacgame game = new tictacgame();
        game.displayBoard();
    
        while (!game.isGameOver()) {
            System.out.println("It is " + game.getCurrentPlayer() + "'s turn.");
            int row = -1;
            int col = -1;
            while (row < 0 || row > 2 || col < 0 || col > 2 || !game.play(row, col)) {
                System.out.print("Enter a row (0, 1, 2) and column (0, 1, 2) to place an " + game.getCurrentPlayer() + ": ");
                Scanner scanner = new Scanner(System.in);
                row = scanner.nextInt();
                col = scanner.nextInt();
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Invalid row or column, please try again.");
                } else if (!game.play(row, col)) {
                    System.out.println("This position is already occupied, please choose another one.");
                }
            }
            game.displayBoard();
        }
    
        System.out.println("Game over!");
        char winner = game.getWinner();
        if (winner == ' ') {
        System.out.println("It's a tie!");
        }
        else {
        System.out.println(winner + " wins!");
        }
    
    }
}