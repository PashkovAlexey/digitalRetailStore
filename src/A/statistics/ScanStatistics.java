package A.statistics;
import A.product.Cheese; import A.product.Kefir;

import java.text.DecimalFormat;
import java.util.*;

public class ScanStatistics extends BusinessStatistics{
    public static String SSNAME;
    static {
        SSNAME = "Статистика сканирования товаров";
    }

    Collection<String> allScansOfProducts = new ArrayList<>();
    HashSet<String> uniqueScansOfProduct = new HashSet();
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("#.00");


    public void addToScanCollection(Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays){
        for (int i = 0; i < numberOfDays; i++){
            int scanNumber = random.nextInt(5);
            for (int j = 0; j < (scanNumber + 1); j++){
                uniqueScansOfProduct.add(cheeseMassive[i].getProductName());
                uniqueScansOfProduct.add(kefirMassive[i].getProductName());
                allScansOfProducts.add(kefirMassive[i].getProductName());
                allScansOfProducts.add(cheeseMassive[i].getProductName());
            }
        }
        printAllScanCollection();
        printUniqueScanCollection();
        commonStatisticsOfAllScans();
    }

    private void printAllScanCollection(){
        System.out.println("Коллекция всех сканов всех купленных товаров");
       for (String printedProduct : allScansOfProducts){
           System.out.println(printedProduct);
       }
    }

    private void printUniqueScanCollection(){
        System.out.println("Коллекция уникальных сканов всех купленных товаров");
        for (String uniqueProduct : uniqueScansOfProduct){
            System.out.println(uniqueProduct);
        }
    }

    private void commonStatisticsOfAllScans() {
        System.out.println(" ");
        System.out.println(SSNAME);
        System.out.println(allScansOfProducts.size() + " - суммарное количество сканов купленных товаров до того как они были куплены");
        System.out.println(uniqueScansOfProduct.size() + " - количество уникальных сканов купленных товаров");
        double scanPerPurchaseAverage = (double)allScansOfProducts.size() / ((double)uniqueScansOfProduct.size());
        System.out.println(df.format(scanPerPurchaseAverage) + " - среднее количество сканов на одну покупку одного товара, конверсия контактов клиентов с товарами до покупки");
    }



}
