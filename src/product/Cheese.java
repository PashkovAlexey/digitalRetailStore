package product;

import java.text.DecimalFormat;
import java.util.Objects;

public class Cheese extends DairyProduct {

    private double cheeseWeight;
    public static String CHEESEPRODUCTTYPENAME;

    static {
        CHEESEPRODUCTTYPENAME = "сыр";
    }

    DecimalFormat df1 = new DecimalFormat("#.0");
    DecimalFormat df2 = new DecimalFormat("#.00");

    public Cheese() {
    }

    public Cheese(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins, double cheeseWeight, String productTypeName) {
        super(productName, productPrice, productDateOfProduction, productBarCode, dairyFats, dairyCalorie, dairyKindOfPackage, dairyDateEndOfLife, dairyWater, dairyCarbohydrates, dairyProteins, productTypeName);
        this.cheeseWeight = cheeseWeight;
    }

    public void productTakeItFromTheShelf(String customerName, String customerID) {
        System.out.println("Сыр взят с полки покупателем по имени " + customerName + " (" + customerID + ")");
    }

    public void productScanBarCode(String productName) {
        System.out.println("У сыра под названием " + productName + " просканирован штрихкод");
    }

    public void productPutItInTheBasket(String mobAppID) {
        System.out.println("Сыр положили в корзину в мобильном приложении " + mobAppID);
    }

    public String toString() {
        return "Товар " + CHEESEPRODUCTTYPENAME + " под названием " + getProductName() + " по цене " + df2.format(getProductPrice()) + " изготовленный " + getProductDateOfProduction() + " массой " + df1.format(cheeseWeight) + ". Упаковка " + getDairyKindOfPackage() + ". Жирность " + getDairyFats();
    }

    public double getCheeseWeight() {
        return cheeseWeight;
    }

    public void setCheeseWeight(int cheeseWeight) {
        this.cheeseWeight = cheeseWeight;
    }


}
