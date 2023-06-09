package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileLoadApp {
    
    public static void main(String[] args) {
        String path = "data/sample.txt";
        try {
            FileInputStream file = new FileInputStream(path);
            System.out.println("ファイルを開きました。");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした。");
        }

    }

}
