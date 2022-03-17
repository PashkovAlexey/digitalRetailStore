package B.multiThreadMath;

import B.combinations.Combi;
import B.model.Size;

import java.util.List;

public class ProductAmountCalc implements Runnable {


    private int productAmount;
    private final List<Combi> prodCombiListForThread;


    public ProductAmountCalc(List<Combi> prodCombiListForThread){
        this.prodCombiListForThread = prodCombiListForThread;
    }

    @Override
    public void run() {
        productAmount = 0;
        for (int i = 0; i < prodCombiListForThread.size(); i++) {
            Combi combiInside = prodCombiListForThread.get(i);
            List<Size> cocaListInside = combiInside.getCocaCola();
            prodAmountMethod(combiInside, cocaListInside);
        }
        try {
            System.out.println("Ждем 7 секунд, поток ProductAmountCalc работает, имплементация интерфейса Runnable");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("Поймали ошибку InterruptedException");
        }


    }

    private void prodAmountMethod(Combi combiInside, List<Size> cocaListInside) {
        productAmount = productAmount + cocaListInside.size();
        List<Size> chosenPitzaList = combiInside.getPitza();
        productAmount = productAmount + chosenPitzaList.size();
    }

    public int getProductAmount() {
        return productAmount;
    }
}
