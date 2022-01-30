package statistics;

import product.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public interface FindSums extends FindInterface {

    DecimalFormat df = new DecimalFormat("#.00");

    default void printSumOfAllProducts(List<Product> allBoughtProducts){
        double sumOfAll = 0;
        for (Product productChosen : allBoughtProducts){
            sumOfAll = sumOfAll + productChosen.getProductPrice();
        }
        System.out.println(df.format(sumOfAll) + " рублей - сумма всех покупок всех товаров, " + allBoughtProducts.size() + " штук/штуки.");
    }

    default void printSumOfKefir (List<Product> allBoughtProducts){
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
        System.out.println(df.format(sumKefir) + " - сумма покупки всех товаров типа кефир, " + kefirBought.size() + " штук/штуки.");
    }
    default void printSumOfCheese (List<Product> allBoughtProducts){
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
        System.out.println(df.format(sumCheese) + " - сумма покупки всех товаров типа сыр, " + cheeseBought.size() + " штук/штуки.");
    }



}
