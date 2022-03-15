package B.multiThreadMath;

import B.combinations.Combi;
import B.model.Size;

import java.util.List;

public class ThreadMathSum extends Thread {

    private final List<Combi> prodCombiListForThread;
    private double sumOfPurchasesInThread;

    public ThreadMathSum(String threadName, List<Combi> prodCombiListForThread) {
        super(threadName);
        this.prodCombiListForThread = prodCombiListForThread;
    }


    public void run() {
        sumOfPurchasesInThread = 0;
        for (int i = 0; i < prodCombiListForThread.size(); i++) {
            Combi CombiInside = prodCombiListForThread.get(i);
            List<Size> cocaListInside = CombiInside.getCocaCola();
            summCreationPerTypeOfProduct(CombiInside, cocaListInside);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           System.out.println("Поймали ошибку InterruptedException");
        }
    }

    private void summCreationPerTypeOfProduct(Combi CombiInside, List<Size> cocaListInside) {
        for (Size chosenCola : cocaListInside) {
            sumOfPurchasesInThread = sumOfPurchasesInThread + chosenCola.getPrice();
        }
        List<Size> chosenPitzaList = CombiInside.getPitza();
        for (Size chosenPitza : chosenPitzaList) {
            sumOfPurchasesInThread = sumOfPurchasesInThread + chosenPitza.getPrice();
        }
    }

    public double getSumOfPurchasesInThread() {
        return sumOfPurchasesInThread;
    }


}




