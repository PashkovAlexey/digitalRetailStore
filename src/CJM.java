package Digital.Retail.Store;

import Digital.Retail.Store.another.Customer;
import Digital.Retail.Store.another.RetailStore;
import Digital.Retail.Store.it.BonusSystem;
import Digital.Retail.Store.it.MobileApp;
import Digital.Retail.Store.Product.Cheese;
import Digital.Retail.Store.Product.Kefir;
import Digital.Retail.Store.Product.Product;
import Digital.Retail.Store.retailStoreEquipment.DigitalPriceTag;
import another.DigitalCheque;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CJM {
    public static void main(String[] args) {

        System.out.println("Мы начинаем описывать CJM покупки в новом оцифрованном магазине Пятерочка.");
        System.out.println("Введите имя девушки, которая будет участвовать в CJM.");
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.next();
        String customerID = "";

        Customer human = new Customer(customerName, customerID);
        System.out.println("Покупатель по имени " + human.getCustomerName() + " решила зайти в магазин Пятерочка и купить немного продуктов.");
        System.out.println(human.getCustomerName() + " скачивает мобильное приложение магазина Пятерочка.");
        System.out.println("Какой тип операционной системы у смартфона покупателя по имени " + human.getCustomerName() + " ?");
        String mobAppTypeOfOS = scanner.next();
        System.out.println("Кто изготовитель смартфона у покупателя по имени " + human.getCustomerName() + " ?");
        String mobAppDeviceInfo = scanner.next();
        String mobAppSystemRequirements = "Место в памяти не менее 20 Мбайт";
        System.out.println("Покупатель по имени " + human.getCustomerName() + " ознакомилась с требованиями к смартфону: " + mobAppSystemRequirements);
        String modAppCustomerId = "id1234567890";

        human.setCustomerID(modAppCustomerId);

        MobileApp mobAppHuman = new MobileApp("Мобильное приложение магазина", "Канал обслуживания и продаж", mobAppTypeOfOS, mobAppDeviceInfo, mobAppSystemRequirements, modAppCustomerId);
        System.out.println("Покупателю по имени " + human.getCustomerName() + " присвоен идентификатор " + mobAppHuman.getModAppCustomerId());
        mobAppHuman.mobAppDownload();
        mobAppHuman.mobAppInstall();
        mobAppHuman.mobAppOpen();
        human.customerVerivication();
        human.customerApproveActivation();
        human.customerUnblocking(modAppCustomerId);

        System.out.println("Сколько баллов дадим покупателю по имени " + human.getCustomerName() + " за активацию мобильного приложения в первый раз");
        double bonusNumberOfPoints = 0;
        while (bonusNumberOfPoints <= 0){
            System.out.println("Введите целой цифрой количество баллов, значение больше нуля");
            bonusNumberOfPoints = scanner.nextInt();
        }

        String bonusCustomerIdInMobApp = modAppCustomerId;
        BonusSystem bonus = new BonusSystem("Система бонусных баллов", "повышение лояльности, рост NPS", "30.12.2021", bonusNumberOfPoints, bonusCustomerIdInMobApp);
        bonus.bonusActivate();
        bonus.setBonusNumberOfPoints(bonusNumberOfPoints);
        mobAppHuman.itSystemUpgrade();
        System.out.println("Покупатель по имени " + human.getCustomerName() + " готова к покупкам в магазине, замерзла пока все это делала на улице :(, но в следующий раз этого ничего не нужно будет");

        System.out.println("Покупатель по имени " + human.getCustomerName() + " делает такие покупки как сейчас несколько раз в неделю по пути с работы домой");
        int numberOfDays = 0;
        while (numberOfDays <= 0){
            System.out.println("Введите целой цифрой количество раз, т.е. количество дней, когда покупатель по имени " + human.getCustomerName() + " делает такие покупки");
            int x = scanner.nextInt();
            if (x <= 6) {
                numberOfDays = x;
            } else if (x == 7) {
                System.out.println("Воскресенье выходной у покупателя по имени " + human.getCustomerName());
            } else {
                System.out.println("Нет такого количества рабочих дней в одной неделе");
            }
        }
        if (numberOfDays == 1){
            System.out.println("Мы условились, что такие покупки совершаются покупателем по имени " + human.getCustomerName() + " " + numberOfDays + " раз в неделю");
        } else if (numberOfDays <= 4) {
            System.out.println("Мы условились, что такие покупки совершаются покупателем по имени " + human.getCustomerName() + " " + numberOfDays + " раза в неделю");
        } else if (numberOfDays > 4){
            System.out.println("Мы условились, что такие покупки совершаются покупателем по имени " + human.getCustomerName() + " " + numberOfDays + " раз в неделю");
        }

        RetailStore pyaterochka = new RetailStore("Пятерочка", 0, 0, 0);
        System.out.println("Покупки все " + numberOfDays + " дня/дней будут совершаться в одном и том же магазине под названием " + pyaterochka.getStoreDescription());
        double b = 0;
        pyaterochka.setStoreBonusSum(b);
        System.out.println(" ");


        double [] tagsPriceKefir = new double [numberOfDays];
        double [] tagsPriceCheese = new double [numberOfDays];

        for (int i = 1; i <= numberOfDays; i++){
            mobAppHuman.mobAppScanQrOpenDoor(i);
            System.out.println(" ");

            //покупка кефира

            System.out.println("Покупатель по имени " + customerName + " заметила первый нужный ей товар и нашла его ценник");
            System.out.println("Покупатель по имени " + customerName + " смотрит на ценник кефира и видит основную инфрормацию о продукте");
            System.out.println("Введите одним словом название кефира выбранного покупателем по имени " + customerName);
            String tagsProductNameKefir = scanner.next();
            System.out.println("Введите одним словом название изготовителя кефира под названием " + tagsProductNameKefir + " выбранного покупателем по имени " + customerName);
            String tagsManufacturerNameKefir = scanner.next();
            System.out.println("Напишите какую цену увидела покупатель по имени " + customerName + " на ценнике кефира в виде числа с дробной частью после запятой");

            int j1 = i-1;
            double y1 = 0;
            while (y1 <= 0){
                y1 = scanner.nextDouble();
                if (y1 >0) {
                    tagsPriceKefir[j1] = y1;
                } else {
                    System.out.println("Давай попробуем ввести цену кефира еще разок :)");
                }
            }
            DigitalPriceTag priceTagKefir = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceKefir[i-1], tagsProductNameKefir, tagsManufacturerNameKefir, "Ценник среднего размера");
            System.out.println("Покупатель по имени " + customerName + " решила купить кефир в " + i + "й раз по следующей информации увиденной на ценнике");
            System.out.println("Кефир по цене " + priceTagKefir.getTagsPrice() + " рублей, под названием " + priceTagKefir.getTagsProductName() + " от изготовителя " + priceTagKefir.getTagsManufacturerName());
            priceTagKefir.tagsReadProductName(customerName, priceTagKefir.getTagsProductName());
            priceTagKefir.tagsReadManufacturerName(customerName, priceTagKefir.getTagsProductName());
            priceTagKefir.tagsReadThePrice(customerName, priceTagKefir.getTagsProductName());

            Kefir kefirChosen = new Kefir(priceTagKefir.getTagsProductName(), priceTagKefir.getTagsPrice(), "10.12.2021", "1984654854", 2.5, 440, "Бутылка пластиковая", "27.12.2021", 23.2, 10.1,  125.12,  1.5);
            kefirChosen.productTakeItFromTheShelf(customerName);
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagKefir.getTagsProductName());
            kefirChosen.productScanBarCode(priceTagKefir.getTagsProductName());
            System.out.println(" ");


            //покупка сыра

            System.out.println("Покупатель по имени " + customerName + " заметила второй нужный ей товар и нашла его ценник");
            System.out.println("Покупатель по имени " + customerName + " смотрит на ценник сыра и видит основную инфрормацию о продукте");
            System.out.println("Введите одним словом название сыра выбранного покупателем по имени " + customerName);
            String tagsProductNameCheese = scanner.next();
            System.out.println("Введите одним словом название изготовителя сыра под названием " + tagsProductNameCheese + " выбранного покупателем по имени " + customerName);
            String tagsManufacturerNameCheese = scanner.next();
            System.out.println("Напишите какую цену увидела покупатель по имени " + customerName + " на ценнике сыра в виде числа с дробной частью после запятой");

            int j2 = i-1;
            double y2 = 0;
            while (y2 <= 0){
                y2 = scanner.nextDouble();
                if (y2 >0) {
                    tagsPriceCheese[j2] = y2;
                } else {
                    System.out.println("Давай попробуем ввести цену сыра еще разок :)");
                }
            }
            DigitalPriceTag priceTagCheese = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceCheese[i-1], tagsProductNameCheese, tagsManufacturerNameCheese, "Ценник среднего размера");
            System.out.println("Покупатель по имени " + customerName + " решила купить сыр в " + i + "й раз по следующей информации увиденной на ценнике");
            System.out.println("Сыр по цене " + priceTagCheese.getTagsPrice() + " рублей, под названием " + priceTagCheese.getTagsProductName() + " от изготовителя " + priceTagCheese.getTagsManufacturerName());
            priceTagCheese.tagsReadProductName(customerName, priceTagCheese.getTagsProductName());
            priceTagCheese.tagsReadManufacturerName(customerName, priceTagCheese.getTagsProductName());
            priceTagCheese.tagsReadThePrice(customerName, priceTagCheese.getTagsProductName());

            Cheese cheeseChosen = new Cheese(priceTagCheese.getTagsProductName(), priceTagCheese.getTagsPrice(), "13.12.2021", "17495875678", 23.8, 230, "Мягкая упаковка", "25.12.2021", 23.2, 102.12, 345.43, 300.10);
            cheeseChosen.productTakeItFromTheShelf(customerName);
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagCheese.getTagsProductName());
            cheeseChosen.productScanBarCode(priceTagCheese.getTagsProductName());


            mobAppHuman.mobAppApproveChosenProducts(priceTagKefir.getTagsProductName(), priceTagCheese.getTagsProductName());
            kefirChosen.productPutItInTheBasket();
            cheeseChosen.productPutItInTheBasket();
            mobAppHuman.mobAppBuyProducts();
            pyaterochka.storePurchase(pyaterochka.getStoreDescription());
            int purchaseNumber = pyaterochka.getStoreCustomerNumber() + 1;
            pyaterochka.setStoreCustomerNumber(purchaseNumber);
            pyaterochka.storePaymentAddToRevenue(priceTagKefir.getTagsPrice() + priceTagCheese.getTagsPrice());
            System.out.println("Введите сколько процентов от покупки можно оплатить баллами, например, 5% вводите как 0,05 через запятую");
            double l = scanner.nextDouble();
            double bonusPayment = (priceTagKefir.getTagsPrice() + priceTagCheese.getTagsPrice())*l;
            bonus.bonusPayByPoints(l, bonusPayment);
            double v = pyaterochka.getStoreBonusSum() + bonusPayment;
            pyaterochka.setStoreBonusSum(v);
            double RevenueWoBonuses;
            if (bonusPayment < bonusNumberOfPoints){
                RevenueWoBonuses = pyaterochka.getStoreRevenue()-bonusPayment;
                pyaterochka.setStoreRevenue(RevenueWoBonuses);
            } else {
                RevenueWoBonuses = pyaterochka.getStoreRevenue();
            }
            System.out.println("Введите сколько процентов от покупки можно засчитать покупателю баллами, например, 2% вводите как 0,02 через запятую");

            double h = scanner.nextDouble();
            double xx = (priceTagKefir.getTagsPrice() + priceTagCheese.getTagsPrice())*h;
            bonusNumberOfPoints = bonusNumberOfPoints + xx;
            bonus.bonusAddPoints(h, xx);
            mobAppHuman.mobAppGiveCheque(pyaterochka.getStoreDescription(), i, priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice(), bonusPayment, xx, tagsProductNameKefir, tagsProductNameCheese);
            System.out.println(" ");


        }
        mobAppHuman.mobAppOpenDoorGetOut();
        mobAppHuman.mobAppClose();
        System.out.println(" ");

        // здесь закрытие двери и далее
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Количество покупок за неделю " + pyaterochka.getStoreCustomerNumber() + " штук");
        System.out.println("Выручка магазина за неделю от данного покупателя составила " + df.format(pyaterochka.getStoreRevenue()) + " рублей");
        double CustNumber = pyaterochka.getStoreCustomerNumber();
        double averRevenuePerCustomer = (pyaterochka.getStoreRevenue()) / (CustNumber);
        System.out.println("Средний чек за неделю на данного покупателя составил " + df.format(averRevenuePerCustomer) + " рублей. За неделю было " + numberOfDays + " покупок в магазине данным покупателем");
        double maxKefirPrice = 0;
        for (int i3 =1; i3 <= numberOfDays; i3++){
            if (tagsPriceKefir[i3-1] > maxKefirPrice){
                maxKefirPrice = tagsPriceKefir[i3-1];
            }
        }
        System.out.println("Самый дорогой кефир за неделю стоил " + df.format(maxKefirPrice) + " рублей");
        double maxCheesePrice = 0;
        for (int i3 =1; i3 <= numberOfDays; i3++){
            if (tagsPriceCheese[i3-1] > maxCheesePrice){
                maxCheesePrice = tagsPriceCheese[i3-1];
            }
        }
        System.out.println("Самый дорогой сыр за неделю стоил " + df.format(maxCheesePrice) + " рублей");
        System.out.println(df.format(pyaterochka.getStoreBonusSum()) + " - столько бонусных баллов ушло на оплату всех покупок, что является упущенной выручкой магазина");
        System.out.println(df.format(bonus.getBonusNumberOfPoints()) + " - столько бонусных баллов осталось в мобильном приложении покупателя");

        System.out.println(" ");
        System.out.println("Этот код на GitHub по ссылке https://github.com/PashkovAlexey/digitalRetailStore.git");

        /* что еще можно улучшить в коде
        1. добавить больше передаваемых параметров в вызываемые методы
        2. Всю статистику в конце кода CJM вынести в вызываемый метод
        3. Бонусные баллы поместить в массив, поискать максимальный и минимальный бал как по оплате, так и по начислениям
        4. Через цикл распечатать на экран все покупки, все оплаты баллами и все начисления баллов по покупателю
         */

    }

}
