package statistics;

import product.Cheese;
import product.Kefir;
import product.Product;

import java.util.Collection;
import java.util.List;

public abstract class BusinessStatistics {
    public static String BSNAME;
    static {
        BSNAME = "Бизнес статистика продаж";
    }

    public static void allMethodsBussinessStatistics(Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays, List<Product> allBoughtProducts){
        ScanStatistics scanStat = new ScanStatistics();
        scanStat.addToScanCollection(kefirMassive, cheeseMassive, numberOfDays);
        BoughtProductsStatistics boughtProductsStat = new BoughtProductsStatistics();
        boughtProductsStat.printInfo(allBoughtProducts);
    }




}
