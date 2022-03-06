package A.statistics;

import A.product.Product;

import java.text.DecimalFormat;
import java.util.List;

public interface FindMaxMinObjectInCollection extends FindInterface {

    DecimalFormat df = new DecimalFormat("#.00");

    default void printMaxObjectInCollectionm(List<Product> allBoughtProducts){
        String prodName = "";
        double maxPrice = 0;
        for (int i = 0 ; i < allBoughtProducts.size(); i++){
            double prodPrice = allBoughtProducts.get(i).getProductPrice();
            if (prodPrice > maxPrice){
                maxPrice = prodPrice;
                prodName = allBoughtProducts.get(i).getProductName();
            }
        }
        System.out.println(df.format(maxPrice) + " - максимальная стоимость товара из всех покупок. Название товара " + prodName +".");
    }

    default void printMinObjectInCollectionm(List<Product> allBoughtProducts){
        String prodName = "";
        double minPrice = 1000000;
        for (int i = 0 ; i < allBoughtProducts.size(); i++){
            double prodPrice = allBoughtProducts.get(i).getProductPrice();
            if (prodPrice < minPrice){
                minPrice = prodPrice;
                prodName = allBoughtProducts.get(i).getProductName();
            }
        }
        System.out.println(df.format(minPrice) + " - минимальная стоимость товара из всех покупок. Название товара " + prodName +".");
    }


}
