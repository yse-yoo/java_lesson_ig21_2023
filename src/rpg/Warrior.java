package rpg;

import java.util.Random;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.job = "warrior";
        this.hp = 50;
        this.mp = 0;
        this.attackPower = 7;
        this.defencePower = 3;
    }

    @Override
    public void attack(Monster monster) {
        System.out.println("オーバーライド");
        // 初期の攻撃力をtmpする
        int attackPower = this.attackPower;
        // 1/5の確率でクリティカルヒット
        Random rand = new Random();
        int index = rand.nextInt(5);
        if (index == 0) {
            // 攻撃力を2倍
            System.out.println("Critical Hit!!!");
            this.attackPower *= 2;
        }
        // 攻撃
        super.attack(monster);
        // 攻撃量をもとに戻す
        this.attackPower = attackPower;
    }
}
