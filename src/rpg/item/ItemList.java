package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
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

        // ファイルを開く
        try {
            file = new FileInputStream(CSV_PATH);
        } catch (FileNotFoundException e) {
            System.out.println(CSV_PATH + " が開けません");
        }

    }

}
