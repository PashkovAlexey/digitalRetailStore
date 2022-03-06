package B.Pitza;

import B.model.Middle;

public class PitzaMiddle extends Pitza implements Middle {

    private int price;
    private String description;
    private String prodTypeName;

    public PitzaMiddle(int price, String description, String prodTypeName){
        this.price = price;
        this.description = description;
        this.prodTypeName = prodTypeName;
    }

    @Override
    public int setMiddlePrice() {
        price  = 200;
        return price;
    }

    @Override
    public String setMiddleDecription() {
        description = "средняя пицца";
        return description;
    }

    @Override
    public String setMiddleProdTypeName() {
        prodTypeName = "пицца";
        return prodTypeName;
    }

    @Override
    public String toString() {
        return "PitzaMiddle{" +
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
