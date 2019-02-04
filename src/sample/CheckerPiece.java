package sample;

public class CheckerPiece {

    private String team;
    private int xLoc;
    private int yLoc;

    public CheckerPiece(String team, int xLoc, int yLoc)
    {
        this.team = team;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
    public boolean isLegal(String team, int xLoc, int yLoc)
    {
        boolean Legal = (diagonalMovement() && spaceOccupied(team,5,6));
        if(spaceOccupied(team,5,6) == true)
        {
            capture(team);
        }
        return Legal;
    }
    public void move(int a, int b)
    {
        isLegal("red",5,6,);

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
    private boolean spaceOccupied(String team, int xLoc, int yLoc)
    {
        return false;
    }
}
