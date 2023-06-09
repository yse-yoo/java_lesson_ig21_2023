package exam.model;

import java.util.ArrayList;

public class Order implements Calculatable {

    private ArrayList<Item> list = new ArrayList<>();
    private int totalPrice = 0;

    public ArrayList<Item> getList() {
        return list;
    }

    public void setList(ArrayList<Item> list) {
        this.list = list;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public void add(Item item, int amount) {
        for (int i = 0; i < amount; i++) {
            list.add(item);
        }
    }

    @Override
    public void calculateTotalPrice() {
        int price = 0;
        for (Item item : list) {
            price += item.getPrice();
        }
        setTotalPrice(price);
    }

    @Override
    public int count() {
        return list.size();
    }

    public void confirm() {
        System.out.println("注文は、");
        ;
        for (Item item : list) {
            System.out.println(item.getName());
        }
    }

    public void pay() {
        String message = "合計金額は" + totalPrice + "円です。";
        System.out.println(message);
    }

    public void pay(int money) {
        String message = money + "円の支払いです。";
        message += "お釣りは" + (money - totalPrice) + "円です。";
        System.out.println(message);
    }
}