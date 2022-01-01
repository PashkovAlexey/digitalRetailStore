package product;

public class Cheese extends DairyProduct {

    private double cheeseWeight;

    public Cheese() {
    }

    public Cheese(String productName, double productPrice, String productDateOfProduction, String productBarCode, double dairyFats, int dairyCalorie, String dairyKindOfPackage, String dairyDateEndOfLife, double dairyWater, double dairyCarbohydrates, double dairyProteins, double cheeseWeight) {
        super ( productName,  productPrice,  productDateOfProduction,  productBarCode, dairyFats,  dairyCalorie, dairyKindOfPackage, dairyDateEndOfLife, dairyWater, dairyCarbohydrates, dairyProteins);
        this.cheeseWeight = cheeseWeight;
    }


    public void productPutItOnTheShelf() {
        System.out.println("Сыр положили на полку");
    }

    public void productTakeItFromTheShelf(String p) {
        System.out.println("Сыр взят с полки покупателем по имени " + p);
    }

    public void productScanBarCode(String p) {
        System.out.println("У сыра под названием " + p + " просканирован штрихкод");
    }

    public void productPutItInTheBasket() {
        System.out.println("Сыр положили в корзину в мобильном приложении");
    }
    public void productTakeItFromTheBasket() {
        System.out.println("Сыр убран из корзины в мобильном приложении");
    }

    public double getCheeseWeight() {
        return cheeseWeight;
    }

    public void setCheeseWeight(int cheeseWeight) {
        this.cheeseWeight = cheeseWeight;
    }

}
