package Digital.Retail.Store.another;

import Digital.Retail.Store.Product.Cheese;
import Digital.Retail.Store.Product.Product;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RetailStore {

    private String storeDescription;
    private int storeCustomerNumber;
    private double storeBonusSum;
    private double storeRevenue;
    DecimalFormat df = new DecimalFormat("#.00");
    private double maxPrice = 0;
    Scanner scanner = new Scanner(System.in);


    public RetailStore() {
    }

    public RetailStore(double storeRevenue) {
        this.storeRevenue = storeRevenue;
    }

    public RetailStore(int storeCustomerNumber, double storeRevenue) {
        this.storeCustomerNumber = storeCustomerNumber;
        this.storeRevenue = storeRevenue;
    }
    public RetailStore(int storeCustomerNumber, int storeBonusSum, double storeRevenue) {
        this.storeCustomerNumber = storeCustomerNumber;
        this.storeBonusSum = storeBonusSum;
        this.storeRevenue = storeRevenue;
    }

    public RetailStore(String storeDescription, int storeCustomerNumber, int storeBonusSum, double storeRevenue) {
        this.storeDescription = storeDescription;
        this.storeCustomerNumber = storeCustomerNumber;
        this.storeBonusSum = storeBonusSum;
        this.storeRevenue = storeRevenue;
    }


    public void storePurchase(String p) {
        System.out.println("В магазине под названием " + p + " совершена покупка");
    }

    public void storePaymentAddToRevenue(double p) {
        storeRevenue = storeRevenue + p;
        System.out.println("Стоимость покупки товара или товаров добавлена к выручке магазина");
    }

    public void storeFindMaxPriceOneProduct (double [] weekOneProduct, String productTypeName){
        for (int i =1; i <= weekOneProduct.length; i++){
            if (weekOneProduct[i-1] > maxPrice){
                maxPrice = weekOneProduct[i-1];
            }
        }
        System.out.println("Самый дорогой " + productTypeName + " за неделю стоил " + df.format(maxPrice) + " рублей");
    }

    public void storePrintAllOneTypeProduct (double [] weekOneProduct, String productTypeName){
        System.out.println("Список остальных купленных товаров " + productTypeName);
        for (double selectedOne : weekOneProduct){
            if (selectedOne == maxPrice) continue;
            System.out.println(productTypeName + " " + df.format(selectedOne) + " рублей");
         }
    }

    public void findNumberOfSameProductsByPrice (double [] weekFirstTypeProduct, double [] weekSecondTypeProduct){
        System.out.println("Поищем сколько раз был куплен один и тот же товар? Поиск осуществляется по цене товара. Выбери вариант ниже и введи его одной целой цифрой.");
        System.out.println("1 - да, поищем");
        System.out.println("Любая цифра - нет, пропускаем и идем дальше");
        int choice = scanner.nextInt();

        if (choice == 1){
            int x1 = weekFirstTypeProduct.length;
            int x2 = weekSecondTypeProduct.length;
            int x3 = x1 + x2;
            double [] weekAllProduct = new double[x3];
            for (int i = 0; i < x3; i++) {
                if (i < x1) {
                        weekAllProduct[i] = weekFirstTypeProduct[i];
                } else {
                        weekAllProduct[i] = weekSecondTypeProduct[i-x1];
                }
            }
            System.out.println("Напечатаем все цены всех купленных товаров");
            for (int i = 0; i < x3; i++){
                    System.out.println(df.format(weekAllProduct[i]) + " рублей");
            }
            int [] weekAllProductInt = new int [x3];
            for (int i = 0 ; i < x3; i++){
                weekAllProductInt[i] = (int) weekAllProduct[i];
            }


            System.out.println(" ");
            System.out.println("Посчитаем сколько раз вы купили товары по цене 125 рублей");
            double k = 0;

                for (int selectedPrice : weekAllProductInt){
                    switch (selectedPrice) {
                        case 125 :
                            k = k + 1;
                        break;
                    }

                }

                System.out.println("Товар был куплен " + k + " раз/раза");

        }

    }



    public void storeBonusPurchase() {
        System.out.println("Покупка частично за счет бонусных баллов");
    }



    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public int getStoreCustomerNumber() {
        return storeCustomerNumber;
    }

    public void setStoreCustomerNumber(int storeCustomerNumber) {
        this.storeCustomerNumber = storeCustomerNumber;
    }

    public double getStoreBonusSum() {
        return storeBonusSum;
    }

    public void setStoreBonusSum(double storeBonusSum) {
        this.storeBonusSum = storeBonusSum;
    }

    public double getStoreRevenue() {
        return storeRevenue;
    }

    public void setStoreRevenue(double storeRevenue) {
        this.storeRevenue = storeRevenue;
    }


}
