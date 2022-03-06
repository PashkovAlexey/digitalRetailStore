package A.statistics;
import A.product.Cheese; import A.product.Kefir; import A.product.Product; import java.text.DecimalFormat; import java.util.*;

public class RevenueStatistics extends BusinessStatistics {

    static String RSTNAME = "Статистика по динамике выручки";
    DecimalFormat df = new DecimalFormat("#.00");

    public RevenueStatistics() {     }

    public void printRevStat(Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays){
        System.out.println(" ");
        System.out.println(RSTNAME);
        Queue<Collection> purchasesPerDay = new LinkedList<>();
        collectionGenerator(kefirMassive, cheeseMassive, numberOfDays, purchasesPerDay);
        printGeneratedCollection(numberOfDays, purchasesPerDay);
    }

    private void printGeneratedCollection(Integer numberOfDays, Queue<Collection> purchasesPerDay) {
        double [] dayRevenue = new double[numberOfDays];
        calculateRevenueEveryDay(numberOfDays, purchasesPerDay, dayRevenue);
        double revAcumulated = 0;
        calculateAccumulatedRevenue(numberOfDays, dayRevenue, revAcumulated);
        System.out.println(purchasesPerDay + " - коллекция после печати и удаления всех элементов из нее");
    }

    private void calculateAccumulatedRevenue(Integer numberOfDays, double[] dayRevenue, double revAcumulated) {
        for (int z = 0; z < numberOfDays; z++){
            int c = z+1;
            revAcumulated = revAcumulated + dayRevenue[z];
            System.out.println(df.format(revAcumulated) + " рублей - выручка после " + c + " дня накопительно");
        }
    }

    private void calculateRevenueEveryDay(Integer numberOfDays, Queue<Collection> purchasesPerDay, double[] dayRevenue) {
        for (int l = 0; l < numberOfDays; l++){
            int n = l+1;
            Collection<Product> oneDayTakenFromQueue = purchasesPerDay.poll();
            dayRevenue[l] = 0;
            for (Product chosenProduct : oneDayTakenFromQueue){
                dayRevenue[l] =chosenProduct.getProductPrice() + dayRevenue[l];
            }
            System.out.println("коллекция за " + n + "й день " + oneDayTakenFromQueue);
            System.out.println("выручка за " + n + "й день " + df.format(dayRevenue[l]) + " рублей");
        }
    }

    private void collectionGenerator(Kefir[] kefirMassive, Cheese[] cheeseMassive, Integer numberOfDays, Queue<Collection> purchasesPerDay) {
        for (int i = 0; i < numberOfDays; i++){
            Collection<Product> purchaseOneDay = new ArrayList<>();
            purchaseOneDay.add(kefirMassive[i]);
            purchaseOneDay.add(cheeseMassive[i]);
            purchasesPerDay.add(purchaseOneDay);
        }
    }
}
