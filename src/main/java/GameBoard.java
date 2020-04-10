public class GameBoard {

    private int[] rows;
    private int[] cols;
    private int diag;
    private int antiDiag;
    private int size;

    public GameBoard(int n){
        this.size = n;
        this.rows = new int[n];
        this.cols = new int[n];
        this.diag = 0;
        this.antiDiag = 0;
    }

    public int[] getRows(){
        return this.rows;
    }

    public void setRows(int[] rows) {
        this.rows = rows;
    }

    public int getAntiDiag() {
        return antiDiag;
    }

    public void setAntiDiag(int antiDiag) {
        this.antiDiag = antiDiag;
    }


    public int[] getCols() {
        return cols;
    }

    public void setCols(int[] cols) {
        this.cols = cols;
    }

    public int getDiag() {
        return diag;
    }

    public void setDiag(int diag) {
        this.diag = diag;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
