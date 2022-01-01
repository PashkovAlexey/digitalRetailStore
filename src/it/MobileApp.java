package it;

import another.DigitalCheque;


import java.text.DecimalFormat;

public class MobileApp extends IT {

    private String mobAppTypeOfOS;
    private String mobAppDeviceInfo;
    private String mobAppSystemRequirements;
    private String modAppCustomerId;
    private BackEndAPI apiCredetials = new BackEndAPI();

    public MobileApp() {
                ;
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



    public void mobAppGiveCheque (String name, int k, double kefirPrice, double cheesePrice, double bonusPaid, double bonusAdded, String kefirName, String cheeseName) {

        DecimalFormat df = new DecimalFormat("#.00");
        String chequeDateAndTime = "18:20 2" + k + ".12.2021 года";
        double chequeInfoPurchaseSumm = kefirPrice + cheesePrice;
        DigitalCheque chequeForClient = new DigitalCheque (name,"https://5ka.ru/", "8-800-555-55-05", chequeDateAndTime, "г.Москва, ул.Центральная, д.33", chequeInfoPurchaseSumm, bonusPaid, bonusAdded);
        System.out.println("Электронный чек");
        System.out.println("Магазин " + chequeForClient.getChequeStoreName());
        System.out.println(chequeForClient.getChequeInternetAddress());
        System.out.println(chequeForClient.getChequeTelephoneNumber());
        System.out.println(chequeForClient.getChequeInfoStoreAddress());
        System.out.println(chequeForClient.getChequeDateAndTime());
        System.out.println(kefirName + " " + df.format(kefirPrice) + " рублей");
        System.out.println(cheeseName + " " + df.format(cheesePrice) + " рублей");
        chequeForClient.chequePrint();




    }


    public void mobAppDownload() {
        System.out.println("Приложение скачано на смартфон с операционной системой " + mobAppTypeOfOS);
    }

    public void mobAppInstall(String customerName) {
        System.out.println("Приложение установлено на смартфоне изготовленном компанией " + mobAppDeviceInfo);
        System.out.println(" ");
        System.out.println("Параметры доступа мобильного приложения к back-end через API");
        System.out.println("Доменное имя: " + apiCredetials.getBackGiveDomain());
        modAppCustomerId = apiCredetials.backGiveLogin();
        System.out.println("id App клиента: " + modAppCustomerId);
        System.out.println("пароль App клиента: " + apiCredetials.backGivePassword(customerName));
        System.out.println(" ");


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

    public void mobAppScanQrOpenDoor(short i) {
        System.out.println("Покупатель " + modAppCustomerId + " просканировала QR на входе чтобы войти в магазин " + i + "й раз");
    }

    public void mobAppScanQrOpenDoor(int i) {
        System.out.println("Покупатель " + modAppCustomerId + " просканировала QR на входе чтобы войти в магазин " + i + "й раз");
    }
    public void mobAppScanQrOpenDoor() {
        System.out.println("Покупатель " + modAppCustomerId + " просканировала QR на входе чтобы войти в магазин " + "й раз");
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


}
