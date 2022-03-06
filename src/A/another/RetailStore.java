package A.another;

import A.product.Cheese;
import A.product.Kefir;
import A.product.Product;

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

    public void storePurchaseSetCustomerNumberAddToRevenue (double priceKefir, double priceCheese) {
        storePurchase(storeDescription);
        setStoreCustomerNumber();
        storePaymentAddToRevenue(priceKefir, priceCheese, storeDescription);
    }

    public void storeSixFinalMethods (int numberOfDays, String customerName, String customerID, double [] tagsPriceKefir, double [] tagsPriceCheese) {
        storeAverageCheque(numberOfDays, customerName, customerID);
        storeFindMaxPriceOneProduct(tagsPriceKefir, "кефир");
        storePrintAllOneTypeProduct(tagsPriceKefir, "кефир");
        storeFindMaxPriceOneProduct(tagsPriceCheese, "сыр");
        storePrintAllOneTypeProduct(tagsPriceCheese, "сыр");
        findNumberOfSameProductsByPrice(tagsPriceKefir, tagsPriceCheese);
    }


    public void storeAddBonusSum(double bonusPayment) {
        storeBonusSum = storeBonusSum + bonusPayment;
    }

    public void storeRevenueCalculate(double bonusPayment, double bonusNumberOfPoints) {
        if (bonusPayment < bonusNumberOfPoints) {
            storeRevenue = storeRevenue - bonusPayment;
        }
    }

    public void storePurchaseStatistics (Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays){
        System.out.println("Статистика продаж магазина " + storeDescription);
        System.out.println("Список купленных товаров типа " + Kefir.KEFIRPRODUCTTYPENAME);
        for (int dayNumber = 1; dayNumber <= numberOfDays; dayNumber++){
            System.out.println(kefirMassive[dayNumber-1].toString());
        }
        System.out.println(" ");
        System.out.println("Список купленных товаров типа " + Cheese.CHEESEPRODUCTTYPENAME);
        for (int dayNumber = 1; dayNumber <= numberOfDays; dayNumber++){
            System.out.println(cheeseMassive[dayNumber-1].toString());
        }
        System.out.println(" ");
        System.out.println("Список всех купленных товаров в порядке очередности");
        int k = 0;
        int g = 0;
        Product [] allProducts = new Product[numberOfDays*2];
        for (int productNumber = 1; productNumber <= numberOfDays*2 ;  productNumber++){
            if (productNumber%2 != 0){
                allProducts[productNumber-1] = kefirMassive[k];
                k = k + 1;
            } else {
                allProducts[productNumber-1] = cheeseMassive[g];
                g = g + 1;
            }
        }
        for (Product each : allProducts){
            System.out.println(each);
        }
        System.out.println(" ");
        System.out.println("Список покупок по дням, стоимость");
        double [] dayPrice = new double [numberOfDays];
        for (int dayNumber = 1; dayNumber <= numberOfDays; dayNumber++){
            dayPrice[dayNumber-1] = kefirMassive[dayNumber-1].getProductPrice() + cheeseMassive[dayNumber-1].getProductPrice();
            System.out.println(dayNumber + "й день, стоимость покупки " + df.format(dayPrice[dayNumber-1]) + " рублей");
        }
        System.out.println("Подсчет суммы продаж всех товаров типа " + Kefir.KEFIRPRODUCTTYPENAME);
        double sumKefirSelected = 0.00;
        for (int productNumber = 1; productNumber <= numberOfDays*2 ;  productNumber++){
            String x2 = allProducts[productNumber-1].getProductTypeName();
            if ( x2 == "кефир"){
                sumKefirSelected = sumKefirSelected + allProducts[productNumber-1].getProductPrice();
            }
        }
        System.out.println(sumKefirSelected + " рублей - сумма продаж товаров типа " + Kefir.KEFIRPRODUCTTYPENAME);
        System.out.println("Подсчет суммы продаж всех товаров типа " + Cheese.CHEESEPRODUCTTYPENAME);
        double sumCheeseSelected = 0.00;
        for (int productNumber = 1; productNumber <= numberOfDays*2 ;  productNumber++){
            String x3 = allProducts[productNumber-1].getProductTypeName();
            if ( x3 == "сыр"){
                sumCheeseSelected = sumCheeseSelected + allProducts[productNumber-1].getProductPrice();
            }
        }
        System.out.println(sumCheeseSelected + " рублей - сумма продаж товаров типа " + Cheese.CHEESEPRODUCTTYPENAME);
        System.out.println(" ");

    }

    public void storeObjectsMethods (Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays){
        System.out.println("Работа с методами класса Object");
        toStringMethod(kefirMassive, cheeseMassive, numberOfDays);
        hashCodeMethod(kefirMassive, cheeseMassive, numberOfDays);
        equalsMethod(kefirMassive, cheeseMassive, numberOfDays);
        getClassMethod(kefirMassive, cheeseMassive, numberOfDays);
        cloneMethod(kefirMassive, cheeseMassive, numberOfDays);
        System.out.println(" ");
    }



    private void toStringMethod (Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays) {
        System.out.println(" ");
        System.out.println("Работа с методом toString");
        for (Integer dayNumber = 1 ; dayNumber <= numberOfDays; dayNumber++){
            System.out.println(kefirMassive[dayNumber-1].toString());
            System.out.println(cheeseMassive[dayNumber-1].toString());
        }
    }

    private void hashCodeMethod (Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays) {
        System.out.println(" ");
        System.out.println("Работа с методом hashCode");
        for (Integer dayNumber = 1 ; dayNumber <= numberOfDays; dayNumber++){
            System.out.println(kefirMassive[dayNumber-1].hashCode() + " " + kefirMassive[dayNumber-1].getProductTypeName());
            System.out.println(cheeseMassive[dayNumber-1].hashCode() + " " + cheeseMassive[dayNumber-1].getProductTypeName());
        }
    }

    private void equalsMethod (Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays) {
        System.out.println(" ");
        System.out.println("Работа с методом equals");
        for (Integer dayNumber = 2 ; dayNumber <= numberOfDays; dayNumber++){
            System.out.println(kefirMassive[dayNumber-2].equals(kefirMassive[dayNumber-1]));
            System.out.println(cheeseMassive[dayNumber-2].equals(cheeseMassive[dayNumber-1]));
        }
    }

    private void getClassMethod (Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays) {
        System.out.println(" ");
        System.out.println("Работа с методом getClass");
        for (Integer dayNumber = 2 ; dayNumber <= numberOfDays; dayNumber++){
            System.out.println(kefirMassive[dayNumber-2].getClass().toString() + " / " + kefirMassive[dayNumber-2].getClass().getCanonicalName() + " / " + kefirMassive[dayNumber-2].getClass().getPackage());
            System.out.println(cheeseMassive[dayNumber-2].getClass().toString() + " / " + cheeseMassive[dayNumber-2].getClass().getCanonicalName() + " / " + cheeseMassive[dayNumber-2].getClass().getPackage());
        }
    }

    private void cloneMethod (Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays) {
        System.out.println(" ");
        System.out.println("Работа с методом clone");
        Kefir [] clonedKefir;
        Cheese [] clonedCheese;
        for (Integer dayNumber = 1 ; dayNumber <= numberOfDays; dayNumber++){
            clonedKefir = kefirMassive.clone();
            clonedCheese = cheeseMassive.clone();
            System.out.println("Клонирование кефира удалось? = " + clonedKefir[dayNumber-1].equals(kefirMassive[dayNumber-1]));
            System.out.println("Клонирование сыра удалось? = " + clonedCheese[dayNumber-1].equals(cheeseMassive[dayNumber-1]));
        }
    }

    private void storePurchase(String storeName) {
        System.out.println("В магазине под названием " + storeName + " совершена покупка");
    }

    private void storePaymentAddToRevenue(double kefirPrice, double cheesePrice, String storeName) {
        storeRevenue = storeRevenue + kefirPrice + cheesePrice;
        System.out.println("Стоимость покупки товара или товаров добавлена к выручке магазина " + storeName);
    }

    private void storeAverageCheque(int numberOfDays, String customerName, String customerID) {
        System.out.println("Количество покупок за неделю " + storeCustomerNumber + " штук");
        System.out.println("Выручка магазина " + storeDescription + " за неделю от данного покупателя по имени " + customerName + " (" + customerID + ") составила " + df.format(storeRevenue) + " рублей");
        double averRevenuePerCustomer = (storeRevenue) / (storeCustomerNumber);
        System.out.println("Средний чек за неделю на данного покупателя по имени " + customerName + " (" + customerID + ") составил " + df.format(averRevenuePerCustomer) + " рублей. За неделю было " + numberOfDays + " покупок в магазине данным покупателем");
    }


    private void storeFindMaxPriceOneProduct(double[] weekOneProduct, String productTypeName) {
        for (int i = 1; i <= weekOneProduct.length; i++) {
            if (weekOneProduct[i - 1] > maxPrice) {
                maxPrice = weekOneProduct[i - 1];
            }
        }
        System.out.println("Самый дорогой " + productTypeName + " за неделю стоил " + df.format(maxPrice) + " рублей");
    }


    private void storePrintAllOneTypeProduct(double[] weekOneProduct, String productTypeName) {
        System.out.println("Список остальных купленных товаров " + productTypeName);
        for (double selectedOne : weekOneProduct) {
            if (selectedOne == maxPrice) continue;
            System.out.println(productTypeName + " " + df.format(selectedOne) + " рублей");
        }
    }


    private void findNumberOfSameProductsByPrice(double[] weekFirstTypeProduct, double[] weekSecondTypeProduct) {
        System.out.println("Поищем сколько раз был куплен один и тот же товар? Поиск осуществляется по цене товара. Выбери вариант ниже и введи его одной целой цифрой.");
        System.out.println("1 - да, поищем");
        System.out.println("Любая цифра - нет, пропускаем и идем дальше");
        int choice = scanner.nextInt();
        if (choice == 1) {
            int x1 = weekFirstTypeProduct.length;
            int x2 = weekSecondTypeProduct.length;
            int x3 = x1 + x2;
            Double[] weekAllProduct = new Double[x3];
            String [] weekAllProductString = new String[x3];
            for (int i = 0; i < x3; i++) {
                if (i < x1) {
                    weekAllProduct[i] = weekFirstTypeProduct[i];
                } else {
                    weekAllProduct[i] = weekSecondTypeProduct[i - x1];
                }
            }
            System.out.println("Напечатаем все цены всех купленных товаров");
            for (int i = 0; i < x3; i++) {
                weekAllProductString[i] = weekAllProduct[i].toString();
                System.out.println(weekAllProductString[i] + " рублей");
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

            System.out.println(" ");
            System.out.println("Давайте поищем сколько раз был куплен товар за 125.7 рублей");
            int k = 0;
            for (String selectedPrice : weekAllProductString) {
                switch (selectedPrice) {
                    case "125.7":
                        k = k + 1;
                        break;
                }
            }
            System.out.println("Товар по цене 125.7 рублей (не важно сколько копеек) был куплен " + k + " раз/раза");
        }
        System.out.println(" ");
    }



    @Override
    public String toString() {
        return storeDescription;
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

    private void setStoreCustomerNumber() {
        this.storeCustomerNumber = storeCustomerNumber;
        storeCustomerNumber = storeCustomerNumber + 1;
    }

}
