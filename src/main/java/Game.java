public abstract class Game {

    public int Player1 = 1;
    public int Player2 = -1;
    protected GameBoard gameboard;
    public Game(int size){
        this.gameboard = new GameBoard(size);
    }
    public abstract void checkWinCondiction();
}
