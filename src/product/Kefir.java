package product;

public class Kefir extends DairyProduct {

    private double kefirVolume;
    private String kefirProductTypeName;


    public Kefir() {
    }

    public Kefir(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins, double kefirVolume, String kefirProductTypeName) {
        super (productName, productPrice, productDateOfProduction, productBarCode, dairyFats, dairyCalorie, dairyKindOfPackage, dairyDateEndOfLife, dairyWater, dairyCarbohydrates, dairyProteins);
        this.kefirVolume = kefirVolume;
    }


    public void productPutItOnTheShelf() {
        System.out.println("Кефир положили на полку");
    }

    public void productTakeItFromTheShelf(String p) {
        System.out.println("Кефир взят с полки покупателем по имени " + p);
    }

    public void productScanBarCode(String p) {
        System.out.println("У кефира под названием " + p + " просканирован штрихкод");
        System.out.println(" ");

    }

    public void productPutItInTheBasket() {
        System.out.println("Кефир положили в корзину в мобильном приложении");
    }
    public void productTakeItFromTheBasket() {
        System.out.println("Кефир убран из корзины в мобильном приложении");
    }

    public double getKefirVolume() {
        return kefirVolume;
    }

    public void setKefirVolume(double kefirVolume) {
        this.kefirVolume = kefirVolume;
    }

    public String getKefirProductTypeName() {
        return kefirProductTypeName;
    }

    public void setKefirProductTypeName(String kefirProductTypeName) {
        this.kefirProductTypeName = kefirProductTypeName;
    }


}
