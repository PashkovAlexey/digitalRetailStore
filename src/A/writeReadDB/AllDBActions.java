package A.writeReadDB;

import A.another.DigitalCheque;
import A.product.Product;

import java.io.*;

import java.text.DecimalFormat;
import java.util.List;

public abstract class AllDBActions {

    public static String CATALOG_NAME = "files/";
    public static String CATALOG_NAME_CHEQUE = "files/cheques/";
    private static String FILE_NAME = "chequesHystoryDB.txt";

    public static void allDBactions(List<Product> allBoughtProducts,  List<DigitalCheque> chequeList) throws Exception {
        System.out.println(" ");
        System.out.println("Новый класс для записи и чтения из баз данных");
        ProductsHystoryDB.ProductsHystoryDBAllActions(allBoughtProducts);
        writeCheques(chequeList);
        readCheques(chequeList);
    }

    private static void readCheques(List<DigitalCheque> chequeList) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(" ");
        System.out.println("Прочтем чеки из каталога чеков по пути " + CATALOG_NAME_CHEQUE);
        for (int i = 0; i < chequeList.size(); i++) {
            int g = i+1;
            try (DataInputStream dis = new DataInputStream(new FileInputStream(CATALOG_NAME_CHEQUE + i + FILE_NAME))) {
                DigitalCheque takenCheque = new DigitalCheque(dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readDouble(), dis.readDouble(), dis.readDouble());
                System.out.println(df.format(takenCheque.getChequeInfoPurchaseSumm()) + " рублей, сумма " + g + "-го чека в " + g + "-й день покупок из файла " + CATALOG_NAME_CHEQUE + i + FILE_NAME);

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Поймали ошибку");
            }
        }

    }

    private static void writeCheques(List<DigitalCheque> chequeList) {
        for (int i = 0; i < chequeList.size(); i++) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(CATALOG_NAME_CHEQUE + i + FILE_NAME))) {
                dos.writeUTF(chequeList.get(i).getChequeStoreName());
                dos.writeUTF(chequeList.get(i).getChequeInternetAddress());
                dos.writeUTF(chequeList.get(i).getChequeTelephoneNumber());
                dos.writeUTF(chequeList.get(i).getChequeDateAndTime());
                dos.writeUTF(chequeList.get(i).getChequeInfoStoreAddress());
                dos.writeDouble(chequeList.get(i).getChequeInfoPurchaseSumm());
                dos.writeDouble(chequeList.get(i).getChequeInfoBonusPaid());
                dos.writeDouble(chequeList.get(i).getChequeInfoBonusAdded());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
