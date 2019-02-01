package sample;

public class CheckerPiece {

    private String team;
    private int x;
    private int y;

    public CheckerPiece(String team, int x, int y)
    {
        this.team = team;
        this.x = x;
        this.y = y;
    }
    public boolean isLegal(String team)
    {

    }
    public void move()
    {
        isLegal("red");

    }
    public boolean capture(String team)
    {
        return false;
    }
}
