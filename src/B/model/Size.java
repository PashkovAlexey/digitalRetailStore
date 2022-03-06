package B.model;

public interface Size {

    default int getPrice() {
        int price = 0;
        return price;
    }

    default String getTypeProductName(){
        String prodTypeName = "";
        return prodTypeName;
    }
}
