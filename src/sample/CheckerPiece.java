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
        boolean Legal = (diagonalMovement() && spaceOccupied(team));
        if(spaceOccupied(team) == true)
        {
            capture(team);
        }
        return Legal;
    }
    public void move(int a, int b)
    {
        isLegal("red");

    }
    public boolean capture(String team)
    {
        move(9,10);
        return false;
    }
    private boolean diagonalMovement()
    {
        return false;
    }
    private boolean spaceOccupied(String team)
    {
        return false;
    }
}
