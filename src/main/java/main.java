import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe(3);
        int player = 1;
        while(ticTacToe.getStatus() == false){
            System.out.println("Player " + player + " it is your turn!, please enter a column for your next move");
            int col = sc.nextInt();
            System.out.println("Player " + player+ " Please select a row for your next move");
            int row = sc.nextInt();
            try {
                ticTacToe.makeMove(row, col, player);
            } catch ( Exception e){
                System.out.println(e.getMessage());
            }
            player = player == 1 ? 2 : 1;

        }
    }
}
