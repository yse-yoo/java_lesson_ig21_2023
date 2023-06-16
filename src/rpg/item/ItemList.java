package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ItemList {

    private final String CSV_PATH = "data/item.csv";
    public ArrayList<Item> list = new ArrayList<>();

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

            // アイテムデータ読み込み（２行目以降）
            while ((line = buffer.readLine()) != null) {
                // カンマ区切りで配列（文字列）
                String[] data = line.split(",");

                Long id = Long.parseLong(data[0]);
                String name = data[1];
                ItemType type = ItemType.valueOf(data[2].toUpperCase());
                Integer price = Integer.parseInt(data[3]);
                Integer attackPower = Integer.parseInt(data[4]);
                Integer defencePower = Integer.parseInt(data[5]);

                // アイテム生成
                // Item item = new Item(name, price, attackPower, defencePower);
                Item item = new Item(id, name, type, price, attackPower, defencePower);
                // アイテムリストに追加
                list.add(item);
            }

        } catch (FileNotFoundException e) {
            System.out.println(CSV_PATH + " が開けません");
        } catch (IOException e) {
            System.out.println("読み込みエラー");
        }

    }

}
