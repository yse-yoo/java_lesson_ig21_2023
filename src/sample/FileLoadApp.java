package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileLoadApp {
    
    public static void main(String[] args) {
        String path = "data/sample.txt";
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(file, "UTF-8");
            System.out.println("ファイルを開きました。");

            
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした。");
        }

    }

}
