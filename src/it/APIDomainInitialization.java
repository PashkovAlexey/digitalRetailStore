package it;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface APIDomainInitialization {

    String defaultBackGiveDomain = "https://5ka.ru/";

    Scanner scanner = new Scanner(System.in);

    default String APIDomainInitialize() {
        String backGiveDomain = "";
        printStartInfo();
        int choice = choose();
        try {
            backGiveDomain = processChoice(choice);
        } catch (ChoiceException e){
            backGiveDomain = defaultBackGiveDomain;
            System.out.println(e.getMessage());
            System.out.println("Выбранный вами вариант: " + e.getChoice());
            System.out.println("Из-за ошибки выбора устанавливается вариант по умолчанию номер один: " + defaultBackGiveDomain);
        } finally {
            System.out.println("Выбор варианта доступа к API завершен");
        }
        return backGiveDomain;
    }

    private int choose(){
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Вами введен текст вместо цифры");
            System.out.println("Из-за ошибки выбора устанавливается вариант по умолчанию номер один: " + defaultBackGiveDomain);
            choice = 1;
        } catch (Exception e){
            System.out.println("Из-за ошибки выбора устанавливается вариант по умолчанию номер один: " + defaultBackGiveDomain);
            choice = 1;
        }
        return choice;
    }

    private void printStartInfo(){
        System.out.println("Выберите какой будете использовать домен для доступа к платформе магазина");
        System.out.println("1 - https://5ka.ru/");
        System.out.println("2 - https://api.5ka.ru/");
        System.out.println("Введите одно целове число из вариантов выше");
    }

    private String processChoice(int choice) throws ChoiceException {
        String domain = "";
        if (choice < 1){
            throw new ChoiceException("Выбран неверный вариант", choice);
        } else if (choice == 1){
            domain = defaultBackGiveDomain;
            System.out.println("Выбран доступ через " + domain);
        } else if (choice == 2){
            domain = "https://api.5ka.ru/";
            System.out.println("Выбран доступ через " + domain);
        } else if (choice > 2){
            throw new ChoiceException("Выбран неверный вариант", choice);
        }
        return domain;
    }



}
