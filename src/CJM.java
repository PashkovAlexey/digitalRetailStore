import product.Product;
import statistics.BusinessStatistics;
import another.Customer; import another.RetailStore; import it.BonusSystem;
import it.MobileApp; import product.Cheese; import product.Kefir; import retailStoreEquipment.DigitalPriceTag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CJM {
    public static void main(String[] args) {
        Customer.customerStart();
        Customer human = new Customer("", "", false, false, false);
        MobileApp mobAppHuman = new MobileApp("Мобильное приложение магазина", "Канал обслуживания и продаж", "", "", "", "");
        human.customerNameAge();
        if (human.customerDecision()) { return; }
        mobAppHuman.mobAppDeviceInfoDownloadInstall(human.getCustomerName());
        human.setCustomerID(mobAppHuman.getModAppCustomerId());
        mobAppHuman.mobAppOpen(human.getCustomerName(), human.getCustomerID());
        human.customerVerificationApproveActivationUnblocking(human.getCustomerID(), human.getCustomerAge());
        BonusSystem bonus = new BonusSystem("Система бонусных баллов", "повышение лояльности, рост NPS", "30.12.2021", 0, mobAppHuman.getModAppCustomerId());
        bonus.bonusActivate(human.getCustomerName(), mobAppHuman.getModAppCustomerId());
        mobAppHuman.itSystemUpgrade();
        if (human.customerDecisionGetInto(mobAppHuman.getModAppCustomerId())) { return;  }
        RetailStore pyaterochka = new RetailStore("Пятерочка", 0, 0, 0);
        human.customerNumberOfDays(pyaterochka.getStoreDescription());
        double[] tagsPriceKefir = new double[human.getNumberOfDays()]; double[] tagsPriceCheese = new double[human.getNumberOfDays()]; double[] bonusPayment = new double[human.getNumberOfDays()]; double[] bonusAdded = new double[human.getNumberOfDays()]; Kefir [] kefirMassive = new Kefir[human.getNumberOfDays()]; Cheese [] cheeseMassive = new Cheese[human.getNumberOfDays()];
        List<Product> allBoughtProducts = new ArrayList<>();
        for (int dayNumber = 1; dayNumber <= human.getNumberOfDays(); dayNumber++) {
            mobAppHuman.mobAppScanQrOpenDoor(dayNumber);

            human.customerShelfScanKefirNameKefirManufacture(human.getCustomerName(), mobAppHuman.getModAppCustomerId());
            tagsPriceKefir[dayNumber - 1] = human.customerKefirPrice(mobAppHuman.getModAppCustomerId());
            DigitalPriceTag priceTagKefir = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceKefir[dayNumber - 1], human.getTagsProductNameKefir(), human.getTagsManufacturerNameKefir(), "Ценник среднего размера");
            human.customerReadKefir(dayNumber, priceTagKefir.getTagsPrice());
            priceTagKefir.tagsReadThePrice(human.getCustomerName(), priceTagKefir.getTagsProductName(), human.getCustomerID());
            kefirMassive [dayNumber - 1] = new Kefir(priceTagKefir.getTagsProductName(), priceTagKefir.getTagsPrice(), "10.12.2021", "1984654854", 2.5, 440, "Бутылка пластиковая", "27.12.2021", 23.2, 10.1, 125.12, 1, Kefir.KEFIRPRODUCTTYPENAME);
            allBoughtProducts.add(kefirMassive [dayNumber - 1]);
            kefirMassive [dayNumber - 1].productTakeItFromTheShelf(human.getCustomerName(), human.getCustomerID());
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagKefir.getTagsProductName());
            kefirMassive [dayNumber - 1].productScanBarCode(priceTagKefir.getTagsProductName());

            human.customerShelfScanCheeseNameCheeseManufacture(human.getCustomerName(), mobAppHuman.getModAppCustomerId());
            tagsPriceCheese[dayNumber - 1] = human.customerCheesePrice();
            DigitalPriceTag priceTagCheese = new DigitalPriceTag("Электронный ценник в торговом зале", "Цифровой жидкокристаллический экран серого цвета", tagsPriceCheese[dayNumber - 1], human.getTagsProductNameCheese(), human.getTagsManufacturerNameCheese(), "Ценник среднего размера");
            human.customerReadCheese(dayNumber, priceTagCheese.getTagsPrice());
            priceTagCheese.tagsReadThePrice(human.getCustomerName(), priceTagCheese.getTagsProductName(), human.getCustomerID());
            cheeseMassive [dayNumber - 1] = new Cheese(priceTagCheese.getTagsProductName(), priceTagCheese.getTagsPrice(), "13.12.2021", "17495875678", 23.8, 230, "Мягкая упаковка", "25.12.2021", 23.2, 102.12, 345.43, 300.10, Cheese.CHEESEPRODUCTTYPENAME);
            allBoughtProducts.add(cheeseMassive [dayNumber - 1]);
            cheeseMassive [dayNumber - 1].productTakeItFromTheShelf(human.getCustomerName(), human.getCustomerID());
            mobAppHuman.mobAppScanProductBarCode(mobAppHuman.getModAppCustomerId(), priceTagCheese.getTagsProductName());
            cheeseMassive [dayNumber - 1].productScanBarCode(priceTagCheese.getTagsProductName());

            mobAppHuman.mobAppApproveChosenProducts(priceTagKefir.getTagsProductName(), priceTagCheese.getTagsProductName());
            kefirMassive [dayNumber - 1].productPutItInTheBasket(mobAppHuman.getModAppCustomerId());
            cheeseMassive [dayNumber - 1].productPutItInTheBasket(mobAppHuman.getModAppCustomerId());
            mobAppHuman.mobAppBuyProducts(mobAppHuman.getModAppCustomerId());
            pyaterochka.storePurchaseSetCustomerNumberAddToRevenue(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice());
            bonus.bonusPercentageToPayPayByPoints(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice(), mobAppHuman.getModAppCustomerId());
            pyaterochka.storeAddBonusSum(bonus.getBonusPayment());
            bonus.bonusPercentageOfPurchaseAddPoints(priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice(), human.getCustomerName(), human.getCustomerID());
            pyaterochka.storeRevenueCalculate(bonus.getBonusPayment(), bonus.getBonusNumberOfPoints());
            mobAppHuman.mobAppGiveCheque(pyaterochka.getStoreDescription(), dayNumber, priceTagKefir.getTagsPrice(), priceTagCheese.getTagsPrice(), bonus.getBonusPayment(), bonus.getBonusAddNumber(), kefirMassive [dayNumber - 1].getProductName(),  cheeseMassive [dayNumber - 1].getProductName());
            bonusPayment[dayNumber - 1] = bonus.getBonusPayment();
            bonusAdded[dayNumber - 1] = bonus.getBonusAddNumber();
        }
        mobAppHuman.mobAppOpenDoorGetOutAppClose(mobAppHuman.getModAppCustomerId(), pyaterochka.getStoreDescription(), human.getCustomerName());
        pyaterochka.storeSixFinalMethods(human.getNumberOfDays(), human.getCustomerName(), human.getCustomerID(), tagsPriceKefir, tagsPriceCheese);
        human.customerBonusStatistics(pyaterochka.getStoreBonusSum(), bonus.getBonusNumberOfPoints(), bonusPayment, bonusAdded);
        bonus.bonusMassive(pyaterochka.getStoreDescription(), human.getCustomerName(), human.getCustomerID(), bonusPayment, bonusAdded, human.getNumberOfDays());
        pyaterochka.storePurchaseStatistics(kefirMassive, cheeseMassive, human.getNumberOfDays());
        pyaterochka.storeObjectsMethods(kefirMassive, cheeseMassive, human.getNumberOfDays());
        BusinessStatistics.allMethodsBussinessStatistics(kefirMassive, cheeseMassive, human.getNumberOfDays(), allBoughtProducts);
        System.out.println("");
        System.out.println("Название этого магазина " + pyaterochka.toString());
        System.out.println("Этот код на GitHub по ссылке https://github.com/PashkovAlexey/digitalRetailStore.git ");
    }
}
