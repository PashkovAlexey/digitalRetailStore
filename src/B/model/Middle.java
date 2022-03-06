package B.model;

public interface Middle extends Size {

    default int setMiddlePrice() {
        int price = 0;
        return price;
    }

    default String setMiddleDecription() {
        String description = " ";
        return description;
    }

    default String setMiddleProdTypeName() {
        String prodTypeName = " ";
        return prodTypeName;
    }
}
