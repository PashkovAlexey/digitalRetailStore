package B.CJM;

import B.Factory.ProductFactory;
import B.model.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ProductFactoryApp implements ChooseMethods, MathMethods {
    public static void ProductFactoryAppMainMethod() {
        List<Size> prodList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            ProductFactory prodFactory = ChooseMethods.chooseTypeOfProduct(sc);
            ChooseMethods.chooseSizeOfProduct(prodList, sc, prodFactory);
            if (ChooseMethods.chooseWhatToDo(sc)) break;
        }
        printAllPurchases(prodList);
        MathMethods.findSum(prodList);
        MathMethods.findAveragePerProduct(prodList);
        MathMethods.findSumPerProduct(prodList);
    }

    private static void printAllPurchases(List<Size> prodList) {
        System.out.println("Печать покупок");
        for (Size chosenProd : prodList) {
            System.out.println(chosenProd.toString());
        }
    }


}
