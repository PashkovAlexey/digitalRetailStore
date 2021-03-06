package B.CJM;

import B.combinations.CombiBuilderApp;

import java.util.Scanner;

public abstract class Bcjm {

    public static void bCJMStart() throws InterruptedException {
        printInfo();
        Scanner sc = new Scanner(System.in);
        int prodChoice = sc.nextInt();
        choiceProcess(prodChoice);
    }

    private static void printInfo() {
        System.out.println("Выберите вариант как вы будете покупать, напечатайте одно целое число");
        System.out.println("1 - отдельные продукты");
        System.out.println("2 - наборы по акции");
        System.out.println("любая цифра - выйти в главное меню");
    }

    private static void choiceProcess(int prodChoice) throws InterruptedException {
        if (prodChoice == 1) {
            ProductFactoryApp.ProductFactoryAppMainMethod();
        } else if (prodChoice == 2) {
            CombiBuilderApp.combiBuilderAppMainMethod();
        }
    }
}
