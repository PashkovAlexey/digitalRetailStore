package another;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Customer {

    private String customerName;
    private String customerID;
    private boolean customer18Older;
    private boolean customerVerificationOk;
    private boolean customerPensioner;
    private int customerAge;
    private int numberOfDays;
    private String tagsProductNameKefir;
    private String tagsManufacturerNameKefir;
    private String tagsProductNameCheese;
    private String tagsManufacturerNameCheese;

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();

    public Customer() {
    }

    public Customer(String customerName, String customerID, boolean customer18Older, boolean customerVerificationOk, boolean customerPensioner) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customer18Older = customer18Older;
        this.customerVerificationOk = customerVerificationOk;
        this.customerPensioner = customerPensioner;
    }


    public void customerNameAge() {
        System.out.println("Мы начинаем описывать CJM покупки в новом оцифрованном магазине Пятерочка.");
        System.out.println("Введите имя девушки, которая будет участвовать в CJM.");
        customerName = scanner.next();
        System.out.println("Введите одной целой цифрой возраст девушки по имени " + customerName);
        customerAge = scanner.nextInt();

    }

    public boolean customerDecision() {
        boolean stop = false;
        System.out.println("Покупатель по имени " + customerName + " решила зайти в магазин Пятерочка и купить немного продуктов.");
        System.out.println("Покупатель по имени " + customerName + " принимает решение заходить в магазин или нет");
        System.out.println("Выберите вариант ниже и введите целым цислом номер выбранного вами варианта");
        System.out.println("1 - покупатель не торопится и может зайти в магазин");
        System.out.println("2 - покупатель очень торопится");
        Integer pokupka1 = scanner.nextInt();
        boolean customerHasTime = true;
        if (pokupka1 == 1) {
            customerHasTime = true;
        } else if (pokupka1 == 2) {
            customerHasTime = false;
        }

        Boolean customerAlergy = true;
        System.out.println("Выберите вариант ниже и введите целым цислом номер выбранного вами варианта");
        System.out.println("1 - покупатель имеет аллергю на эти товары");
        System.out.println("2 - покупатель не имеет аллергии на эти товары");
        short pokupka2 = scanner.nextShort();
        if (pokupka2 == 1) {
            customerAlergy = true;
        } else if (pokupka2 == 2) {
            customerAlergy = false;
        }

        if (customerAlergy || !customerHasTime) {
            System.out.println(" ");
            System.out.println("Не пойдет покупатель в магазин ");
            stop = true;
        }
        return stop;
    }

    public boolean customerVerivication() {
        boolean mobileOperatorOk = true;
        customerVerificationOk = mobileOperatorOk;
        System.out.println("Покупатель по имени " + customerName + " начала проверку через мобильного оператора");
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вариант действий, введите целое число цифрой");
            System.out.println("1 - Проверка пройдена");
            System.out.println("2 - Проверка не пройдена");
            short operCheck = scanner.nextShort();
            if (operCheck == 1) {
                break;
            }
        }

        System.out.println("Пройдена проверка личности пользователя приложения по имени " + customerName + " по смс через мобильного оператора");
        return mobileOperatorOk;
    }

    public void customerApproveActivation() {
        System.out.println("Магазин дал ок на использование мобильного приложения пользователем под номером " + customerID);
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

    public boolean customerDecisionGetInto() {
        System.out.println("Покупатель по имени " + customerName + " готова к покупкам в магазине, замерзла пока все это делала на улице :(, но в следующий раз этого ничего не нужно будет");

        boolean stop = false;
        do {
            System.out.println("Точно ли покупатель по имени " + customerName + " хочет пойти в магазин? Выберите ваш вариант и напишите его номер одной целой цифрой");
            System.out.println("1 - да, пойдем в магазин");
            System.out.println("2 - нет, не пойдем в магазин, времени уже не осталось свободного");
            int choice = scanner.nextInt();
            if (choice == 1) {
                break;
            } else if (choice == 2) {
                stop = true;
                break;
            }
        } while (true);
        return stop;
    }

    public void customerNumberOfDays(String storeName) {
        System.out.println("Покупатель по имени " + customerName + " делает такие покупки как сейчас несколько раз в неделю по пути с работы домой");
        numberOfDays = 0;
        while (numberOfDays <= 0) {
            System.out.println("Введите целой цифрой количество раз, т.е. количество дней, когда покупатель по имени " + customerName + " делает такие покупки");
            int x = scanner.nextInt();
            if (x <= 6) {
                numberOfDays = x;
            } else if (x == 7) {
                System.out.println("Воскресенье выходной у покупателя по имени " + customerName);
            } else {
                System.out.println("Нет такого количества рабочих дней в одной неделе");
            }
        }
        if (numberOfDays == 1) {
            System.out.println("Мы условились, что такие покупки совершаются покупателем по имени " + customerName + " " + numberOfDays + " раз в неделю");
        } else if (numberOfDays <= 4) {
            System.out.println("Мы условились, что такие покупки совершаются покупателем по имени " + customerName + " " + numberOfDays + " раза в неделю");
        } else if (numberOfDays > 4) {
            System.out.println("Мы условились, что такие покупки совершаются покупателем по имени " + customerName + " " + numberOfDays + " раз в неделю");
        }
        System.out.println("Покупки все " + numberOfDays + " дня/дней будут совершаться в одном и том же магазине под названием " + storeName);
        System.out.println(" ");
    }

    public void customerShelfScan(String name) {
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
            for (int l2 = 1; l2 <= kefirNumber; l2 = l2 + (int) scanOrder) {
                System.out.println("Полка номер " + l1 + " и вид товара номер " + l2);
            }
        }


    }

    public void customerKefirName() {
        System.out.println("Покупатель по имени " + customerName + " заметила первый нужный ей товар и нашла его ценник");
        System.out.println("Покупатель по имени " + customerName + " смотрит на ценник кефира и видит основную инфрормацию о продукте");
        System.out.println("Введите одним словом название кефира выбранного покупателем по имени " + customerName);
        tagsProductNameKefir = scanner.next();
    }

    public void customerKefirManufacture() {
        System.out.println("Введите одним словом название изготовителя кефира выбранного покупателем по имени " + customerName);
        tagsManufacturerNameKefir = scanner.next();

    }

    public double customerKefirPrice() {
        System.out.println("Напишите какую цену увидела покупатель по имени " + customerName + " на ценнике кефира в виде числа с дробной частью после запятой");
        double y1 = 0;
        double price = 0;
        while (y1 <= 0) {
            y1 = scanner.nextDouble();
            boolean y2 = y1 > 0;
            if (y2) {
                price = y1;
            } else {
                System.out.println("Давай попробуем ввести цену кефира еще разок :)");
            }
        }
        return price;
    }

    public void customerReadKefir(int dayNumber, double tagsPriceKefir) {
        System.out.println("Покупатель по имени " + customerName + " решила купить кефир в " + dayNumber + "й раз по следующей информации увиденной на ценнике");
        System.out.println("Кефир по цене " + tagsPriceKefir + " рублей, под названием " + tagsProductNameKefir + " от изготовителя " + tagsManufacturerNameKefir);
        System.out.println("Покупатель по имени " + customerName + " поняла что товар называется " + tagsProductNameKefir);
        System.out.println("Покупатель по имени " + customerName + " поняла, что изготовитель кефира " + tagsManufacturerNameKefir);

    }

    public void customerCheeseName() {
        System.out.println("Покупатель по имени " + customerName + " заметила второй нужный ей товар и нашла его ценник");
        System.out.println("Покупатель по имени " + customerName + " смотрит на ценник сыра и видит основную инфрормацию о продукте");
        System.out.println("Введите одним словом название сыра выбранного покупателем по имени " + customerName);
        tagsProductNameCheese = scanner.next();

    }

    public void customerCheeseManufacture() {
        System.out.println("Введите одним словом название изготовителя сыра под названием " + tagsProductNameCheese + " выбранного покупателем по имени " + customerName);
        tagsManufacturerNameCheese = scanner.next();

    }

    public double customerCheesePrice() {
        System.out.println("Напишите какую цену увидела покупатель по имени " + customerName + " на ценнике сыра в виде числа с дробной частью после запятой");

        double price = 0;
        double y2 = 0;
        while (y2 <= 0) {
            y2 = scanner.nextDouble();
            if (y2 > 0) {
                price = y2;
            } else {
                System.out.println("Давай попробуем ввести цену сыра еще разок :)");
            }
        }

        return price;
    }

    public void customerReadCheese(int dayNumber, double tagsPriceCheese) {
        System.out.println("Покупатель по имени " + customerName + " решила купить сыр в " + dayNumber + "й раз по следующей информации увиденной на ценнике");
        System.out.println("Сыр по цене " + tagsPriceCheese + " рублей, под названием " + tagsProductNameCheese + " от изготовителя " + tagsManufacturerNameCheese);
        System.out.println("Покупатель по имени " + customerName + " поняла что товар называется " + tagsProductNameKefir);
        System.out.println("Покупатель по имени " + customerName + " поняла, что изготовитель сыра " + tagsManufacturerNameKefir);

    }

    public void customerBonusStatistics(double storeBonusSum, double bonusNumberOfPoints) {
        System.out.println(df.format(storeBonusSum) + " - столько бонусных баллов ушло на оплату всех покупок, что является упущенной выручкой магазина");
        System.out.println(df.format(bonusNumberOfPoints) + " - столько бонусных баллов осталось в мобильном приложении покупателя");
        System.out.println(" ");


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

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getTagsProductNameKefir() {
        return tagsProductNameKefir;
    }

    public void setTagsProductNameKefir(String tagsProductNameKefir) {
        this.tagsProductNameKefir = tagsProductNameKefir;
    }

    public String getTagsManufacturerNameKefir() {
        return tagsManufacturerNameKefir;
    }

    public void setTagsManufacturerNameKefir(String tagsManufacturerNameKefir) {
        this.tagsManufacturerNameKefir = tagsManufacturerNameKefir;
    }

    public String getTagsProductNameCheese() {
        return tagsProductNameCheese;
    }

    public void setTagsProductNameCheese(String tagsProductNameCheese) {
        this.tagsProductNameCheese = tagsProductNameCheese;
    }

    public String getTagsManufacturerNameCheese() {
        return tagsManufacturerNameCheese;
    }

    public void setTagsManufacturerNameCheese(String tagsManufacturerNameCheese) {
        this.tagsManufacturerNameCheese = tagsManufacturerNameCheese;
    }


}
