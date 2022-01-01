package another;

import java.util.Scanner;

public class Customer {

    private String customerName;
    private String customerID;
    private boolean customer18Older;
    private boolean customerVerificationOk;
    private boolean customerPensioner;


    public Customer() {
    }
    public Customer(String customerID) {
        this.customerID = customerID;
    }

    public Customer(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public Customer(String customerName, String customerID, boolean customer18Older) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customer18Older = customer18Older;
    }

    public Customer(String customerName, String customerID, boolean customer18Older, boolean customerVerificationOk) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customer18Older = customer18Older;
        this.customerVerificationOk = customerVerificationOk;
    }

    public Customer(String customerName, String customerID, boolean customer18Older, boolean customerVerificationOk, boolean customerPensioner) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customer18Older = customer18Older;
        this.customerVerificationOk = customerVerificationOk;
        this.customerPensioner = customerPensioner;
    }


    public void customerApproveActivation() {
        System.out.println("Магазин дал ок на использование мобильного приложения пользователем под номером " + customerID);
    }

    public boolean customerVerivication() {
        boolean mobileOperatorOk = true;
        System.out.println("Покупатель по имени "  + customerName  + " начала проверку через мобильного оператора");
        for ( ; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вариант действий, введите целое число цифрой");
            System.out.println("1 - Проверка пройдена");
            System.out.println("2 - Проверка не пройдена");
            short operCheck = scanner.nextShort();
            if (operCheck == 1){
                break;
            }
        }

        System.out.println("Пройдена проверка личности пользователя приложения по имени " + customerName  + " по смс через мобильного оператора");
        return mobileOperatorOk;
    }

    public void customerBlocking() {
        System.out.println("Блокирования пользователя в мобильном приложении и системах магазина");
    }

    public void customerUnblocking(String p, int age) {
        System.out.println("С пользователя под номером " + p + " снята первичная блокировка в биллинге магазина");
        customer18Older = age >= 18;
        if (customerVerificationOk && !customer18Older) {
            System.out.println("В мобильном приложении не будет возможности покупки алкоголя");
        }
        customerPensioner = age >= 65;
        String s1 = customerVerificationOk && customerPensioner ? "Ваш профиль активирован и вам доступны доплнительные скидки на отдельные товары до 10 утра в будние дни" : "Ваш профиль активирован";
        System.out.println(s1);

    }

    public void customerShelfScan (String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Покупатель по имени " + name + " хочет найти необходимый ей товар на стеллаже. Сколько полок она видит, введите целое число цифрой");
        short polkaNumber = scanner.nextShort();
        System.out.println("Сколько видов товара в каждой полке, введите целое числов цифрой");
        short kefirNumber = scanner.nextShort();
        System.out.println("Как просматривать товар вдоль полки, выбери вариант ниже и введи номер варианта одной целой цифрой");
        System.out.println("1 - просматривать каждый товар на полке");
        System.out.println("2 - просматривать каждый второй товар на полке");
        System.out.println("3 - просматривать каждый третий товар на полке");
        System.out.println("N - просматривать каждый N-й товар на полке (введите любую целую цифру)");
        short scanOrder = scanner.nextShort();
        System.out.println("Покупатель по имени " + name + " начала просматривать все товары и искать подходящий ей");
        for (short l1 = 1; l1 <= polkaNumber; l1++) {
            for (int l2 = 1; l2 <= kefirNumber; l2 = l2 + (int)scanOrder) {
                System.out.println("Полка номер " + l1 + " и вид товара номер " + l2);
            }
        }


    }


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

    public boolean isCustomer18Older() {
        return customer18Older;
    }

    public void setCustomer18Older(boolean customer18Older) {
        this.customer18Older = customer18Older;
    }

    public boolean isCustomerVerificationOk() {
        return customerVerificationOk;
    }

    public void setCustomerVerificationOk(boolean customerVerificationOk) {
        this.customerVerificationOk = customerVerificationOk;
    }
    public boolean isPensioner() {
        return customerPensioner;
    }

    public void setPensioner(boolean customerPensioner) {
        this.customerPensioner = customerPensioner;
    }
}
