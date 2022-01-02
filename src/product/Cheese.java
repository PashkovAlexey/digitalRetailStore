package product;

public class Cheese extends DairyProduct {

    private double cheeseWeight;

    public Cheese() {
    }

    public Cheese(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins, double cheeseWeight) {
        super(productName, productPrice, productDateOfProduction, productBarCode, dairyFats, dairyCalorie, dairyKindOfPackage, dairyDateEndOfLife, dairyWater, dairyCarbohydrates, dairyProteins);
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


    public double getCheeseWeight() {
        return cheeseWeight;
    }

    public void setCheeseWeight(int cheeseWeight) {
        this.cheeseWeight = cheeseWeight;
    }

}
