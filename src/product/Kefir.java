package product;

public class Kefir extends DairyProduct {

    private double kefirVolume;
    private String kefirProductTypeName;


    public Kefir() {
    }

    public Kefir(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins, double kefirVolume, String kefirProductTypeName) {
        super(productName, productPrice, productDateOfProduction, productBarCode, dairyFats, dairyCalorie, dairyKindOfPackage, dairyDateEndOfLife, dairyWater, dairyCarbohydrates, dairyProteins);
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
