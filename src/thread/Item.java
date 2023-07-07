package thread;

public class Item {
    
    public String name;

    public Item(String name) {
        this.name = name;
    }
    
    public void order() {
        try {
            System.out.println(name);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---注文完了---");
    }
}
