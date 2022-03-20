package B.multiThreadMath;

import B.combinations.Combi;
import B.model.Size;

import java.util.List;

public class AverageCalcCombi implements Runnable {

    private List<Combi> prodCombiListForThread;
    private double completeSum;
    private double averageCombiCost;


    public AverageCalcCombi(List<Combi> prodCombiListForThread){
        this.prodCombiListForThread = prodCombiListForThread;
    }

    @Override
    public void run() {
        completeSum = 0;
        for (int i = 0; i < prodCombiListForThread.size(); i++) {
            Combi combiInside = prodCombiListForThread.get(i);
            List<Size> cocaListInside = combiInside.getCocaCola();
            summCreationPerTypeOfProduct(combiInside, cocaListInside);
        }
        try {
            System.out.println("Ждем 7 секунд, поток AverageCalcCombi работает, имплементация интерфейса Runnable");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("Поймали ошибку InterruptedException");
        }
        averageCombiCost = completeSum / prodCombiListForThread.size();

    }

    private void summCreationPerTypeOfProduct(Combi combiInside, List<Size> cocaListInside) {
        for (Size chosenCola : cocaListInside) {
            completeSum = completeSum + chosenCola.getPrice();
        }
        List<Size> chosenPitzaList = combiInside.getPitza();
        for (Size chosenPitza : chosenPitzaList) {
            completeSum = completeSum + chosenPitza.getPrice();
        }

    }


    public double getAverageCombiCost() {
        return averageCombiCost;
    }

}
