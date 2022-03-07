package B.combinations;

import B.CJM.ChooseMethods;
import B.model.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static B.combinations.CombiMathMethods.printSumWoDiscount;

public abstract class CombiBuilderApp implements CombiMathMethods{

    public static void combiBuilderAppMainMethod(){
        List<Combi> prodCombiList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        CombiDirector combiDirector = new CombiDirector();
        choiceProcess(prodCombiList, sc, combiDirector);
        printOfAllPurchases(prodCombiList);
        int sumWoDiscount = printSumWoDiscount(prodCombiList);
        CombiMathMethods.printSumWithDiscount(prodCombiList,sumWoDiscount);
    }

    private static void printOfAllPurchases(List<Combi> prodCombiList) {
        System.out.println("Печать покупок");
        for (int i = 0; i < prodCombiList.size(); i++){
            System.out.println("Печать выбранного набора номер " + i);
            Combi CombiInside = prodCombiList.get(i);
            List<Size> cocaListInside = CombiInside.getCocaCola();
            for (Size chosenCola : cocaListInside){
                System.out.println(chosenCola.toString());
            }
            List<Size> chosenPitzaList = CombiInside.getPitza();
            for (Size chosenPitza : chosenPitzaList){
                System.out.println(chosenPitza.toString());
            }
        }
    }

    private static void choiceProcess(List<Combi> prodCombiList, Scanner sc, CombiDirector combiDirector) {
        do {
            System.out.println("Выберите тип набора, напечатайте целое число одной цифрой");
            System.out.println("1 - набор три штуки пиццы и три штуки колы");
            System.out.println("2 - набор пять штук пиццы и пять штук колы");
            int combiTypeChosen = sc.nextInt();
            Combi combiChosen = combiDirector.makeCombi(combiTypeChosen);
            prodCombiList.add(combiChosen);
        } while (!ChooseMethods.chooseWhatToDo(sc));
    }
}
