package sample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoadApp {
    
    public static void main(String[] args) {
        String path = "data/sample.txt";
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(file, "UTF-8");
            System.out.println("ファイルを開きました。");

            BufferedReader buffer = new BufferedReader(reader);

            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした。");
        } catch (IOException e) {
            System.out.println("ファイル読み込みエラー");
        }

    }

}
