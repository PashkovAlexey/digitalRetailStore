package A.product;


public abstract class DairyProduct extends Product {

    private double dairyFats;
    private int dairyCalorie;
    private String dairyKindOfPackage;
    private String dairyDateEndOfLife;
    private double dairyWater;
    private double dairyCarbohydrates;
    private double dairyProteins;


    public DairyProduct() {
    }

    public DairyProduct(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins, String productTypeName) {
        super(productName, productPrice, productDateOfProduction, productBarCode, productTypeName);
        this.dairyFats = dairyFats;
        this.dairyCalorie = dairyCalorie;
        this.dairyKindOfPackage = dairyKindOfPackage;
        this.dairyDateEndOfLife = dairyDateEndOfLife;
        this.dairyWater = dairyWater;
        this.dairyCarbohydrates = dairyCarbohydrates;
        this.dairyProteins = dairyProteins;
    }

    public void productTakeItFromTheShelf() {
        System.out.println("Молочный продукт взял с полки");
    }

    public void productScanBarCode() {
        System.out.println("У молочного продукта просканирован штрихкод");
    }

    public void productPutItInTheBasket() {
        System.out.println("Молочный продукт положили в корзину в мобильном приложении");
    }


    public double getDairyFats() {
        return dairyFats;
    }

    public void setDairyFats(double dairyFats) {
        this.dairyFats = dairyFats;
    }

    public int getDairyCalorie() {
        return dairyCalorie;
    }

    public void setDairyCalorie(int dairyCalorie) {
        this.dairyCalorie = dairyCalorie;
    }

    public String getDairyKindOfPackage() {
        return dairyKindOfPackage;
    }

    public void setDairyKindOfPackage(String dairyKindOfPackage) {
        this.dairyKindOfPackage = dairyKindOfPackage;
    }

    public String getDairyDateEndOfLife() {
        return dairyDateEndOfLife;
    }

    public void setDairyDateEndOfLife(String dairyDateEndOfLife) {
        this.dairyDateEndOfLife = dairyDateEndOfLife;
    }

    public double getDairyWater() {
        return dairyWater;
    }

    public void setDairyWater(double dairyWater) {
        this.dairyWater = dairyWater;
    }

    public double getDairyCarbohydrates() {
        return dairyCarbohydrates;
    }

    public void setDairyCarbohydrates(double dairyCarbohydrates) {
        this.dairyCarbohydrates = dairyCarbohydrates;
    }

    public double getDairyProteins() {
        return dairyProteins;
    }

    public void setDairyProteins(double dairyProteins) {
        this.dairyProteins = dairyProteins;
    }


}
