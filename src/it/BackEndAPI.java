package it;

import java.text.DecimalFormat;
import java.util.Random;

public class BackEndAPI extends IT {

    private String backLogin;
    private String backPassword;
    private String backGiveDomain = "https://5ka.ru/";

    Random random = new Random();

    public BackEndAPI (){

    }


    public String backGiveLogin(){
        DecimalFormat df = new DecimalFormat("000000000");
        int x1 = random.nextInt(1000000000);
        backLogin = "id" + df.format(x1);
        return backLogin;
    }

    public String backGivePassword(String CustomerName){
        DecimalFormat df = new DecimalFormat("000000000");
        int x2 = random.nextInt(1000000000);
        backPassword = CustomerName + df.format(x2);
        return backPassword;
    }

    public String getBackGiveDomain() {
        return backGiveDomain;
    }

    public void setBackGiveDomain(String backGiveDomain) {
        this.backGiveDomain = backGiveDomain;
    }

}
