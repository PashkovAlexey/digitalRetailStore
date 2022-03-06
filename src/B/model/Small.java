package B.model;

public interface Small extends Size {
    default int setSmallPrice() {
        int price = 0;
        return price;
    }

    default String setSmallDecription() {
        String description = " ";
        return description;
    }

    default String setSmallProdTypeName() {
        String prodTypeName = " ";
        return prodTypeName;
    }
}
