package B.Pitza;

import B.model.Big;

public class PitzaBig extends Pitza implements Big {

    private int price;
    private String description;
    private String prodTypeName;

    public PitzaBig(int price, String description, String prodTypeName){
        this.price = price;
        this.description = description;
        this.prodTypeName = prodTypeName;
    }

    @Override
    public int setBigPrice() {
        price  = 270;
        return price;
    }

    @Override
    public String setBigDecription() {
        description = "большая пицца";
        return description;
    }

    @Override
    public String setBigProdTypeName() {
        prodTypeName = "пицца";
        return prodTypeName;
    }

    @Override
    public String toString() {
        return "PitzaBig{" +
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
