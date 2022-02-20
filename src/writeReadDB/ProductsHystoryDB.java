package writeReadDB;

import product.Product;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public abstract class ProductsHystoryDB extends AllDBActions implements ReadDB {

    public static String FILE_NAME = "productsHystoryDB.txt";

    public static void ProductsHystoryDBAllActions(List<Product> allBoughtProducts) throws Exception {
        fileDBWrite(allBoughtProducts);
        chooseReadSkip();

    }

    private static void chooseReadSkip() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант действий ниже и введите целое число одной цифрой");
        System.out.println("1 - прочесть всю историю покупок, которая накопилась");
        System.out.println("Любое число - не читать всю историю покупок");
        int choice = scanner.nextInt();
        if (choice == 1){
            readProductHystory();
            DBStatistics dbStat = new DBStatistics();
            dbStat.allStatistics(prodHystoryRead);

        }
    }

    private static void readProductHystory() throws Exception {
        System.out.println("Начинается считывание всей накопившейся истории покупок в файле " + FILE_NAME);
        ReadDB.read(AllDBActions.CATALOG_NAME, FILE_NAME);
    }

    private static void fileDBWrite(List<Product> allBoughtProducts) throws Exception {
        File prodHystFile = new File(AllDBActions.CATALOG_NAME + FILE_NAME);
        try (FileWriter fWriter = new FileWriter(prodHystFile, true)){
            System.out.println("Запись в файл " + FILE_NAME + " в каталоге " + AllDBActions.CATALOG_NAME);
            System.out.println(AllDBActions.CATALOG_NAME + FILE_NAME + " - полный путь до файла");
            for (Product chosenProd : allBoughtProducts){
                fWriter.write(chosenProd.toString2() + "\n");
            }
            fWriter.flush();
            System.out.println("Запись всех купленных товаров завершена в файл " + FILE_NAME + ". Товары после этого запуска программы добавлены туда.");
        } catch (Exception e) {
             e.printStackTrace();
             System.out.println("Программа поймала ошибку");
        }
    }

}
