package B.multiThreadMath;

import B.combinations.Combi;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiThreadProcess {

    public static void MultiThreadMainMethod(List<Combi> prodCombiList) throws InterruptedException {
        System.out.println("Первый расчет суммы покупки через два потока с наследованием от класса Thread");
        multiThreadClassExtentionMethod(prodCombiList);

    }

    private static void multiThreadClassExtentionMethod(List<Combi> prodCombiList) throws InterruptedException {
        System.out.println("Разобьем коллекцию продуктовых наборов на две отдельные коллекции, потом двумя потоками посчитаем");
        double[] threadSums = fourThreadsCreation(prodCombiList);
        sumCalculation(threadSums);
    }

    private static void sumCalculation(double[] threadSums) {
        double sumAllProducts = 0;
        for (int i = 0; i < threadSums.length; i++) {
            sumAllProducts = sumAllProducts + threadSums[i];
        }
        System.out.println("Сумма всех покупок составляет " + sumAllProducts + " рублей");
    }

    private static double[] fourThreadsCreation(List<Combi> prodCombiList) throws InterruptedException {
        double[] threadSums = new double[2];
        List<Combi> prodCombiListNumberOne = new ArrayList<>();
        for (int i = 0; i < prodCombiList.size(); i = i + 2) {
            prodCombiListNumberOne.add(prodCombiList.get(i));
        }
        List<Combi> prodCombiListNumberTwo = new ArrayList<>();
        for (int i = 1; i < prodCombiList.size(); i = i + 2) {
            prodCombiListNumberTwo.add(prodCombiList.get(i));
        }
        ThreadMathSum threadNumberOne = new ThreadMathSum("Поток номер 0", prodCombiListNumberOne);
        ThreadMathSum threadNumberTwo = new ThreadMathSum("Поток номер 1", prodCombiListNumberTwo);
        startAndJoinForThreads(threadNumberOne, threadNumberTwo);
        massiveCreation(threadSums, threadNumberOne, threadNumberTwo);
        return threadSums;
    }

    private static void massiveCreation(double[] threadSums, ThreadMathSum threadNumberOne, ThreadMathSum threadNumberTwo) {
        threadSums[0] = threadNumberOne.getSumOfPurchasesInThread();
        threadSums[1] = threadNumberTwo.getSumOfPurchasesInThread();
        System.out.println(threadSums[0] + " рублей, сумма в первом потоке");
        System.out.println(threadSums[1] + " рублей, сумма во втором потоке");
    }

    private static void startAndJoinForThreads(ThreadMathSum threadNumberOne, ThreadMathSum threadNumberTwo) throws InterruptedException {
        threadNumberOne.start();
        threadNumberTwo.start();
        threadNumberOne.join();
        threadNumberTwo.join();
    }
}
