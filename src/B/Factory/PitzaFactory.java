package B.Factory;

import B.Pitza.PitzaBig;
import B.Pitza.PitzaMiddle;
import B.Pitza.PitzaSmall;
import B.model.Big;
import B.model.Middle;
import B.model.Small;

public class PitzaFactory implements ProductFactory {


    @Override
    public Small createSmall() {
        Small smallPitza = new PitzaSmall(0,"","");
        smallPitza.setSmallPrice();
        smallPitza.setSmallDecription();
        smallPitza.setSmallProdTypeName();
        return smallPitza;
    }

    @Override
    public Middle createMiddle() {
        Middle middlePitza = new PitzaMiddle(0,"","");
        middlePitza.setMiddlePrice();
        middlePitza.setMiddleDecription();
        middlePitza.setMiddleProdTypeName();
        return middlePitza;
    }

    @Override
    public Big createBig() {
        Big bigPitza = new PitzaBig(0,"","");
        bigPitza.setBigPrice();
        bigPitza.setBigDecription();
        bigPitza.setBigProdTypeName();
        return bigPitza;
    }
}
