package B.CocaCola;

import B.model.Big;

public class CocaColaBig extends CocaCola implements Big {

    private int price;
    private String description;
    private String prodTypeName;


    public CocaColaBig(int price, String description, String prodTypeName){
        this.price = price;
        this.description = description;
        this.prodTypeName = prodTypeName;
    }

    @Override
    public int setBigPrice() {
        price  = 99;
        return price;
    }

    @Override
    public String setBigDecription() {
        description = "большая кока-кола";
        return description;
    }

    @Override
    public String setBigProdTypeName() {
        prodTypeName = "кока-кола";
        return prodTypeName;
    }

    @Override
    public String toString() {
        return "CocaColaBig{" +
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
