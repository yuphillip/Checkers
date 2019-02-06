package sample;

public class Spaces
{
    int xLoc,yLoc;
    String occupied;

    public Spaces(int x, int y, String piece)
    {
        xLoc = x;
        yLoc = y;
        occupied = piece;
    }

    public int getX()
    {
        return xLoc;
    }

    public void setX(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public int getY()
    {
        return yLoc;
    }

    public void setY(int yLoc)
    {
        this.yLoc = yLoc;
    }
}