package B.model;

public interface Big extends Size {
    default int setBigPrice() {
        int price = 0;
        return price;
    }

    default String setBigDecription() {
        String description = " ";
        return description;
    }

    default String setBigProdTypeName() {
        String prodTypeName = " ";
        return prodTypeName;
    }


}
