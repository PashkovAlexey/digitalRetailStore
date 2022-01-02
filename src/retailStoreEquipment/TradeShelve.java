package retailStoreEquipment;

public class TradeShelve extends RetailStoreEquipment {

    private int shelvesLength;
    private int shelvesNumber;

    public TradeShelve() {
    }

    public TradeShelve(String retailEquipmentName, int shelvesLength, int shelvesNumber) {
        super(retailEquipmentName);
        this.shelvesLength = shelvesLength;
        this.shelvesNumber = shelvesNumber;
    }

    public int getShelvesLength() {
        return shelvesLength;
    }

    public void setShelvesLength(int shelvesLength) {
        this.shelvesLength = shelvesLength;
    }

    public int getShelvesNumber() {
        return shelvesNumber;
    }

    public void setShelvesNumber(int shelvesNumber) {
        this.shelvesNumber = shelvesNumber;
    }


}
