
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
        if (human.customerDecision()) {
            return;
        }
        mobAppHuman.mobAppDeviceInfo(human.getCustomerName());
        mobAppHuman.mobAppDownload(human.getCustomerName(), mobAppHuman.getMobAppTypeOfOS());
        mobAppHuman.mobAppInstall(human.getCustomerName(), mobAppHuman.getMobAppDeviceInfo());
        human.setCustomerID(mobAppHuman.getModAppCustomerId());
        mobAppHuman.mobAppOpen(human.getCustomerName(), human.getCustomerID());
        human.customerVerivication(human.getCustomerID());
        human.customerApproveActivation();
        human.customerUnblocking(mobAppHuman.getModAppCustomerId(), human.getCustomerAge());
        BonusSystem bonus = new BonusSystem("Система бонусных баллов", "повышение лояльности, рост NPS", "30.12.2021", 0, mobAppHuman.getModAppCustomerId());
        bonus.bonusActivate(human.getCustomerName(), mobAppHuman.getModAppCustomerId());
        mobAppHuman.itSystemUpgrade();
        if (human.customerDecisionGetInto(mobAppHuman.getModAppCustomerId())) {
            return;
        }
        RetailStore pyaterochka = new RetailStore("Пятерочка", 0, 0, 0);
        human.customerNumberOfDays(pyaterochka.getStoreDescription());

        double[] tagsPriceKefir = new double[human.getNumberOfDays()];
        double[] tagsPriceCheese = new double[human.getNumberOfDays()];
        double[] bonusPayment = new double [human.getNumberOfDays()];
        double[] bonusAdded = new double [human.getNumberOfDays()];
        for (int dayNumber = 1; dayNumber <= human.getNumberOfDays(); dayNumber++) {
            mobAppHuman.mobAppScanQrOpenDoor(dayNumber);

            human.customerShelfScan(human.getCustomerName(), mobAppHuman.getModAppCustomerId());
            human.customerKefirName(mobAppHuman.getModAppCustomerId());
            human.customerKefirManufacture(mobAppHuman.getModAppCustomerId());
            tagsPriceKefir[dayNumber - 1] = human.customerKefirPrice(mobAppHuman.getModAppCustomerId());
            DigitalPriceTag priceTagKefir = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceKefir[dayNumber - 1], human.getTagsProductNameKefir(), human.getTagsManufacturerNameKefir(), "Ценник среднего размера");
            human.customerReadKefir(dayNumber, priceTagKefir.getTagsPrice());
            priceTagKefir.tagsReadThePrice(human.getCustomerName(), priceTagKefir.getTagsProductName(), human.getCustomerID());
            Kefir kefirChosen = new Kefir(priceTagKefir.getTagsProductName(), priceTagKefir.getTagsPrice(), "10.12.2021", "1984654854", 2.5, 440, "Бутылка пластиковая", "27.12.2021", 23.2, 10.1, 125.12, 1.5, "кефир");
            kefirChosen.productTakeItFromTheShelf(human.getCustomerName(), human.getCustomerID());
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagKefir.getTagsProductName());
            kefirChosen.productScanBarCode(priceTagKefir.getTagsProductName());

            human.customerShelfScan(human.getCustomerName(), mobAppHuman.getModAppCustomerId());
            human.customerCheeseName();
            human.customerCheeseManufacture();
            tagsPriceCheese[dayNumber - 1] = human.customerCheesePrice();
            DigitalPriceTag priceTagCheese = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceCheese[dayNumber - 1], human.getTagsProductNameCheese(), human.getTagsManufacturerNameCheese(), "Ценник среднего размера");
            human.customerReadCheese(dayNumber, priceTagCheese.getTagsPrice());
            priceTagCheese.tagsReadThePrice(human.getCustomerName(), priceTagCheese.getTagsProductName(), human.getCustomerID());
            Cheese cheeseChosen = new Cheese(priceTagCheese.getTagsProductName(), priceTagCheese.getTagsPrice(), "13.12.2021", "17495875678", 23.8, 230, "Мягкая упаковка", "25.12.2021", 23.2, 102.12, 345.43, 300.10);
            cheeseChosen.productTakeItFromTheShelf(human.getCustomerName(), human.getCustomerID());
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagCheese.getTagsProductName());
            cheeseChosen.productScanBarCode(priceTagCheese.getTagsProductName());

            mobAppHuman.mobAppApproveChosenProducts(priceTagKefir.getTagsProductName(), priceTagCheese.getTagsProductName());
            kefirChosen.productPutItInTheBasket(mobAppHuman.getModAppCustomerId());
            cheeseChosen.productPutItInTheBasket(mobAppHuman.getModAppCustomerId());
            mobAppHuman.mobAppBuyProducts(mobAppHuman.getModAppCustomerId());
            pyaterochka.storePurchase(pyaterochka.getStoreDescription());
            pyaterochka.setStoreCustomerNumber();
            pyaterochka.storePaymentAddToRevenue(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice(), pyaterochka.getStoreDescription());
            bonus.bonusPercentageToPay(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice());
            bonus.bonusPayByPoints(mobAppHuman.getModAppCustomerId());
            pyaterochka.storeAddBonusSum(bonus.getBonusPayment());
            bonus.bonusPercentageOfPurchase(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice());
            bonus.bonusAddPoints(human.getCustomerName(), human.getCustomerID());
            pyaterochka.storeRevenueCalculate(bonus.getBonusPayment(), bonus.getBonusNumberOfPoints());
            mobAppHuman.mobAppGiveCheque(pyaterochka.getStoreDescription(), dayNumber, priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice(), bonus.getBonusPayment(), bonus.getBonusAddNumber(), kefirChosen.getProductName(), cheeseChosen.getProductName());
            bonusPayment[dayNumber - 1] = bonus.getBonusPayment();
            bonusAdded[dayNumber - 1] = bonus.getBonusAddNumber();

        }

        mobAppHuman.mobAppOpenDoorGetOut(mobAppHuman.getModAppCustomerId(), pyaterochka.getStoreDescription());
        mobAppHuman.mobAppClose(human.getCustomerName(), human.getCustomerID(), pyaterochka.getStoreDescription());
        pyaterochka.storeAverageCheque(human.getNumberOfDays(), human.getCustomerName(), human.getCustomerID());
        pyaterochka.storeFindMaxPriceOneProduct(tagsPriceKefir, "кефир");
        pyaterochka.storePrintAllOneTypeProduct(tagsPriceKefir, "кефир");
        pyaterochka.storeFindMaxPriceOneProduct(tagsPriceCheese, "сыр");
        pyaterochka.storePrintAllOneTypeProduct(tagsPriceCheese, "сыр");
        pyaterochka.findNumberOfSameProductsByPrice(tagsPriceKefir, tagsPriceCheese);
        human.customerBonusStatistics(pyaterochka.getStoreBonusSum(), bonus.getBonusNumberOfPoints(), bonusPayment, bonusAdded);

        System.out.println("Этот код на GitHub по ссылке https://github.com/PashkovAlexey/digitalRetailStore.git");

        /* что еще можно улучшить в коде
        1. Склеить два цикла оплаты баллами и начисления баллов через System.arrayCopy и распечатать, потом найти макс и мин
        4. Посмотреть как баллы считаются бонусные по ситуации когда их не хватает
        8. Метод ввода цены попробовать один сделать
         */

    }

}
