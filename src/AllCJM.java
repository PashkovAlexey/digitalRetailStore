import A.CJM.Acjm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllCJM {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cjmChoice = 0;
        while (true) {
            printOnTheScreen();
            try {
                cjmChoice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели буквы, необходимо было ввести целое число");
                cjmChoice = 3;
            }
            if (choiceProcess(cjmChoice)) break;
        }
        printTheEnd();
    }

    private static boolean choiceProcess(int cjmChoice) throws Exception {
        if (cjmChoice == 1) {
            Acjm.aCJMStart();
        } else if (cjmChoice == 2) {
            System.out.println("В работе");
        } else if (cjmChoice == 3) {
            return true;
        } else {
            System.out.println("Вы не выбрали вариант, попробуйте снова");
        }
        return false;
    }

    private static void printOnTheScreen() {
        System.out.println(" ");
        System.out.println("Варианты работы с CJM");
        System.out.println("1 - offline, когда покупатель приходит в магазин");
        System.out.println("2 - online, когда покупатель уже зарегистрирован в мобильном приложении и покупает в нем");
        System.out.println("3 - выйти из программы");
        System.out.println("Введите целым числом какой вариант вы выбрали");
    }

    private static void printTheEnd() {
        System.out.println(" ");
        System.out.println("Этот код на GitHub по ссылке https://github.com/PashkovAlexey/digitalRetailStore.git ");
    }
}
