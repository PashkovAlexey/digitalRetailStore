package another;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RetailStore {

    private String storeDescription;
    private int storeCustomerNumber;
    private double storeBonusSum;
    private double storeRevenue;
    private double maxPrice;

    DecimalFormat df = new DecimalFormat("#.00");
    Scanner scanner = new Scanner(System.in);


    public RetailStore() {
    }

    public RetailStore(String storeDescription, int storeCustomerNumber, int storeBonusSum, double storeRevenue) {
        this.storeDescription = storeDescription;
        this.storeCustomerNumber = storeCustomerNumber;
        this.storeBonusSum = storeBonusSum;
        this.storeRevenue = storeRevenue;
    }

    public void storePurchase(String storeName) {
        System.out.println("В магазине под названием " + storeName + " совершена покупка");
    }

    public void storePaymentAddToRevenue(double kefirPrice, double cheesePrice, String storeName) {
        storeRevenue = storeRevenue + kefirPrice + cheesePrice;
        System.out.println("Стоимость покупки товара или товаров добавлена к выручке магазина " + storeName);
    }

    public void storeAddBonusSum(double bonusPayment) {
        storeBonusSum = storeBonusSum + bonusPayment;
    }

    public void storeRevenueCalculate(double bonusPayment, double bonusNumberOfPoints) {
        if (bonusPayment < bonusNumberOfPoints) {
            storeRevenue = storeRevenue - bonusPayment;
        }
    }

    public void storeAverageCheque(int numberOfDays, String customerName, String customerID) {
        System.out.println("Количество покупок за неделю " + storeCustomerNumber + " штук");
        System.out.println("Выручка магазина " + storeDescription + " за неделю от данного покупателя по имени " + customerName + " (" + customerID + ") составила " + df.format(storeRevenue) + " рублей");
        double averRevenuePerCustomer = (storeRevenue) / (storeCustomerNumber);
        System.out.println("Средний чек за неделю на данного покупателя по имени " + customerName + " (" + customerID + ") составил " + df.format(averRevenuePerCustomer) + " рублей. За неделю было " + numberOfDays + " покупок в магазине данным покупателем");
    }

    public void storeFindMaxPriceOneProduct(double[] weekOneProduct, String productTypeName) {
        for (int i = 1; i <= weekOneProduct.length; i++) {
            if (weekOneProduct[i - 1] > maxPrice) {
                maxPrice = weekOneProduct[i - 1];
            }
        }
        System.out.println("Самый дорогой " + productTypeName + " за неделю стоил " + df.format(maxPrice) + " рублей");
    }

    public void storePrintAllOneTypeProduct(double[] weekOneProduct, String productTypeName) {
        System.out.println("Список остальных купленных товаров " + productTypeName);
        for (double selectedOne : weekOneProduct) {
            if (selectedOne == maxPrice) continue;
            System.out.println(productTypeName + " " + df.format(selectedOne) + " рублей");
        }
    }

    public void findNumberOfSameProductsByPrice(double[] weekFirstTypeProduct, double[] weekSecondTypeProduct) {
        System.out.println("Поищем сколько раз был куплен один и тот же товар? Поиск осуществляется по цене товара. Выбери вариант ниже и введи его одной целой цифрой.");
        System.out.println("1 - да, поищем");
        System.out.println("Любая цифра - нет, пропускаем и идем дальше");
        int choice = scanner.nextInt();
        if (choice == 1) {
            int x1 = weekFirstTypeProduct.length;
            int x2 = weekSecondTypeProduct.length;
            int x3 = x1 + x2;
            double[] weekAllProduct = new double[x3];
            for (int i = 0; i < x3; i++) {
                if (i < x1) {
                    weekAllProduct[i] = weekFirstTypeProduct[i];
                } else {
                    weekAllProduct[i] = weekSecondTypeProduct[i - x1];
                }
            }
            System.out.println("Напечатаем все цены всех купленных товаров");
            for (int i = 0; i < x3; i++) {
                System.out.println(df.format(weekAllProduct[i]) + " рублей");
            }
            double maxPriceProductWeek = weekAllProduct [0];
            for (int i = 0; i < x3; i++) {
                if (weekAllProduct[i] > maxPriceProductWeek){
                    maxPriceProductWeek = weekAllProduct[i];
                }
            }
            System.out.println("Самый дорогой товар за неделю стоил " + df.format(maxPriceProductWeek) + " рублей");
            double minPriceProductWeek = weekAllProduct [0];
            for (int i = 0; i < x3; i++) {
                if (weekAllProduct[i] < minPriceProductWeek){
                    minPriceProductWeek = weekAllProduct[i];
                }
            }
            System.out.println("Самый дешевый товар за неделю стоил " + df.format(minPriceProductWeek) + " рублей");
            int[] weekAllProductInt = new int[x3];
            for (int i = 0; i < x3; i++) {
                weekAllProductInt[i] = (int) weekAllProduct[i];
            }
            System.out.println(" ");
            System.out.println("Давайте поищем сколько раз был куплен товар за 125 рублей");
            int k = 0;
            for (int selectedPrice : weekAllProductInt) {
                switch (selectedPrice) {
                    case 125:
                        k = k + 1;
                        break;
                }
            }
            System.out.println("Товар по цене 125 рублей (не важно сколько копеек) был куплен " + k + " раз/раза");
        }
        System.out.println(" ");
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

    public void setStoreCustomerNumber() {
        this.storeCustomerNumber = storeCustomerNumber;
        storeCustomerNumber = storeCustomerNumber + 1;
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

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
