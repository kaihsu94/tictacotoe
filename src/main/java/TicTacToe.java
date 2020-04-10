import java.util.HashSet;
import java.util.Set;

public class TicTacToe extends Game {
    private boolean status = false;
    private int winner;
    private int numberOfPlays;
    private Set<Cordinate> used;
    public TicTacToe(int boardSize){
      super(boardSize);
      winner = 0;
      numberOfPlays = 0;
      used = new HashSet();
    }

    public void makeMove(int row, int col, int player) throws Exception {
        Cordinate cordinate = new Cordinate(row,col);
        if(used.contains(cordinate)){
            throw new Exception("Has been done before");
        }else{
            used.add(cordinate);
        }
        int piece = player == 1 ? 1 : -1;
        int[] rows = this.gameboard.getRows();
        int[] cols = this.gameboard.getCols();
        int diag = this.gameboard.getDiag();
        int antiDiag = this.gameboard.getAntiDiag();
        int size = this.gameboard.getSize();
        if(row > size || row < 0 || col > size || col < 0){
            throw new Exception("Invalid position on the board to make move!");
        }

        rows[row] += piece;
        cols[col] += piece;

        if(row == col){
            diag += piece;
        }

        if(col == (size - row - 1)){
            antiDiag += piece;
        }

        this.gameboard.setCols(cols);
        this.gameboard.setRows(rows);
        this.gameboard.setDiag(diag);
        this.gameboard.setAntiDiag(antiDiag);

        if(Math.abs(rows[row]) == size || Math.abs(cols[col]) == size
                || Math.abs(diag) == size || Math.abs(antiDiag) == size){
            this.winner = (this.winner == 1 ? 1 : 2);
        }
        this.numberOfPlays++;
        checkWinCondiction();
    }


    @Override
    public void checkWinCondiction() {
        if(numberOfPlays == (this.gameboard.getSize() * this.gameboard.getSize())){
            this.status = true;
            System.out.println("Sorry, you've reached a draw");
        }
       if(this.winner != 0){
           this.status = true;
           System.out.println("Congrats Player " + this.winner);
       }
    }

    public boolean getStatus(){
        return this.status;
    }
}
