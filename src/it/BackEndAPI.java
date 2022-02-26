package it;

import java.text.DecimalFormat; import java.util.Random;
public class BackEndAPI extends IT implements APIDomainInitialization {
    private String backLogin;
    private String backPassword;
    private String backGiveDomain;
    {
        backGiveDomain = APIDomainInitialize();

    }
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("000000000");
    public BackEndAPI() { }

    public String backGiveDomain() {
        return backGiveDomain;
    }

    public String backGiveLogin() {
        int x1 = random.nextInt(1000000000);
        backLogin = "id" + df.format(x1);
        return backLogin;
    }

    public String backGivePassword(String CustomerName) {
        int x2 = random.nextInt(1000000000);
        backPassword = CustomerName + df.format(x2);
        return backPassword;
    }

    public String getBackLogin() {
        return backLogin;
    }
    public void setBackLogin(String backLogin) {
        this.backLogin = backLogin;
    }

    public String getBackPassword() {
        return backPassword;
    }
    public void setBackPassword(String backPassword) {
        this.backPassword = backPassword;
    }

    public String getBackGiveDomain() {
        return backGiveDomain;
    }
    public void setBackGiveDomain(String backGiveDomain) {
        this.backGiveDomain = backGiveDomain;
    }

}
