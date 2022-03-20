package B.multiThreadMath;

import B.model.Size;

import java.util.List;

public class CommonResource {


    private final List<Size> cocaCola;
    private final List<Size> pitza;
    public double sumOfAll;

    public CommonResource(List<Size> cocaCola, List<Size> pitza) {
        this.cocaCola = cocaCola;
        this.pitza = pitza;
    }

    public List<Size> getCocaCola() {
        return cocaCola;
    }

    public List<Size> getPitza() {
        return pitza;
    }


}

