package statistics;

import product.Kefir;
import product.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public interface FindAverageValues {

    DecimalFormat df = new DecimalFormat("#.00");

    default void printAverageCostPerProduct(List<Product> allBoughtProducts){
        double averCost = 0;
        for (int i = 0 ; i < allBoughtProducts.size(); i++){
            averCost = (averCost + allBoughtProducts.get(i).getProductPrice());
        }
        System.out.println(df.format(averCost/allBoughtProducts.size()) + " - средняя стоимость товара из всех покупок. Куплено было " + allBoughtProducts.size() + " штук товаров");
    }

    default void printAverageCostOfKefir (List<Product> allBoughtProducts){
        List<Product> kefirBought = new ArrayList<>();
        for (Product kefirFound : allBoughtProducts){
            if (kefirFound.getProductTypeName() == "кефир"){
                kefirBought.add(kefirFound);
            }
        }
        double sumKefir = 0;
        for (int i = 0; i < kefirBought.size(); i++) {
            sumKefir = sumKefir + kefirBought.get(i).getProductPrice();
        }
        System.out.println(df.format(sumKefir/kefirBought.size()) + " - средняя стоимость кефира из купленных товаров типа кефир, " + kefirBought.size() + " штук/штуки.");
    }
    default void printAverageCostOfCheese (List<Product> allBoughtProducts){
        List<Product> cheeseBought = new ArrayList<>();
        for (Product cheeseFound : allBoughtProducts){
            if (cheeseFound.getProductTypeName() == "сыр"){
                cheeseBought.add(cheeseFound);
            }
        }
        double sumCheese = 0;
        for (int i = 0; i < cheeseBought.size(); i++) {
            sumCheese = sumCheese + cheeseBought.get(i).getProductPrice();
        }
        System.out.println(df.format(sumCheese/cheeseBought.size()) + " - средняя стоимость сыра из купленных товаров типа сыр, " + cheeseBought.size() + " штук/штуки.");
    }


}
