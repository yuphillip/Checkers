package sample.csvReader;

import java.io.File;
import java.io.FileWriter;

public class csvWriter {
    public static void main(String[] args) {
        String readIn="C:\\Users\\BT_1N3_01\\IdeaProjects\\Checkers\\src\\sample\\Checkers.csv";
        File checkers=new File(readIn);
        String newRow = "";
        String newCol = ",";
        //I need some way to put new data inside. New data is put inside after the game is won. Perhaps that
        //should be the parameter in main. An array with game data.

        //https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html
        try {
            FileWriter augmentedFile=new FileWriter(readIn);
           // augmentedFile.append()

        }



    }
}
