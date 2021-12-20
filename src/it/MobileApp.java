package Digital.Retail.Store.it;

public class MobileApp extends IT {

    private String mobAppTypeOfOS;
    private String mobAppDeviceInfo;
    private String mobAppSystemRequirements;
    private String modAppCustomerId;

    public String getMobAppTypeOfOS() {
        return mobAppTypeOfOS;
    }

    public void setMobAppTypeOfOS(String mobAppTypeOfOS) {
        this.mobAppTypeOfOS = mobAppTypeOfOS;
    }

    public String getMobAppDeviceInfo() {
        return mobAppDeviceInfo;
    }

    public void setMobAppDeviceInfo(String mobAppDeviceInfo) {
        this.mobAppDeviceInfo = mobAppDeviceInfo;
    }

    public String getMobAppSystemRequirements() {
        return mobAppSystemRequirements;
    }

    public void setMobAppSystemRequirements(String mobAppSystemRequirements) {
        this.mobAppSystemRequirements = mobAppSystemRequirements;
    }

    public String getModAppCustomerId() {
        return modAppCustomerId;
    }

    public void setModAppCustomerId(String modAppCustomerId) {
        this.modAppCustomerId = modAppCustomerId;
    }

    public MobileApp() {
    }

    public MobileApp(String modAppCustomerId) {
        this.modAppCustomerId = modAppCustomerId;
    }

    public MobileApp(String mobAppTypeOfOS, String modAppCustomerId) {
        this.mobAppTypeOfOS = mobAppTypeOfOS;
        this.modAppCustomerId = modAppCustomerId;
    }


    public MobileApp(String mobAppTypeOfOS, String mobAppDeviceInfo, String modAppCustomerId) {
        this.mobAppTypeOfOS = mobAppTypeOfOS;
        this.mobAppDeviceInfo = mobAppDeviceInfo;
        this.modAppCustomerId = modAppCustomerId;
    }

    public MobileApp(String itSystemName, String itSystemPurpose, String mobAppTypeOfOS, String mobAppDeviceInfo, String mobAppSystemRequirements, String modAppCustomerId) {
        super (itSystemName, itSystemPurpose);
        this.mobAppTypeOfOS = mobAppTypeOfOS;
        this.mobAppDeviceInfo = mobAppDeviceInfo;
        this.mobAppSystemRequirements = mobAppSystemRequirements;
        this.modAppCustomerId = modAppCustomerId;
    }



    public void mobAppDownload() {
        System.out.println("Приложение скачано на смартфон с операционной системой " + mobAppTypeOfOS);
    }

    public void mobAppInstall() {
        System.out.println("Приложение установлено на смартфоне изготовленном компанией " + mobAppDeviceInfo);
    }

    public void mobAppDelete() {
        System.out.println("Удаление приложения со смартфона");
    }

    public void mobAppOpen() {
        System.out.println("Приложение открыто на смартфоне покупателя " + getModAppCustomerId());
    }

    public void mobAppClose() {
        System.out.println("Покупатель закрыл мобильное приложение магазина");
    }

    public void mobAppScanQrOpenDoor(int i) {
        System.out.println("Покупатель " + modAppCustomerId + " просканировала QR на входе чтобы войти в магазин " + i + "й раз");
    }

    public void mobAppScanProductBarCode(String p, String q) {
        System.out.println("Мобильным приложением под номером " + p + " просканирован штрихкод, название товара " + q);
    }

    public void mobAppApproveChosenProducts(String p, String q) {
        System.out.println("В мобильном приложении одобрены к покупке два товара: кефир под названием " + p + " и сыр под названием " + q);
    }

    public void mobAppBuyProducts() {
        System.out.println("Выбранные продукты оплачены в мобильном приложении");
    }

    public void mobAppOpenDoorGetOut() {
        System.out.println("С помощью мобильного приложения отправлена команда разблокировать замок двери магазина чтобы выйти из магазина");
    }
    public void itSystemUpgrade() {
        System.out.println("Установлено обновление на мобильное приложение на смартфоне у пользователя под номером " + modAppCustomerId);
    }


}
