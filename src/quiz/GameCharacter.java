package quiz;

public abstract class GameCharacter {
    private double x;
    private double y;
    protected int hp;

    public GameCharacter(double x, double y) {
        this.x = x;
        this.y = y;
        this.hp = 100;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getHP() {
        return this.hp;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}
