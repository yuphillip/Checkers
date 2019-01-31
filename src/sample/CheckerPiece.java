package sample;

public class CheckerPiece {
    public boolean isLegal(String team)
    {

        return false;
    }
    public void move()
    {
        isLegal("red");
        capture("red");
    }
    public boolean capture(String team)
    {
        return false;
    }
}
