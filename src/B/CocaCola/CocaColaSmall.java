package B.CocaCola;

import B.model.Small;

public class CocaColaSmall implements Small {

    private int price;
    private String description;
    private String prodTypeName;

    public CocaColaSmall(int price, String description, String prodTypeName){
        this.price = price;
        this.description = description;
        this.prodTypeName = prodTypeName;
    }

    @Override
    public int setSmallPrice() {
        price  = 58;
        return price;
    }

    @Override
    public String setSmallDecription() {
        description = "маленькая кока-кола";
        return description;
    }

    @Override
    public String setSmallProdTypeName() {
        prodTypeName = "кока-кола";
        return prodTypeName;
    }

    @Override
    public String toString() {
        return "CocaColaSmall{" +
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
