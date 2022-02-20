package writeReadDB;

import product.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public interface ReadDB {

    List<Product> prodHystoryRead = new ArrayList<>();

    static List read(String CATALOG_NAME, String FILE_NAME) throws Exception{
        try (BufferedReader bufReader = new BufferedReader(new FileReader(CATALOG_NAME + FILE_NAME))) {
            String currentLine = "";
            System.out.println(" ");
            System.out.println("Распечатаем всю историю покупок");
            while ((currentLine = bufReader.readLine()) != null){
                System.out.println(currentLine);
                if (currentLine != null && !currentLine.isBlank()){
                    prodHystoryRead.add(convertStringToProduct(currentLine));
                }
            }
            System.out.println(" ");
            System.out.println("Печать коллекции, которая получилась путем считывания из файла");
            System.out.println(prodHystoryRead);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Программа поймала ошибку");
        }
        return prodHystoryRead;
    }

    static Product convertStringToProduct(String currentLine) {
        String[] splittedMassive = currentLine.split(" ");
        Product readProduct = new Product();
        for (String chosenPart : splittedMassive){
            getProductNameAndSet(chosenPart, readProduct);
            getProductPriceAndSet(chosenPart, readProduct);
            getProductDateOfProductionAnsSet(chosenPart, readProduct);
            getProductBarCodeAndSet(chosenPart, readProduct);
            getProductTypeNameAndSet(chosenPart, readProduct);
        }
    return readProduct;
    }

    static void getProductTypeNameAndSet(String chosenPart, Product readProduct) {
        if (chosenPart != null && chosenPart.contains("productTypeName")){
            readProduct.setProductTypeName(chosenPart.split("=")[1]);
        }
    }

    static void getProductBarCodeAndSet(String chosenPart, Product readProduct) {
        if (chosenPart != null && chosenPart.contains("productBarCode")){
            readProduct.setProductBarCode(chosenPart.split("=")[1]);
        }
    }

    static void getProductDateOfProductionAnsSet(String chosenPart, Product readProduct) {
        if (chosenPart != null && chosenPart.contains("productDateOfProduction")){
            readProduct.setProductDateOfProduction(chosenPart.split("=")[1]);
        }
    }

    static void getProductPriceAndSet(String chosenPart, Product readProduct) {
        if (chosenPart != null && chosenPart.contains("productPrice")){
            readProduct.setProductPrice(Double.parseDouble(chosenPart.split("=")[1]));
        }
    }

    static void getProductNameAndSet(String chosenPart, Product readProduct) {
        if (chosenPart != null && chosenPart.contains("productName")){
            readProduct.setProductName(chosenPart.split("=")[1]);
        }
    }
}
