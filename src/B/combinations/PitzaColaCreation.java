package B.combinations;

import B.CocaCola.CocaColaBig;
import B.CocaCola.CocaColaMiddle;
import B.CocaCola.CocaColaSmall;
import B.Pitza.PitzaBig;
import B.Pitza.PitzaMiddle;
import B.Pitza.PitzaSmall;
import B.model.Big;
import B.model.Middle;
import B.model.Small;

public interface PitzaColaCreation {

    static Small smallPitzaCreation (){
        Small smallPitza = new PitzaSmall(0,"","");
        smallPitza.setSmallPrice();
        smallPitza.setSmallDecription();
        smallPitza.setSmallProdTypeName();
        return smallPitza;
    }

    static Middle middlePitzaCreation (){
        Middle middlePitza = new PitzaMiddle(0,"","");
        middlePitza.setMiddlePrice();
        middlePitza.setMiddleDecription();
        middlePitza.setMiddleProdTypeName();
        return middlePitza;
    }
    static Big bigPitzaCreation (){
        Big bigPitza = new PitzaBig(0,"","");
        bigPitza.setBigPrice();
        bigPitza.setBigDecription();
        bigPitza.setBigProdTypeName();
        return bigPitza;
    }

    static Small smallColaCreation (){
        Small smallCola = new CocaColaSmall(0, "", "");
        smallCola.setSmallPrice();
        smallCola.setSmallDecription();
        smallCola.setSmallProdTypeName();
        return smallCola;
    }
    static Middle middleColaCreation (){
        Middle middleCola = new CocaColaMiddle(0,"", "");
        middleCola.setMiddlePrice();
        middleCola.setMiddleDecription();
        middleCola.setMiddleProdTypeName();
        return middleCola;
    }
    static Big bigColaCreation (){
        Big bigCola = new CocaColaBig(0, "", "");
        bigCola.setBigPrice();
        bigCola.setBigDecription();
        bigCola.setBigProdTypeName();
        return bigCola;
    }

}
