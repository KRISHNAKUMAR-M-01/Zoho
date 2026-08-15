package BufferedReader;

import ALGORITHMS.BubbleSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("src/BufferedReader/sample.txt"));
        String line;
        while((line=br.readLine())!=null){
            for(String word:line.toLowerCase().replaceAll("[^a-z\\s]","").split("\\s+")){
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }
        br.close();
        String input;
        do{
            System.out.print("Enter word (or 'exit')");
            input=sc.nextLine().trim().toLowerCase();
            if(!input.equals("exit")){
                System.out.println("'"+input+"' appears "+map.getOrDefault(input,0)+" times");
            }
        }while(!input.equals("exit"));

    }
}
