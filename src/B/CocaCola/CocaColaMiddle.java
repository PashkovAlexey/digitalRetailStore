package B.CocaCola;

import B.model.Middle;

public class CocaColaMiddle extends CocaCola implements Middle {

    private int price;
    private String description;
    private String prodTypeName;


    public CocaColaMiddle(int price, String description, String prodTypeName){
        this.price = price;
        this.description = description;
        this.prodTypeName = prodTypeName;
    }

    @Override
    public int setMiddlePrice() {
        price  = 70;
        return price;
    }

    @Override
    public String setMiddleDecription() {
        description = "средняя кока-кола";
        return description;
    }

    @Override
    public String setMiddleProdTypeName() {
        prodTypeName = "кока-кола";
        return prodTypeName;
    }

    @Override
    public String toString() {
        return "CocaColaMiddle{" +
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
