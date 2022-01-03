package it;

import java.text.DecimalFormat;
import java.util.Scanner;


public class BonusSystem extends IT {

    private String bonusEndOfLife;
    private double bonusNumberOfPoints = 0;
    private String bonusCustomerIdInMobApp;
    private double bonusPayment;
    private double bonusPayPercentage;
    private double bonusAddPercentage;
    private double bonusAddNumber;

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    public BonusSystem() {
    }

    public BonusSystem(String itSystemName, String itSystemPurpose, String bonusEndOfLife, double bonusNumberOfPoints, String bonusCustomerIdInMobApp) {
        super(itSystemName, itSystemPurpose);
        this.bonusEndOfLife = bonusEndOfLife;
        this.bonusNumberOfPoints = bonusNumberOfPoints;
        this.bonusCustomerIdInMobApp = bonusCustomerIdInMobApp;
    }

    public void bonusActivate(String customerName, String customerID) {
        System.out.println("Сколько баллов дадим покупателю по имени " + customerName + " (" + customerID + ") за активацию мобильного приложения в первый раз");
        bonusNumberOfPoints = 0;
        do {
            System.out.println("Введите целой цифрой количество баллов, значение больше нуля");
            bonusNumberOfPoints = scanner.nextInt();
        } while (bonusNumberOfPoints <= 0);
        System.out.println("Активирована бонусная программа для клиента " + bonusCustomerIdInMobApp + " с количеством баллов " + df.format(bonusNumberOfPoints) + " и сроком действия до " + bonusEndOfLife);
    }

    public void bonusPercentageToPay(double kefirPrice, double cheesePrice) {
        System.out.println("Введите сколько процентов от покупки можно оплатить баллами, например, 5% вводите как 0,05 через запятую");
        bonusPayPercentage = scanner.nextDouble();
        bonusPayment = (kefirPrice + cheesePrice) * bonusPayPercentage;

    }

    public void bonusPayByPoints(String mobAppID) {
        System.out.println(bonusPayPercentage + " - это доля от суммы покупки товаров, за которую можно заплатить бонусными баллами в мобильном приложении " + mobAppID);
        bonusNumberOfPoints = bonusNumberOfPoints - bonusPayment;

    }

    public void bonusPercentageOfPurchase(double kefirPrice, double cheesePrice) {
        System.out.println("Введите сколько процентов от покупки можно засчитать покупателю баллами, например, 2% вводите как 0,02 через запятую");
        bonusAddPercentage = scanner.nextDouble();
        bonusAddNumber = (kefirPrice + cheesePrice) * bonusAddPercentage;

    }

    public void bonusAddPoints(String customerName, String customerID) {
        System.out.println("Покупателю по имени " + customerName + " (" + customerID + ") добавлены бонусные баллы от данной покупки в размере " + bonusAddPercentage + " (необходимо умножить на 100% чтобы понять сколько процентов)");
        bonusNumberOfPoints = bonusNumberOfPoints + bonusAddNumber;
        System.out.println(" ");
    }

    public void bonusMassive (String storeName, String customerName, String customerID, double [] bonusPayment, double [] bonusAdded, int numberOfDays) {
        System.out.println("Выведем массив всех операций с бонусными баллами у покупателя по имени " + customerName + " (" + customerID + ") в магазине под названием " + storeName);
        System.out.println("Баллы со знаком плюс - это начисления баллов покупателю. Баллы со знаком минус - это платежти баллами покупателем");
        int size = numberOfDays * 2;
        int k = 0;
        int g = 0;
        double [] bonusMassive = new double[size];
        for (int i = 1; i <= size; i++) {
            if (i%2 != 0){
                bonusMassive[i-1] = -bonusPayment[k];
                k = k + 1;
            } else {
                bonusMassive[i-1] = bonusAdded[g];
                g = g + 1;
            }
            System.out.println(i + "й элемент массива равен " + df.format(bonusMassive[i-1]));
        }
        double sumMassive = 0;
        for (double value : bonusMassive){
            sumMassive += value;
        }
        System.out.println("Сумма по всему массиву баллов равна " + df.format(sumMassive));
        System.out.println("");
    }



    public String getBonusEndOfLife() {
        return bonusEndOfLife;
    }

    public void setBonusEndOfLife(String bonusEndOfLife) {
        this.bonusEndOfLife = bonusEndOfLife;
    }

    public double getBonusNumberOfPoints() {
        return bonusNumberOfPoints;
    }

    public void setBonusNumberOfPoints(double bonusNumberOfPoints) {
        this.bonusNumberOfPoints = bonusNumberOfPoints;
    }

    public String getBonusCustomerIdInMobApp() {
        return bonusCustomerIdInMobApp;
    }

    public void setBonusCustomerIdInMobApp(String bonusCustomerIdInMobApp) {
        this.bonusCustomerIdInMobApp = bonusCustomerIdInMobApp;
    }

    public double getBonusPayment() {
        return bonusPayment;
    }

    public void setBonusPayment(double bonusPayment) {
        this.bonusPayment = bonusPayment;
    }

    public double getBonusPayPercentage() {
        return bonusPayPercentage;
    }

    public void setBonusPayPercentage(double bonusPayPercentage) {
        this.bonusPayPercentage = bonusPayPercentage;
    }


    public double getBonusAddPercentage() {
        return bonusAddPercentage;
    }

    public void setBonusAddPercentage(double bonusAddPercentage) {
        this.bonusAddPercentage = bonusAddPercentage;
    }


    public double getBonusAddNumber() {
        return bonusAddNumber;
    }

    public void setBonusAddNumber(double bonusAddNumber) {
        this.bonusAddNumber = bonusAddNumber;
    }

}
