package B.combinations;

import B.model.Size;

import java.util.List;

public class Combi {

    private List<Size> cocaCola;
    private List<Size> pitza;
    private double combiDiscount;

    public Combi (List<Size> cocaCola, List<Size> pitza, double combiDiscount) {
        this.cocaCola = cocaCola;
        this.pitza = pitza;
        this.combiDiscount = combiDiscount;
    }

    @Override
    public String toString() {
        return "Combi{" +
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
