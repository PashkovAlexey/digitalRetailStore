package B.combinations;

public class CombiDirector {

    public Combi makeCombi(int combiTypeChosen){
        Builder combiBuild = null;
        if (combiTypeChosen == 1){
            combiBuild = new CombiThree(null, null, 0);
        } else if (combiTypeChosen == 2){
            combiBuild = new CombiFive(null, null, 0);
        }
        if (combiBuild != null){
            combiBuild.reset();
            combiBuild.buildCola();
            combiBuild.buildPitza();
            combiBuild.buildDiscount();
            return combiBuild.getResult();
        } else {
            return null;
        }

    }

}
