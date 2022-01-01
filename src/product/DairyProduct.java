package product;


public class DairyProduct extends Product {

    private double dairyFats;
    private int dairyCalorie;
    private String dairyKindOfPackage;
    private String dairyDateEndOfLife;
    private double dairyWater;
    private double dairyCarbohydrates;
    private double dairyProteins;


    public DairyProduct() {
    }

    public DairyProduct(String dairyDateEndOfLife) {
        this.dairyDateEndOfLife = dairyDateEndOfLife;
    }


    public DairyProduct(double dairyFats, String dairyDateEndOfLife) {
        this.dairyFats = dairyFats;
        this.dairyDateEndOfLife = dairyDateEndOfLife;
    }

    public DairyProduct(double dairyFats, int dairyCalorie, String dairyDateEndOfLife) {
        this.dairyFats = dairyFats;
        this.dairyCalorie = dairyCalorie;
        this.dairyDateEndOfLife = dairyDateEndOfLife;
    }

    public DairyProduct(double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife) {
        this.dairyFats = dairyFats;
        this.dairyCalorie = dairyCalorie;
        this.dairyKindOfPackage = dairyKindOfPackage;
        this.dairyDateEndOfLife = dairyDateEndOfLife;
    }

    public DairyProduct(double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyProteins) {
        this.dairyFats = dairyFats;
        this.dairyCalorie = dairyCalorie;
        this.dairyKindOfPackage = dairyKindOfPackage;
        this.dairyDateEndOfLife = dairyDateEndOfLife;
        this.dairyProteins = dairyProteins;
    }

    public DairyProduct(double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyCarbohydrates, double dairyProteins) {
        this.dairyFats = dairyFats;
        this.dairyCalorie = dairyCalorie;
        this.dairyKindOfPackage = dairyKindOfPackage;
        this.dairyDateEndOfLife = dairyDateEndOfLife;
        this.dairyCarbohydrates = dairyCarbohydrates;
        this.dairyProteins = dairyProteins;
    }


    public DairyProduct(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins) {
        super (productName, productPrice, productDateOfProduction, productBarCode);
        this.dairyFats = dairyFats;
        this.dairyCalorie = dairyCalorie;
        this.dairyKindOfPackage = dairyKindOfPackage;
        this.dairyDateEndOfLife = dairyDateEndOfLife;
        this.dairyWater = dairyWater;
        this.dairyCarbohydrates = dairyCarbohydrates;
        this.dairyProteins = dairyProteins;
    }


    public void productPutItOnTheShelf() {
        System.out.println("Молочный продукт положили на полку");
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
    public void productTakeItFromTheBasket() {
        System.out.println("Молочный продукт убран из корзины в мобильном приложении");
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
