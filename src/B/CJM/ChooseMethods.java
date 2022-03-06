package B.CJM;

import B.Factory.CocaColaFactory; import B.Factory.PitzaFactory; import B.Factory.ProductFactory;
import B.model.Big; import B.model.Middle; import B.model.Size; import B.model.Small;
import java.util.List; import java.util.Scanner;

public interface ChooseMethods {

    static boolean chooseWhatToDo(Scanner sc) {
        System.out.println("Выберите что делать");
        System.out.println("любая цифра - еще выбрать покупки");
        System.out.println("0 - закончить покупки");
        int exitChoice = sc.nextInt();
        if (exitChoice == 0) {
            return true;
        }
        return false;
    }

    static void chooseSizeOfProduct(List<Size> prodList, Scanner sc, ProductFactory prodFactory) {
        System.out.println("Выберите размер товара,напечатайте целое число цифрой");
        System.out.println("1 - маленький");
        System.out.println("2 - средний");
        System.out.println("3 - большой");
        int prodSize = sc.nextInt();
        if (prodSize == 1) {
            Small sizeProd = prodFactory.createSmall();
            prodList.add(sizeProd);
        } else if (prodSize == 2) {
            Middle sizeProd = prodFactory.createMiddle();
            prodList.add(sizeProd);
        } else if (prodSize == 3) {
            Big sizeProd = prodFactory.createBig();
            prodList.add(sizeProd);
        }
    }

    static ProductFactory chooseTypeOfProduct(Scanner sc) {
        System.out.println("Выберите какой товар вы хотите, напечатайте целое число цифрой");
        System.out.println("1 - пицца");
        System.out.println("2 - бутылка колы");
        ProductFactory prodFactory = null;
        int prodChoiceType = sc.nextInt();
        if (prodChoiceType == 1) {
            prodFactory = new PitzaFactory();
        } else if (prodChoiceType == 2) {
            prodFactory = new CocaColaFactory();
        }
        return prodFactory;
    }
}
