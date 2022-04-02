import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int milkAmount = 800; // ml
        int powderAmount = 200; // g
        int eggsCount = 4; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 3;
        int dishNumber;

        System.out.print("1. Apple Juice\n2. Pancakes\n3. Omelette\n4. Apple pie\nВыберите номер блюда для приготовления (необходимо выбрать 1, 2, 3 или 4): ");
        dishNumber = new Scanner(System.in).nextInt();

        switch (dishNumber) {
            case 1:
                // Example
                // appleCount - 5
                if (appleCount >= 5 ) {
                    System.out.println("Приготовлен Apple Juice");
                    appleCount -= 5;
                } else {
                    System.out.println("Не хватает ингридиентов");
                }
                break;

            case 2:
                //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
                if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30 ) {
                    System.out.println("Приготовлен Pancakes");
                    powderAmount -= 400;
                    sugarAmount -= 10;
                    milkAmount -= 1000;
                    oilAmount -= 30;
                } else {
                    System.out.println("Не хватает ингридиентов");
                }
                break;

            case 3:
                //milk - 300 ml, powder - 5 g, eggs - 5
                if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5 ) {
                    System.out.println("Приготовлен Omelette");
                    milkAmount -= 300;
                    powderAmount -= 5;
                    eggsCount -= 5;
                } else {
                    System.out.println("Не хватает ингридиентов");
                }
                break;

            case 4:
                //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
                if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 ) {
                    System.out.println("Приготовлен Apple pie");
                    appleCount -= 3;
                    milkAmount -= 100;
                    powderAmount -= 300;
                    eggsCount -= 4;
                } else {
                    System.out.println("Не хватает ингридиентов");
                }
                break;

            default:
                System.out.println("Выбран неккоректный номер блюда");
                break;
        }
    }
}