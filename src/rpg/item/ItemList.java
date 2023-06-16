package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;

public class ItemList {

    private final String CSV_PATH = "data/item.csv";
    ArrayList<Item> list = new ArrayList<>();

    public ItemList() {
        this.loadCSV();
    }

    public void loadCSV() {
        System.out.println("CSV読み込み");
        FileInputStream file;
        InputStreamReader reader;
        BufferedReader buffer;

        try {
            // ファイルを開く
            file = new FileInputStream(CSV_PATH);
            reader = new InputStreamReader(file, "UTF-8");
            // バッファを用意
            buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println(CSV_PATH + " が開けません");
        } catch (IOException e) {
            System.out.println("読み込みエラー");
        }

    }

}
