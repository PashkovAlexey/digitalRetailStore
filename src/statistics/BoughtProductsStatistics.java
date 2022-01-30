package statistics;

import product.Product;

import java.util.List;

public class BoughtProductsStatistics extends BusinessStatistics implements FindMaxMinObjectInCollection, FindAverageValues, FindSums {
    public static String BPNAME;
    static {
        BPNAME = "Статистика купленных товаров";
    }

    public void printInfo(List<Product> allBoughtProducts){
        System.out.println(" ");
        System.out.println(BPNAME);
        for (Product chosenProduct : allBoughtProducts){
            System.out.println(chosenProduct);
        }
        printMaxObjectInCollectionm(allBoughtProducts);
        printMinObjectInCollectionm(allBoughtProducts);
        printAverageCostPerProduct(allBoughtProducts);
        printAverageCostOfKefir(allBoughtProducts);
        printAverageCostOfCheese(allBoughtProducts);
        printSumOfAllProducts(allBoughtProducts);
        printSumOfKefir(allBoughtProducts);
        printSumOfCheese(allBoughtProducts);
    }

}
