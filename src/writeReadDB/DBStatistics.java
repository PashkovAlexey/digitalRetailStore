package writeReadDB;
import product.Product;
import statistics.FindAverageValues;
import statistics.FindMaxMinObjectInCollection;
import statistics.FindSums;

import java.util.List;

public class DBStatistics implements FindAverageValues, FindMaxMinObjectInCollection, FindSums {

    public DBStatistics () {

    }

    public void allStatistics(List<Product> prodHystoryRead) {
        System.out.println(" ");
        System.out.println("Распечатаем статистику по всей истории покупок");
        System.out.println(prodHystoryRead.size() + " - количество объектов в коллекции, количество накопившихся товаров в истории покупок");
        printAverageCostPerProduct(prodHystoryRead);
        printAverageCostOfKefir(prodHystoryRead);
        printAverageCostOfCheese(prodHystoryRead);
        printMaxObjectInCollectionm(prodHystoryRead);
        printMinObjectInCollectionm(prodHystoryRead);
        printSumOfAllProducts(prodHystoryRead);
        printSumOfKefir(prodHystoryRead);
        printSumOfCheese(prodHystoryRead);
    }

}
