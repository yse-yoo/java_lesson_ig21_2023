package exam47.zoo;

import exam47.food.Food;

public class AnimalApp {
    
    public static void main(String[] args) {
        //サブクラスのオブジェクト
        Food food = new Food();
        food.name = "りんご";

        Dog dog = new Dog();
        dog.eat(food);

        //スーパークラスのオブジェクト
        Animal animal = new Animal();
        animal = dog;
        animal = (Animal) dog;
        // dog = animal;

        //staticメソッドの実行
        Dog.greed();
    }
}
