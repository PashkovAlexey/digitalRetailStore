package product;

public class Product {

    private String productName;
    private double productPrice;
    private String productDateOfProduction;
    private String productBarCode;
    private String productTypeName;


    public Product() {
    }

    public Product(double productPrice) {
        this.productPrice = productPrice;
    }

    public Product(double productPrice, String productDateOfProduction) {
        this.productPrice = productPrice;
        this.productDateOfProduction = productDateOfProduction;
    }

    public Product(double productPrice, String productDateOfProduction, String productBarCode) {
        this.productPrice = productPrice;
        this.productDateOfProduction = productDateOfProduction;
        this.productBarCode = productBarCode;
    }

    public Product(String productName, double productPrice, String productDateOfProduction, String productBarCode, String productTypeName) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDateOfProduction = productDateOfProduction;
        this.productBarCode = productBarCode;
        this.productTypeName = productTypeName;
    }


    public void productTakeItFromTheShelf() {
        System.out.println("Продукт взял с полки");
    }

    public void productScanBarCode() {
        System.out.println("У продукта просканирован штрихкод");
    }

    public void productPutItInTheBasket() {
        System.out.println("Продукт положили в корзину в мобильном приложении");
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDateOfProduction() {
        return productDateOfProduction;
    }

    public void setProductDateOfProduction(String productDateOfProduction) {
        this.productDateOfProduction = productDateOfProduction;
    }

    public String getProductBarCode() {
        return productBarCode;
    }

    public void setProductBarCode(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }


}
