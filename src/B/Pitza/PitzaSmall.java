package B.Pitza;

import B.model.Small;

public class PitzaSmall extends Pitza implements Small {

    private int price;
    private String description;
    private String prodTypeName;

    public PitzaSmall(int price, String description, String prodTypeName){
        this.price = price;
        this.description = description;
        this.prodTypeName = prodTypeName;
    }

    @Override
    public int setSmallPrice() {
        price  = 110;
        return price;
    }

    @Override
    public String setSmallDecription() {
        description = "маленькая пицца";
        return description;
    }

    @Override
    public String setSmallProdTypeName() {
        prodTypeName = "пицца";
        return prodTypeName;
    }

    @Override
    public String toString() {
        return "PitzaSmall{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", prodTypeName='" + prodTypeName + '\'' +
                '}';
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getTypeProductName() {
        return prodTypeName;
    }
}
