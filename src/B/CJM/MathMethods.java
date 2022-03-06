package B.CJM;

import B.model.Size;

import java.text.DecimalFormat;
import java.util.List;

public interface MathMethods {

    DecimalFormat df = new DecimalFormat("#.00");

    static void findSum(List<Size> prodList) {
        DecimalFormat df = new DecimalFormat("#.00");
        int sum = 0;
        for (Size chosenProd : prodList) {
            sum = sum + chosenProd.getPrice();
        }
        System.out.println(df.format(sum) + " рублей, сумма покупок");
    }

    static void findAveragePerProduct (List<Size> prodList) {
        double averPrice = 0;
        int sum = 0;
        for (Size chosenProd : prodList) {
            sum = sum + chosenProd.getPrice();
        }
        averPrice = (double)sum / prodList.size();
        System.out.println(df.format(averPrice) + " рублей, средняя цена продукта");
    }

    static void findSumPerProduct (List<Size> prodList){
        findSumForTypeOfProduct(prodList, "кока-кола");
        findSumForTypeOfProduct(prodList, "пицца");
    }

    private static void findSumForTypeOfProduct(List<Size> prodList, String typeOfProduct) {
        int sum = 0;
        for (Size chosenProd : prodList){
            if (typeOfProduct.equals(chosenProd.getTypeProductName())){
                sum = sum + chosenProd.getPrice();
            }
        }
        System.out.println(df.format(sum) + " рублей, сумма покупок товара типа " + typeOfProduct);
    }



}
