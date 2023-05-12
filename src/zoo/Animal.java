package zoo;

public class Animal {
    // property
    public String type;
    public String name;
    public String crying;

    // method
    public void walk() {
        String message = this.name + "が歩いた";
        System.out.println(message);
    }

    public void cry() {
        System.out.println(this.crying);
    }

    public void escape() {
        String message = this.name + "が逃げた";
        System.out.println(message);
    }
}
