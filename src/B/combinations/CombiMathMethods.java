package B.combinations;

import B.model.Size;

import java.text.DecimalFormat;
import java.util.List;

public interface CombiMathMethods {
    DecimalFormat df = new DecimalFormat("#.00");

    static int printSumWoDiscount(List<Combi> prodCombiList){
        int sumWoDiscount = 0;
        for (int i = 0; i < prodCombiList.size(); i++){
            Combi CombiInside = prodCombiList.get(i);
            List<Size> cocaListInside = CombiInside.getCocaCola();
            for (Size chosenCola : cocaListInside){
                sumWoDiscount = sumWoDiscount + chosenCola.getPrice();
            }
            List<Size> chosenPitzaList = CombiInside.getPitza();
            for (Size chosenPitza : chosenPitzaList){
                sumWoDiscount = sumWoDiscount + chosenPitza.getPrice();
            }
        }
        System.out.println(df.format(sumWoDiscount) + " рублей, сумма покупки без скидки");
        return sumWoDiscount;
    }

    static void printSumWithDiscount(List<Combi> prodCombiList, int sumWoDiscount){
        double [] sumWithDiscountMass = new double[prodCombiList.size()];
        double sumWithDiscount = 0;
        for (int i = 0; i < prodCombiList.size(); i++){
            Combi CombiInside = prodCombiList.get(i);
            List<Size> cocaListInside = CombiInside.getCocaCola();
            for (Size chosenCola : cocaListInside){
                sumWithDiscountMass[i] = sumWithDiscountMass[i] + chosenCola.getPrice();
            }
            List<Size> chosenPitzaList = CombiInside.getPitza();
            for (Size chosenPitza : chosenPitzaList){
                sumWithDiscountMass[i] = sumWithDiscountMass[i] + chosenPitza.getPrice();
            }
            sumWithDiscountMass[i] = sumWithDiscountMass[i] * (1 - CombiInside.getCombiDiscount());
        }
        for (int i = 0; i < prodCombiList.size(); i++){
            sumWithDiscount = sumWithDiscount + sumWithDiscountMass[i];
        }
        System.out.println(df.format(sumWithDiscount) + " рублей, сумма покупки со скидкой");
        System.out.println(df.format((double) sumWoDiscount - sumWithDiscount) + " рублей, величина скидки");
    }
}
