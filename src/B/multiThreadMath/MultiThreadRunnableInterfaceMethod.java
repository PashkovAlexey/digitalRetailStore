package B.multiThreadMath;

import B.combinations.Combi;

import java.util.List;

public abstract class MultiThreadRunnableInterfaceMethod {


    public static void multiThreadRunnableInterfaceMethod(List<Combi> prodCombiList) throws InterruptedException {
        System.out.println(" ");
        System.out.println("Второй расчет через два потока с имплементацией интерфейса Runnable");
        AverageCalcCombi averCalcCombi = new AverageCalcCombi(prodCombiList);
        Thread threadAverCost = new Thread(averCalcCombi);
        threadAverCost.start();

        ProductAmountCalc prodAmountCalc = new ProductAmountCalc(prodCombiList);
        Thread threadProdAmount = new Thread(prodAmountCalc);
        threadProdAmount.start();

        threadAverCost.join();
        threadProdAmount.join();
        System.out.println("Количество комби наборов в заказе составляет " + prodCombiList.size() + " штук");
        System.out.println("Средняя стоимость набора комби составляет в заказе " + averCalcCombi.getAverageCombiCost() + " рублей");
        System.out.println("Количество товаров в заказе составляет " + prodAmountCalc.getProductAmount() + " штук");
    }
}
