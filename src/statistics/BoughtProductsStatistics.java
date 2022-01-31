package statistics;

import product.Product;

import java.util.List;

public class BoughtProductsStatistics extends BusinessStatistics implements FindMaxMinObjectInCollection, FindAverageValues, FindSums, TopCostSorting {
    public static String BPNAME;
    static {
        BPNAME = "Статистика купленных товаров";
    }

    public void printInfo(List<Product> allBoughtProducts){
        System.out.println(" ");
        System.out.println(BPNAME);
        printEntryInfo();
        for (Product chosenProduct : allBoughtProducts){
            System.out.println(chosenProduct);
        }
        printMinMax(allBoughtProducts);
        printAverage(allBoughtProducts);
        printSum(allBoughtProducts);
        createTop(allBoughtProducts);
    }

    private void createTop(List<Product> allBoughtProducts) {
        createTopCostIncreasingSorting(allBoughtProducts);
        createTopCostDecreasingSorting(allBoughtProducts);
    }

    private void printSum(List<Product> allBoughtProducts) {
        printSumOfAllProducts(allBoughtProducts);
        printSumOfKefir(allBoughtProducts);
        printSumOfCheese(allBoughtProducts);
    }

    private void printAverage(List<Product> allBoughtProducts) {
        printAverageCostPerProduct(allBoughtProducts);
        printAverageCostOfKefir(allBoughtProducts);
        printAverageCostOfCheese(allBoughtProducts);
    }

    private void printMinMax(List<Product> allBoughtProducts) {
        printMaxObjectInCollectionm(allBoughtProducts);
        printMinObjectInCollectionm(allBoughtProducts);
    }

}
