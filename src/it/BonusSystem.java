package Digital.Retail.Store.it;

public class BonusSystem extends IT {

    private String bonusEndOfLife;
    private double bonusNumberOfPoints;
    private String bonusCustomerIdInMobApp;

    public String getBonusEndOfLife() {
        return bonusEndOfLife;
    }

    public void setBonusEndOfLife(String bonusEndOfLife) {
        this.bonusEndOfLife = bonusEndOfLife;
    }

    public double getBonusNumberOfPoints() {
        return bonusNumberOfPoints;
    }

    public void setBonusNumberOfPoints(double bonusNumberOfPoints) {
        this.bonusNumberOfPoints = bonusNumberOfPoints;
    }

    public String getBonusCustomerIdInMobApp() {
        return bonusCustomerIdInMobApp;
    }

    public void setBonusCustomerIdInMobApp(String bonusCustomerIdInMobApp) {
        this.bonusCustomerIdInMobApp = bonusCustomerIdInMobApp;
    }

    public BonusSystem() {
    }

    public BonusSystem(double bonusNumberOfPoints) {
        this.bonusNumberOfPoints = bonusNumberOfPoints;
    }

    public BonusSystem(double bonusNumberOfPoints, String bonusCustomerIdInMobApp) {
        this.bonusNumberOfPoints = bonusNumberOfPoints;
        this.bonusCustomerIdInMobApp = bonusCustomerIdInMobApp;
    }

    public BonusSystem(String itSystemName, String itSystemPurpose, String bonusEndOfLife, double bonusNumberOfPoints, String bonusCustomerIdInMobApp) {
        super (itSystemName, itSystemPurpose);
        this.bonusEndOfLife = bonusEndOfLife;
        this.bonusNumberOfPoints = bonusNumberOfPoints;
        this.bonusCustomerIdInMobApp = bonusCustomerIdInMobApp;
    }



    public void bonusActivate() {
        System.out.println("Активирована бонусная программа для клиента " + bonusCustomerIdInMobApp + " с количеством баллов " + bonusNumberOfPoints + " и сроком действия до " + bonusEndOfLife);
    }

    public void bonusDeactivate() {
        System.out.println("Деактивировать бонусную программу в мобильном приложении магазина");
    }

    public void bonusAddPoints(double p, double q) {
        System.out.println("Покупателю добавлены бонусные баллы от данной покупки в размере " + p + " (необходимо умножить на 100% чтобы понять сколько процентов)");
        bonusNumberOfPoints = bonusNumberOfPoints + q;
        System.out.println(" ");
    }

    public void bonusPayByPoints(double p, double q) {
        System.out.println(p + " это доля от суммы покупки товаров, за которую можно заплатить бонусными баллами");
        bonusNumberOfPoints = bonusNumberOfPoints - q;

    }
    public void itSystemUpgrade() {
        System.out.println("Установлено обновление на систему подсчета бонусов");
    }

}
