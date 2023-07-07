package thread;

public class ShopThread extends Thread {

    private Item item;

    //Constructor
    ShopThread(Item item) {
        this.item = item;
    }
    
    @Override
    public void run() {
        item.order();
    }
}
