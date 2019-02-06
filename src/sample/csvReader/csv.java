package sample.csvReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csv {
    public static void main(String[] args) {
        String readIn="C:\\Users\\BT_1N3_01\\IdeaProjects\\Checkers\\src\\sample\\Checkers.csv";
        BufferedReader br = null;
        String newRow = "";
        String newCol = ",";


        try
        {
            br = new BufferedReader(new FileReader(readIn));
            //While there is a line with text in it, this loop will trigger.
            while((newRow=br.readLine())!=null)
            {
                String[] stats=newRow.split(newCol);
                System.out.print(stats[0]+" ");
                //Need to make a for loop, to get a every cell in a row.
                for (int i=1; i<stats.length;i++)
                {
                    try {
                        System.out.print(stats[i]+" ");
                    }
                    catch (ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println("\n");
                        break;
                    }

                }
                System.out.println("\n");
                //System.out.println(stats[0]+stats[1]);

            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
