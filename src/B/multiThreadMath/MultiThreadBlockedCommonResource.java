package B.multiThreadMath;

import B.combinations.Combi;
import B.model.Size;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadBlockedCommonResource {

    public static void multiThreadBlockedCommonResource(List<Combi> prodCombiList) throws InterruptedException {
        System.out.println(" ");
        System.out.println("Третий расчет через два потока с блокировкой Common resource");
        List<Size> cocaCola = new ArrayList<>();
        List<Size> pitza = new ArrayList<>();
        twoListsCreation(prodCombiList, cocaCola, pitza);
        CommonResource commonResource = new CommonResource(cocaCola, pitza);
        Thread threadNumberOne = new Thread(new CountThread(commonResource, commonResource.getCocaCola()));
        Thread threadNumberTwo = new Thread(new CountThread(commonResource, commonResource.getPitza()));
        threadProcess(threadNumberOne, threadNumberTwo);
    }

    private static void twoListsCreation(List<Combi> prodCombiList, List<Size> cocaCola, List<Size> pitza) {
        for (Combi combiInside : prodCombiList) {
            cocaCola.addAll(combiInside.getCocaCola());
            pitza.addAll(combiInside.getPitza());
        }
    }

    private static void threadProcess(Thread threadNumberOne, Thread threadNumberTwo) throws InterruptedException {
        threadNumberOne.setName("Кока-кола");
        threadNumberTwo.setName("Пицца");
        threadNumberOne.start();
        threadNumberTwo.start();
        threadNumberOne.join();
        threadNumberTwo.join();
    }


}
