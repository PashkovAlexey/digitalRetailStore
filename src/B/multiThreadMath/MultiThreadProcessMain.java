package B.multiThreadMath;

import B.combinations.Combi;

import java.util.List;

public abstract class MultiThreadProcessMain {

    public static void MultiThreadMainMethod(List<Combi> prodCombiList) throws InterruptedException {
        System.out.println("Первый расчет суммы покупки через два потока с наследованием от класса Thread");
        MultiThreadClassExtentionMethod.multiThreadClassExtentionMethod(prodCombiList);
        MultiThreadRunnableInterfaceMethod.multiThreadRunnableInterfaceMethod(prodCombiList);
        MultiThreadBlockedCommonResource.multiThreadBlockedCommonResource(prodCombiList);
    }
}
