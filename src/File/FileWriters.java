package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriters {

    //FileWriter=good for small or medium-sized text files
    //BufferedWriter=Better performance for large amount of text
    //PrintWriter=Best for Structured data, like reports or logs
    //FileOutputStream=Best for binary files(image or audio files)

    public static void main(String[] args) {

        String filePath="C:\\Users\\KRISHNAKUMAR\\OneDrive\\Desktop\\test.txt";
        String fileContent="hello my name is goku \ni'm a super sayain";

        try(FileWriter writer=new FileWriter(filePath);){
            writer.write(fileContent);
            System.out.println("File written");
        }catch (FileNotFoundException e){
            System.out.println("could not find the file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
    }
}
