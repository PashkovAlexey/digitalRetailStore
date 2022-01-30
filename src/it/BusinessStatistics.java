package it;
import product.Cheese; import product.Kefir; import product.Product;
import java.text.DecimalFormat; import java.util.ArrayList; import java.util.Collection; import java.util.Random;

public class BusinessStatistics {
    public static String BSNAME;
    static {
        BSNAME = "Бизнес статистика продаж";
    }

    Collection<Product> allScansOfProducts = new ArrayList<>();
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("#.00");

    public BusinessStatistics() {

    }

    public void addToScanCollection(Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays){
        for (int i = 0; i < numberOfDays; i++){
            int scanNumber = random.nextInt(4);
            for (int j = 0; j < (scanNumber + 1); j++){
                allScansOfProducts.add(kefirMassive[i]);
                allScansOfProducts.add(cheeseMassive[i]);
            }
        }
        printAllScanCollection();
        commonStatisticsOfAllScans(kefirMassive, cheeseMassive);
    }

    private void printAllScanCollection(){
        System.out.println("Коллекция всех сканов всех купленных товаров");
       for (Product printedProduct : allScansOfProducts){
           System.out.println(printedProduct);
       }
    }

    private void commonStatisticsOfAllScans(Kefir[] kefirMassive, Cheese[] cheeseMassive) {
        System.out.println(allScansOfProducts.size() + " - суммарное количество сканов купленных товаров до того как они были куплены");
        double scanPerPurchaseAverage = (double)allScansOfProducts.size() / ((double)kefirMassive.length + (double)cheeseMassive.length);
        System.out.println(df.format(scanPerPurchaseAverage) + " - среднее количество сканов на одну покупку одного товара, конверсия контактов клиентов с товарами до покупки");
    }



}
