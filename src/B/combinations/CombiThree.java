package B.combinations;

import B.model.Middle;
import B.model.Size;
import B.model.Small;

import java.util.ArrayList;
import java.util.List;

public class CombiThree extends Combi implements Builder, PitzaColaCreation{

    private List<Size> cocaCola = null;
    private List<Size> pitza = null;
    private double combiDiscount = 0;

    public CombiThree(List<Size> cocaCola, List<Size> pitza, double combiDiscount) {
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
    }

    @Override
    public void buildPitza() {
        pitza = new ArrayList<>();
        Small smallPitza = PitzaColaCreation.smallPitzaCreation();
        pitza.add(smallPitza);
        pitza.add(smallPitza);
        Middle middlePitza = PitzaColaCreation.middlePitzaCreation();
        pitza.add(middlePitza);
    }

    @Override
    public void buildDiscount() {
                combiDiscount = 0.15;
    }

    @Override
    public Combi getResult() {
        Combi combiNumberThree = new Combi(cocaCola, pitza, combiDiscount);
        return combiNumberThree;
    }

    @Override
    public String toString() {
        return "CombiThree{" +
                "cocaCola=" + cocaCola +
                ", pitza=" + pitza +
                ", combiDiscount=" + combiDiscount +
                '}';
    }

    public List<Size> getCocaCola() {
        return cocaCola;
    }

    public List<Size> getPitza() {
        return pitza;
    }

    public double getCombiDiscount() {
        return combiDiscount;
    }

}
