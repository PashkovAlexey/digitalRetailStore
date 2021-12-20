package Digital.Retail.Store.retailStoreEquipment;

public class DigitalPriceTag extends RetailStoreEquipment {

    private String tagsScreenColor;
    private double tagsPrice;
    private String tagsProductName;
    private String tagsManufacturerName;
    private String tagsSize;

    public String getTagsScreenColor() {
        return tagsScreenColor;
    }

    public void setTagsScreenColor(String tagsScreenColor) {
        this.tagsScreenColor = tagsScreenColor;
    }


    public double getTagsPrice() {
        return tagsPrice;
    }

    public void setTagsPrice(double tagsPrice) {
        this.tagsPrice = tagsPrice;
    }


    public String getTagsProductName() {
        return tagsProductName;
    }

    public void setTagsProductName(String tagsProductName) {
        this.tagsProductName = tagsProductName;
    }


    public String getTagsManufacturerName() {
        return tagsManufacturerName;
    }

    public void setTagsManufacturerName(String tagsManufacturerName) {
        this.tagsManufacturerName = tagsManufacturerName;
    }

    public String getTagsSize() {
        return tagsSize;
    }

    public void setTagsSize(String tagsSize) {
        this.tagsSize = tagsSize;
    }

    public DigitalPriceTag() {
    }

    public DigitalPriceTag(double tagsPrice) {
        this.tagsPrice = tagsPrice;
    }

    public DigitalPriceTag(double tagsPrice, String tagsProductName) {
        this.tagsPrice = tagsPrice;
        this.tagsProductName = tagsProductName;
    }

    public DigitalPriceTag(double tagsPrice, String tagsProductName, String tagsManufacturerName) {
        this.tagsPrice = tagsPrice;
        this.tagsProductName = tagsProductName;
        this.tagsManufacturerName = tagsManufacturerName;
    }

    public DigitalPriceTag(String tagsScreenColor, double tagsPrice, String tagsProductName, String tagsManufacturerName) {
        this.tagsScreenColor = tagsScreenColor;
        this.tagsPrice = tagsPrice;
        this.tagsProductName = tagsProductName;
        this.tagsManufacturerName = tagsManufacturerName;
    }

    public DigitalPriceTag(String retailEquipmentName, String tagsScreenColor, double tagsPrice, String tagsProductName, String tagsManufacturerName, String tagsSize) {
        super (retailEquipmentName);
        this.tagsScreenColor = tagsScreenColor;
        this.tagsPrice = tagsPrice;
        this.tagsProductName = tagsProductName;
        this.tagsManufacturerName = tagsManufacturerName;
        this.tagsSize = tagsSize;
    }


    public void tagsReadThePrice(String p, String q) {
        System.out.println("Покупатель по имени " + p + " поняла цену товара под названием " + q);
    }

    public void tagsReadProductName(String p, String q) {
        System.out.println("Покупатель по имени " + p + " поняла что товар называется " + q);
    }

    public void tagsReadManufacturerName(String p, String q) {
        System.out.println("Покупатель по имени " + p + " поняла кто изготовитель товара");
    }


}
