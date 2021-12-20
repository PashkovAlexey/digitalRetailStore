package Digital.Retail.Store.another;

import Digital.Retail.Store.Product.Cheese;
import Digital.Retail.Store.Product.Product;

public class RetailStore {

    private String storeDescription;
    private int storeCustomerNumber;
    private double storeBonusSum;
    private double storeRevenue;


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
