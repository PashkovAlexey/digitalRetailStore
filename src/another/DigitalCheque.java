package another;

import java.text.DecimalFormat;

public class DigitalCheque {

    private String chequeStoreName;
    private String chequeInternetAddress;
    private String chequeTelephoneNumber;
    private String chequeDateAndTime;
    private String chequeInfoStoreAddress;
    private double chequeInfoPurchaseSumm;
    private double chequeInfoBonusPaid;
    private double chequeInfoBonusAdded;

    DecimalFormat df = new DecimalFormat("#.00");


    public DigitalCheque() {

    }

    public DigitalCheque(String chequeStoreName, String chequeInternetAddress, String chequeTelephoneNumber, String chequeDateAndTime, String chequeInfoStoreAddress, double chequeInfoPurchaseSumm, double chequeInfoBonusPaid, double chequeInfoBonusAdded) {
        this.chequeStoreName = chequeStoreName;
        this.chequeInternetAddress = chequeInternetAddress;
        this.chequeTelephoneNumber = chequeTelephoneNumber;
        this.chequeDateAndTime = chequeDateAndTime;
        this.chequeInfoStoreAddress = chequeInfoStoreAddress;
        this.chequeInfoPurchaseSumm = chequeInfoPurchaseSumm;
        this.chequeInfoBonusPaid = chequeInfoBonusPaid;
        this.chequeInfoBonusAdded = chequeInfoBonusAdded;
    }

    public void chequePrint() {
        System.out.println("Сумма покупки " + df.format(chequeInfoPurchaseSumm) + " рублей");
        System.out.println("НДС 20%");
        System.out.println(df.format(chequeInfoBonusPaid) + " баллов потрачено");
        System.out.println(df.format(chequeInfoBonusAdded) + " баллов начислено");
    }


    public String getChequeStoreName() {
        return chequeStoreName;
    }

    public void setChequeStoreName(String chequeStoreName) {
        this.chequeStoreName = chequeStoreName;
    }

    public String getChequeInternetAddress() {
        return chequeInternetAddress;
    }

    public void setChequeInternetAddress(String chequeInternetAddress) {
        this.chequeInternetAddress = chequeInternetAddress;
    }

    public String getChequeTelephoneNumber() {
        return chequeTelephoneNumber;
    }

    public void setChequeTelephoneNumber(String chequeTelephoneNumber) {
        this.chequeTelephoneNumber = chequeTelephoneNumber;
    }

    public String getChequeDateAndTime() {
        return chequeDateAndTime;
    }

    public void setChequeDateAndTime(String chequeDateAndTime) {
        this.chequeDateAndTime = chequeDateAndTime;
    }

    public String getChequeInfoStoreAddress() {
        return chequeInfoStoreAddress;
    }

    public void setChequeInfoStoreAddress(String chequeInfoStoreAddress) {
        this.chequeInfoStoreAddress = chequeInfoStoreAddress;
    }

    public double getChequeInfoPurchaseSumm() {
        return chequeInfoPurchaseSumm;
    }

    public void setChequeInfoPurchaseSumm(double chequeInfoPurchaseSumm) {
        this.chequeInfoPurchaseSumm = chequeInfoPurchaseSumm;
    }

    public double getChequeInfoBonusPaid() {
        return chequeInfoBonusPaid;
    }

    public void setChequeInfoBonusPaid(double chequeInfoBonusPaid) {
        this.chequeInfoBonusPaid = chequeInfoBonusPaid;
    }

    public double getChequeInfoBonusAdded() {
        return chequeInfoBonusAdded;
    }

    public void setChequeInfoBonusAdded(double chequeInfoBonusAdded) {
        this.chequeInfoBonusAdded = chequeInfoBonusAdded;
    }

}
