package A.statistics;

import A.product.Cheese;
import A.product.Kefir;
import A.product.Product;

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
        RevenueStatistics revStat = new RevenueStatistics();
        revStat.printRevStat(kefirMassive, cheeseMassive, numberOfDays);

    }




}
