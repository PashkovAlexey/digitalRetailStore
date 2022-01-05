package it;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class BackEndAPI extends IT {

    private String backLogin;
    private String backPassword;
    private String backGiveDomain;

    Scanner scanner = new Scanner(System.in);

    {
      System.out.println("Выберите какой будете использовать домен для доступа к платформе магазина");
      System.out.println("1 - https://5ka.ru/");
      System.out.println("2 - https://api.5ka.ru/");
      System.out.println("Введите одно целове число из вариантов ниже");
      int choice = scanner.nextInt();
      if (choice == 1){
          backGiveDomain = "https://5ka.ru/";
      } else if (choice == 2) {
          backGiveDomain = "https://api.5ka.ru/";
      }
    }

    Random random = new Random();
    DecimalFormat df = new DecimalFormat("000000000");

    public BackEndAPI() {

    }

    public String backGiveDomain() {
        return backGiveDomain;
    }

    public String backGiveLogin() {
        int x1 = random.nextInt(1000000000);
        backLogin = "id" + df.format(x1);
        return backLogin;
    }

    public String backGivePassword(String CustomerName) {
        int x2 = random.nextInt(1000000000);
        backPassword = CustomerName + df.format(x2);
        return backPassword;
    }


    public String getBackLogin() {
        return backLogin;
    }

    public void setBackLogin(String backLogin) {
        this.backLogin = backLogin;
    }

    public String getBackPassword() {
        return backPassword;
    }

    public void setBackPassword(String backPassword) {
        this.backPassword = backPassword;
    }

    public String getBackGiveDomain() {
        return backGiveDomain;
    }

    public void setBackGiveDomain(String backGiveDomain) {
        this.backGiveDomain = backGiveDomain;
    }

}
