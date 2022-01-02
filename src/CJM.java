
import another.Customer;
import another.RetailStore;
import it.BonusSystem;
import it.MobileApp;
import product.Cheese;
import product.Kefir;
import retailStoreEquipment.DigitalPriceTag;

import java.util.Scanner;

public class CJM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Customer human = new Customer("", "", false, false, false);
        MobileApp mobAppHuman = new MobileApp("Мобильное приложение магазина", "Канал обслуживания и продаж", "", "", "", "");
        human.customerNameAge();
        if (human.customerDecision()) { return; }
        mobAppHuman.mobAppDeviceInfo(human.getCustomerName());
        mobAppHuman.mobAppDownload(mobAppHuman.getMobAppTypeOfOS());
        mobAppHuman.mobAppInstall(human.getCustomerName(), mobAppHuman.getMobAppDeviceInfo());
        human.setCustomerID(mobAppHuman.getModAppCustomerId());
        mobAppHuman.mobAppOpen(human.getCustomerName(), human.getCustomerID());
        human.customerVerivication();
        human.customerApproveActivation();
        human.customerUnblocking(mobAppHuman.getModAppCustomerId(), human.getCustomerAge());
        BonusSystem bonus = new BonusSystem("Система бонусных баллов", "повышение лояльности, рост NPS", "30.12.2021", 0, mobAppHuman.getModAppCustomerId());
        bonus.bonusActivate(human.getCustomerName());
        mobAppHuman.itSystemUpgrade();
        if (human.customerDecisionGetInto()) { return; }
        RetailStore pyaterochka = new RetailStore("Пятерочка", 0, 0, 0);
        human.customerNumberOfDays(pyaterochka.getStoreDescription());

        double [] tagsPriceKefir = new double [human.getNumberOfDays()];
        double [] tagsPriceCheese = new double [human.getNumberOfDays()];
        for (int dayNumber = 1; dayNumber <= human.getNumberOfDays(); dayNumber++){
            mobAppHuman.mobAppScanQrOpenDoor(dayNumber);

            human.customerShelfScan(human.getCustomerName());
            human.customerKefirName();
            human.customerKefirManufacture();
            tagsPriceKefir [dayNumber-1] = human.customerKefirPrice();
            DigitalPriceTag priceTagKefir = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceKefir[dayNumber-1], human.getTagsProductNameKefir(), human.getTagsManufacturerNameKefir(), "Ценник среднего размера");
            human.customerReadKefir(dayNumber, priceTagKefir.getTagsPrice());
            priceTagKefir.tagsReadThePrice(human.getCustomerName(), priceTagKefir.getTagsProductName());
            Kefir kefirChosen = new Kefir (priceTagKefir.getTagsProductName(), priceTagKefir.getTagsPrice(), "10.12.2021", "1984654854", 2.5, 440, "Бутылка пластиковая", "27.12.2021", 23.2, 10.1,  125.12,  1.5, "кефир");
            kefirChosen.productTakeItFromTheShelf(human.getCustomerName());
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagKefir.getTagsProductName());
            kefirChosen.productScanBarCode(priceTagKefir.getTagsProductName());

            human.customerShelfScan(human.getCustomerName());
            human.customerCheeseName();
            human.customerCheeseManufacture();
            tagsPriceCheese[dayNumber-1] = human.customerCheesePrice();
            DigitalPriceTag priceTagCheese = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceCheese[dayNumber-1], human.getTagsProductNameCheese(), human.getTagsManufacturerNameCheese(), "Ценник среднего размера");
            human.customerReadCheese(dayNumber, priceTagCheese.getTagsPrice());
            priceTagCheese.tagsReadThePrice(human.getCustomerName(), priceTagCheese.getTagsProductName());
            Cheese cheeseChosen = new Cheese(priceTagCheese.getTagsProductName(), priceTagCheese.getTagsPrice(), "13.12.2021", "17495875678", 23.8, 230, "Мягкая упаковка", "25.12.2021", 23.2, 102.12, 345.43, 300.10);
            cheeseChosen.productTakeItFromTheShelf(human.getCustomerName());
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagCheese.getTagsProductName());
            cheeseChosen.productScanBarCode(priceTagCheese.getTagsProductName());

            mobAppHuman.mobAppApproveChosenProducts(priceTagKefir.getTagsProductName(), priceTagCheese.getTagsProductName());
            kefirChosen.productPutItInTheBasket();
            cheeseChosen.productPutItInTheBasket();
            mobAppHuman.mobAppBuyProducts();
            pyaterochka.storePurchase(pyaterochka.getStoreDescription());
            pyaterochka.setStoreCustomerNumber();
            pyaterochka.storePaymentAddToRevenue(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice());
            bonus.bonusPercentageToPay(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice());
            bonus.bonusPayByPoints();
            pyaterochka.storeAddBonusSum(bonus.getBonusPayment());
            bonus.bonusPercentageOfPurchase(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice());
            bonus.bonusAddPoints();
            pyaterochka.storeRevenueCalculate(bonus.getBonusPayment(), bonus.getBonusNumberOfPoints());
            mobAppHuman.mobAppGiveCheque(pyaterochka.getStoreDescription(), dayNumber, priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice(), bonus.getBonusPayment(), bonus.getBonusAddNumber(), kefirChosen.getProductName(), cheeseChosen.getProductName());

        }

        mobAppHuman.mobAppOpenDoorGetOut();
        mobAppHuman.mobAppClose();
        pyaterochka.storeAverageCheque(human.getNumberOfDays());
        pyaterochka.storeFindMaxPriceOneProduct (tagsPriceKefir, "кефир");
        pyaterochka.storePrintAllOneTypeProduct(tagsPriceKefir, "кефир");
        pyaterochka.storeFindMaxPriceOneProduct (tagsPriceCheese, "сыр");
        pyaterochka.storePrintAllOneTypeProduct(tagsPriceCheese, "сыр");
        pyaterochka.findNumberOfSameProductsByPrice(tagsPriceKefir, tagsPriceCheese);
        human.customerBonusStatistics(pyaterochka.getStoreBonusSum(), bonus.getBonusNumberOfPoints());

        System.out.println("Этот код на GitHub по ссылке https://github.com/PashkovAlexey/digitalRetailStore.git");

        /* что еще можно улучшить в коде
        1. добавить больше передаваемых параметров в вызываемые методы
        3. Бонусные баллы поместить в массив, поискать максимальный и минимальный бал как по оплате, так и по начислениям
        4. Через цикл распечатать на экран все покупки, все оплаты баллами и все начисления баллов по покупателю
        5. Посмотреть как баллы считаются бонусные по ситуации когда их не хватает
        6. Поиск самого дорогого товара за неделю
        7. Еще применить System.arrayCopy для склейки массивов
        8. Попробовать switch с преобразованием в текст, коммент Сергея от 30.12. в телеграмме
         */

    }

}
