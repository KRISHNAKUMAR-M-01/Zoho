package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    //BufferedReader + FileReader = best for reading text line by line
    //FileInputStream=Best for binary files(audio,image files)
    //RandomAccessFile=Best for Read/Write specific portion of large file.

    public static void main(String[] args)  {
        String filePath="C:\\Users\\KRISHNAKUMAR\\OneDrive\\Desktop\\test.txt";

        try(BufferedReader reader =  new BufferedReader(new FileReader(filePath));){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println(e);
        }
    } 
}
