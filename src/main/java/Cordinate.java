import java.util.Objects;

public class Cordinate {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private int y;

    public Cordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cordinate)) return false;
        Cordinate cordinate = (Cordinate) o;
        return x == cordinate.x &&
                y == cordinate.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
