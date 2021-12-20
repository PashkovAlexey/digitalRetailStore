package Digital.Retail.Store.another;

public class Customer {

    private String customerName;
    private String customerID;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }


    public Customer() {
    }
    public Customer(String customerID) {
        this.customerID = customerID;
    }

    public Customer(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }



    public void customerApproveActivation() {
        System.out.println("Магазин дал ок на использование мобильного приложения пользователем под номером " + customerID);
    }

    public void customerVerivication() {
        System.out.println("Пройдена проверка личности пользователя приложения по имени " + customerName  + " по смс через мобильного оператора");
    }

    public void customerBlocking() {
        System.out.println("Блокирования пользователя в мобильном приложении и системах магазина");
    }

    public void customerUnblocking(String p) {
        System.out.println("С пользователя под номером " + p + " снята первичная блокировка в биллинге магазина");
    }


}
