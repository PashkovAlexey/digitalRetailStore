package A.it;

import A.another.DigitalCheque;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class MobileApp extends IT {

    private String mobAppTypeOfOS;
    private String mobAppDeviceInfo;
    private String mobAppSystemRequirements;
    private String modAppCustomerId;
    private DigitalCheque chequeForClient;
    private BackEndAPI apiCredetials = new BackEndAPI();

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");


    public MobileApp() {
    }

    public MobileApp(String itSystemName, String itSystemPurpose, String mobAppTypeOfOS, String mobAppDeviceInfo, String mobAppSystemRequirements, String modAppCustomerId) {
        super(itSystemName, itSystemPurpose);
        this.mobAppTypeOfOS = mobAppTypeOfOS;
        this.mobAppDeviceInfo = mobAppDeviceInfo;
        this.mobAppSystemRequirements = mobAppSystemRequirements;
        this.modAppCustomerId = modAppCustomerId;
    }

    public void mobAppDeviceInfoDownloadInstall (String customerName) {
        mobAppDeviceInfo(customerName);
        mobAppDownload(customerName, mobAppTypeOfOS);
        mobAppInstall(customerName, mobAppDeviceInfo);
    }

    public void mobAppOpenDoorGetOutAppClose(String customerID, String storeDescription, String customerName) {
        mobAppOpenDoorGetOut(customerID, storeDescription);
        mobAppClose(customerName, customerID, storeDescription);
    }



    public void mobAppOpen(String CustomerName, String ModAppCustomerId) {
        System.out.println("Покупателю по имени " + CustomerName + " присвоен идентификатор " + ModAppCustomerId);
        System.out.println("Приложение открыто на смартфоне покупателя по имени " + CustomerName + " (" + getModAppCustomerId() + ")");
    }

    public void mobAppScanQrOpenDoor(int dayNumber) {
        System.out.println("Покупатель " + modAppCustomerId + " просканировала QR на входе чтобы войти в магазин " + dayNumber + "й раз");
        System.out.println(" ");
    }

    public void mobAppScanProductBarCode(String customerID, String productName) {
        System.out.println("Мобильным приложением под номером " + customerID + " просканирован штрихкод, название товара " + productName);
    }

    public void mobAppApproveChosenProducts(String kefirName, String cheeseName) {
        System.out.println(" ");
        System.out.println("В мобильном приложении одобрены к покупке два товара: кефир под названием " + kefirName + " и сыр под названием " + cheeseName);
    }

    public void mobAppBuyProducts(String mobAppID) {
        System.out.println("Выбранные продукты оплачены в мобильном приложении " + mobAppID);
    }

    public void mobAppGiveCheque(String chequeStoreName, int dayNumber, double kefirPrice, double cheesePrice, double bonusPaid, double bonusAdded, String kefirName, String cheeseName, List<DigitalCheque> chequeList) {

        String chequeDateAndTime = "18:20 2" + dayNumber + ".12.2021 года";
        double chequeInfoPurchaseSumm = kefirPrice + cheesePrice;
        chequeForClient = new DigitalCheque(chequeStoreName, "https://5ka.ru/", "8-800-555-55-05", chequeDateAndTime, "г.Москва, ул.Центральная, д.33", chequeInfoPurchaseSumm, bonusPaid, bonusAdded);
        chequeList.add(chequeForClient);
        System.out.println("Электронный чек");
        System.out.println("Магазин " + chequeForClient.getChequeStoreName());
        System.out.println(chequeForClient.getChequeInternetAddress());
        System.out.println(chequeForClient.getChequeTelephoneNumber());
        System.out.println(chequeForClient.getChequeInfoStoreAddress());
        System.out.println(chequeForClient.getChequeDateAndTime());
        System.out.println(kefirName + " " + df.format(kefirPrice) + " рублей");
        System.out.println(cheeseName + " " + df.format(cheesePrice) + " рублей");
        chequeForClient.chequePrint();
        System.out.println(" ");
    }


    private void mobAppDeviceInfo(String customerName) {
        System.out.println(customerName + " скачивает мобильное приложение магазина Пятерочка.");
        System.out.println("Какой тип операционной системы у смартфона покупателя по имени " + customerName + " ?");
        mobAppTypeOfOS = scanner.next();
        System.out.println("Кто изготовитель смартфона у покупателя по имени " + customerName + " ?");
        mobAppDeviceInfo = scanner.next();
        String mobAppSystemRequirements = "Место в памяти не менее 20 Мбайт";
        System.out.println("Покупатель по имени " + customerName + " ознакомилась с требованиями к смартфону: " + mobAppSystemRequirements);

    }

    private void mobAppDownload(String customerName, String mobAppTypeOfOS) {
        System.out.println("Приложение скачано на смартфон покупателя по имени " + customerName + " с операционной системой " + mobAppTypeOfOS);
    }


    private void mobAppInstall(String customerName, String mobAppDeviceInfo) {
        System.out.println("Приложение установлено на смартфоне покупателя по имени " + customerName + " изготовленном компанией " + mobAppDeviceInfo);
        System.out.println(" ");
        System.out.println("Параметры доступа мобильного приложения покупателя по имени " + customerName + " к back-end через API");
        modAppCustomerId = apiCredetials.backGiveLogin();
        System.out.println("id App клиента: " + modAppCustomerId);
        System.out.println("пароль App клиента: " + apiCredetials.backGivePassword(customerName));
        System.out.println("Доменное имя: " + apiCredetials.getBackGiveDomain());
        System.out.println(" ");
    }


    private void mobAppOpenDoorGetOut(String customerID, String storeName) {
        System.out.println("С помощью мобильного приложения " + customerID + " отправлена команда разблокировать замок двери магазина чтобы выйти из магазина " + storeName);
    }


    private void mobAppClose(String customerName, String customerID, String storeName) {
        System.out.println("Покупатель по имени " + customerName + " (" + customerID + ") закрыл мобильное приложение магазина " + storeName);
        System.out.println(" ");
    }


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

    public DigitalCheque getChequeForClient() {
        return chequeForClient;
    }

    public void setChequeForClient(DigitalCheque chequeForClient) {
        this.chequeForClient = chequeForClient;
    }


}
