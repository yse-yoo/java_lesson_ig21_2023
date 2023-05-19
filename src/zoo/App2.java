package zoo;

public class App2 {
    public static void main(String[] args) {
        Cat cat = new Cat("ミケ");
        Dog dog = new Dog("ポチ");
        cat.cry();
        dog.cry();

        Animal[] animals = { cat, dog };
        for (Animal animal : animals) {
            System.out.println(animal.name);
            animal.cry();
        }
    }
}
