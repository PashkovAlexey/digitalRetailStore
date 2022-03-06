package B.Factory;

import B.CocaCola.CocaColaBig;
import B.CocaCola.CocaColaMiddle;
import B.CocaCola.CocaColaSmall;
import B.model.Big;
import B.model.Middle;
import B.model.Small;

public class CocaColaFactory implements ProductFactory{

    @Override
    public Small createSmall() {
        Small smallCola = new CocaColaSmall(0, "", "");
        smallCola.setSmallPrice();
        smallCola.setSmallDecription();
        smallCola.setSmallProdTypeName();
        return smallCola;
    }

    @Override
    public Middle createMiddle() {
        Middle middleCola = new CocaColaMiddle(0,"", "");
        middleCola.setMiddlePrice();
        middleCola.setMiddleDecription();
        middleCola.setMiddleProdTypeName();
        return middleCola;
    }

    @Override
    public Big createBig() {
        Big bigCola = new CocaColaBig(0, "", "");
        bigCola.setBigPrice();
        bigCola.setBigDecription();
        bigCola.setBigProdTypeName();
        return bigCola;
    }
}
