package B.combinations;

import B.CocaCola.CocaColaBig;
import B.CocaCola.CocaColaMiddle;
import B.CocaCola.CocaColaSmall;
import B.Pitza.PitzaBig;
import B.Pitza.PitzaMiddle;
import B.Pitza.PitzaSmall;
import B.model.Big;
import B.model.Middle;
import B.model.Size;
import B.model.Small;

import java.util.ArrayList;
import java.util.List;

public class CombiFive extends Combi implements Builder {

    private List<Size> cocaCola = null;
    private List<Size> pitza = null;

     private double combiDiscount = 0;

    public CombiFive(List<Size> cocaCola, List<Size> pitza, double combiDiscount) {
        super(cocaCola, pitza, combiDiscount);
    }

    @Override
    public void reset() {
        cocaCola = null;
        pitza = null;
        combiDiscount = 0.00;
    }

    @Override
    public void buildCola() {
        cocaCola = new ArrayList<>();
        Small smallCola = new CocaColaSmall(0, "", "");
        smallCola.setSmallPrice();
        smallCola.setSmallDecription();
        smallCola.setSmallProdTypeName();
        cocaCola.add(smallCola);
        cocaCola.add(smallCola);
        Middle middleCola = new CocaColaMiddle(0,"", "");
        middleCola.setMiddlePrice();
        middleCola.setMiddleDecription();
        middleCola.setMiddleProdTypeName();
        cocaCola.add(middleCola);
        cocaCola.add(middleCola);
        Big bigCola = new CocaColaBig(0, "", "");
        bigCola.setBigPrice();
        bigCola.setBigDecription();
        bigCola.setBigProdTypeName();
        cocaCola.add(bigCola);
    }

    @Override
    public void buildPitza() {
        pitza = new ArrayList<>();
        Small smallPitza = new PitzaSmall(0,"","");
        smallPitza.setSmallPrice();
        smallPitza.setSmallDecription();
        smallPitza.setSmallProdTypeName();
        pitza.add(smallPitza);
        pitza.add(smallPitza);
        Middle middlePitza = new PitzaMiddle(0,"","");
        middlePitza.setMiddlePrice();
        middlePitza.setMiddleDecription();
        middlePitza.setMiddleProdTypeName();
        pitza.add(middlePitza);
        pitza.add(middlePitza);
        Big bigPitza = new PitzaBig(0,"","");
        bigPitza.setBigPrice();
        bigPitza.setBigDecription();
        bigPitza.setBigProdTypeName();
        pitza.add(bigPitza);
    }

    @Override
    public void buildDiscount() {
        combiDiscount = 0.30;
    }

    @Override
    public Combi getResult() {
        Combi combiNumberFive = new Combi(cocaCola, pitza, combiDiscount);
        return combiNumberFive;
    }

    @Override
    public String toString() {
        return "CombiFive{" +
                "cocaCola=" + cocaCola +
                ", pitza=" + pitza +
                ", combiDiscount=" + combiDiscount +
                '}';
    }

    @Override
    public List<Size> getCocaCola() {
        return cocaCola;
    }

    @Override
    public List<Size> getPitza() {
        return pitza;
    }

    @Override
    public double getCombiDiscount() {
        return combiDiscount;
    }
}
