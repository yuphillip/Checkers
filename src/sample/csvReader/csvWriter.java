package sample.csvReader;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class csvWriter {
    public static void main(String[] args) {
        String readIn="C:\\Users\\BT_1N3_01\\IdeaProjects\\Checkers\\src\\sample\\Checkers.csv";
        File checkers=new File(readIn);
        String row = "";
        String col = ",";
        //I need some way to put new data inside. New data is put inside after the game is won. Perhaps that
        //should be the parameter in main. An array with game data.
        //Need to call this function with who won

        //https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html

        //https://courses.cs.washington.edu/courses/cse341/98au/java/jdk1.2beta4/docs/api/java/util/ArrayList.html
        try {
            FileWriter writer=new FileWriter(readIn);
            BufferedReader br = new BufferedReader(new FileReader(readIn));
            String[][] rowData=new String[5][5];
            int i=0;
            while ((row=br.readLine())!=null)
            {
                String[] preExist=row.split(col);
                rowData[i]=preExist;
                i++;
            }
            for (int j=0; j<rowData.length; j++)
            {
                for (int x=0; x<rowData[j].length; x++)
                {
                    System.out.println(rowData[j][x]);
                }

            }
            //StringBuilder sb= new StringBuilder();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }



    }
}
