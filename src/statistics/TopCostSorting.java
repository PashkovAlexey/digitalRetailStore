package statistics;

import product.Product;

import java.util.Comparator;
import java.util.List;

public interface TopCostSorting {

    default void createTopCostIncreasingSorting(List<Product> allBoughtProducts){
        List<Product> sortedProducts = new java.util.ArrayList<>(List.copyOf(allBoughtProducts));
        sortedProducts.sort(Comparator.comparing(Product::getProductPrice));
        System.out.println("Несортированные покупки");
        System.out.println(allBoughtProducts);
        System.out.println("Сортированные покупки по возрастанию цены");
        System.out.println(sortedProducts);
    }
    default void createTopCostDecreasingSorting(List<Product> allBoughtProducts){
        List<Product> sortedProductsRev = new java.util.ArrayList<>(List.copyOf(allBoughtProducts));
        sortedProductsRev.sort(Comparator.comparing(Product::getProductPrice).reversed());
        System.out.println("Сортированные покупки по убыванию цены");
        System.out.println(sortedProductsRev);
    }
}
