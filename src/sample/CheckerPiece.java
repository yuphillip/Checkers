package sample;

import java.lang.reflect.Array;

public class CheckerPiece {

    String team;
    int xLoc;
    int yLoc;
    Array Spaces[][];

    public CheckerPiece(String team, int xLoc, int yLoc)
    {
        this.team = team;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
    public boolean isLegal(String team, int xLoc, int yLoc)
    {
        boolean Legal = (diagonalMovement(team,xLoc,yLoc) && spaceOccupied(team,xLoc,yLoc));


        return Legal;
    }
    public void move(String team, int a, int b)
    {
        isLegal(team,a,b);



    }
    public void capture()
    {


    }
    private boolean diagonalMovement(String team,int xLoc, int yLoc)
    {

        return false;
    }
    private boolean spaceOccupied(String team, int xLoc, int yLoc)
    {
        return false;
    }
}
