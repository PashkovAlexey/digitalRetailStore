package product;

import java.text.DecimalFormat;

public class Kefir extends DairyProduct {

    private double kefirVolume;
    public static String KEFIRPRODUCTTYPENAME;

    static {
        KEFIRPRODUCTTYPENAME = "кефир";
    }

    DecimalFormat df1 = new DecimalFormat("#.0");
    DecimalFormat df2 = new DecimalFormat("#.00");


    public Kefir() {
    }

    public Kefir(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins, double kefirVolume, String productTypeName) {
        super(productName, productPrice, productDateOfProduction, productBarCode, dairyFats, dairyCalorie, dairyKindOfPackage, dairyDateEndOfLife, dairyWater, dairyCarbohydrates, dairyProteins, productTypeName);
        this.kefirVolume = kefirVolume;
    }

    public void productTakeItFromTheShelf(String customerName, String customerID) {
        System.out.println("Кефир взят с полки покупателем по имени " + customerName + " (" + customerID + ")");
    }

    public void productScanBarCode(String productName) {
        System.out.println("У кефира под названием " + productName + " просканирован штрихкод");
        System.out.println(" ");
    }

    public void productPutItInTheBasket(String mobAppID) {
        System.out.println("Кефир положили в корзину в мобильном приложении " + mobAppID);
    }

    public String toString() {
        return "Товар " + KEFIRPRODUCTTYPENAME + " под названием " + getProductName() + " по цене " + df2.format(getProductPrice()) + " изготовленный " + getProductDateOfProduction() + " объемом " + df1.format(kefirVolume) + ". Упаковка " + getDairyKindOfPackage() + ". Жирность " + getDairyFats() + ". Калорийность " + getDairyCalorie();
    }


    public double getKefirVolume() {
        return kefirVolume;
    }

    public void setKefirVolume(double kefirVolume) {
        this.kefirVolume = kefirVolume;
    }


}
