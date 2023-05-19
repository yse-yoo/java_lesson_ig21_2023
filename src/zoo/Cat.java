package zoo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.type = "cat";
        this.crying = "にゃー！";
    }
    
    @Override
    public void walk() {
        String message = this.name + "が警戒して歩いてる";
        System.out.println(message);
    }
}
