package B.combinations;

import B.model.Big;
import B.model.Middle;
import B.model.Size;
import B.model.Small;

import java.util.ArrayList;
import java.util.List;

public class CombiFive extends Combi implements Builder, PitzaColaCreation {

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
        Small smallCola = PitzaColaCreation.smallColaCreation();
        cocaCola.add(smallCola);
        cocaCola.add(smallCola);
        Middle middleCola = PitzaColaCreation.middleColaCreation();
        cocaCola.add(middleCola);
        cocaCola.add(middleCola);
        Big bigCola = PitzaColaCreation.bigColaCreation();
        cocaCola.add(bigCola);
    }

    @Override
    public void buildPitza() {
        pitza = new ArrayList<>();
        Small smallPitza = PitzaColaCreation.smallPitzaCreation();
        pitza.add(smallPitza);
        pitza.add(smallPitza);
        Middle middlePitza = PitzaColaCreation.middlePitzaCreation();
        pitza.add(middlePitza);
        pitza.add(middlePitza);
        Big bigPitza = PitzaColaCreation.bigPitzaCreation();
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
