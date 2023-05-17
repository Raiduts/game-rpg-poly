import java.util.Scanner;

public class App {

    static Scanner go = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Soal A");
        System.out.println("=".repeat(50));
        Enemy enemy = new Enemy();
        Hero hero = new Hero();
        enemy.move();
        System.out.println("-".repeat(50));
        enemy.move(34);
        System.out.println("-".repeat(50));
        hero.move();
        System.out.println("-".repeat(50));
        hero.move("Bikini Bottom");
        System.out.println("=".repeat(50));

        System.out.println("Soal B");
        System.out.println("=".repeat(50));
        Character heroB = new Hero();
        Character enemyB = new Enemy();
        Character fighter = new Fighter();
        Character witch = new Witch();
        System.out.println("-".repeat(50));
        hero.move();
        fighter.move();
        System.out.println("-".repeat(50));
        enemy.move();
        witch.move();
        System.out.println("=".repeat(50));

        System.out.println("Soal C");
        System.out.println("=".repeat(50));
        ((Fighter)witch).move();
        System.out.println("=".repeat(50));
    }
}
