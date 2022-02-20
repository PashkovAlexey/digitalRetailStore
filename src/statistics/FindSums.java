package statistics;
import product.Product; import java.text.DecimalFormat; import java.util.ArrayList; import java.util.List;

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
        lookingForKefir(allBoughtProducts, kefirBought);
        double sumKefir = 0;
        for (int i = 0; i < kefirBought.size(); i++) {
            sumKefir = sumKefir + kefirBought.get(i).getProductPrice();
        }
        System.out.println(df.format(sumKefir) + " - сумма покупки всех товаров типа кефир, " + kefirBought.size() + " штук/штуки.");
    }

    private void lookingForKefir(List<Product> allBoughtProducts, List<Product> kefirBought) {
        for (Product kefirFound : allBoughtProducts){
            if (kefirFound.getProductTypeName().equals("кефир")){
                kefirBought.add(kefirFound);
            }
        }
    }

    default void printSumOfCheese (List<Product> allBoughtProducts){
        List<Product> cheeseBought = new ArrayList<>();
        lookingForCheese(allBoughtProducts, cheeseBought);
        double sumCheese = 0;
        for (int i = 0; i < cheeseBought.size(); i++) {
            sumCheese = sumCheese + cheeseBought.get(i).getProductPrice();
        }
        System.out.println(df.format(sumCheese) + " - сумма покупки всех товаров типа сыр, " + cheeseBought.size() + " штук/штуки.");
    }

    private void lookingForCheese(List<Product> allBoughtProducts, List<Product> cheeseBought) {
        for (Product cheeseFound : allBoughtProducts) {
            if (cheeseFound.getProductTypeName().equals("сыр")) {
                cheeseBought.add(cheeseFound);
            }
        }
    }
}
