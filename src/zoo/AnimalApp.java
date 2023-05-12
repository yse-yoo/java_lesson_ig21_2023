package zoo;

public class AnimalApp {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.type = "dog";
        dog.name = "ポチ";
        dog.crying = "わん！";

        Animal cat = new Animal();
        cat.type = "cat";
        cat.name = "ミケ";
        cat.crying = "にゃー！";

        dog.walk();
        dog.cry();
        cat.cry();
        cat.escape();
    }

}
