package exam47.zoo;

import exam47.food.Food;

public class Dog extends Animal {
    
    public Dog() {
        String name = "タロー";
        this.name = name;
    }

    public void eat(Food food) {
        String message = this.name + "は" + food.name + "を食べている";
        System.out.println(message);
    }


}
