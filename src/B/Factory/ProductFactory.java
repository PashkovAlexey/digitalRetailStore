package B.Factory;

import B.model.Big;
import B.model.Middle;
import B.model.Small;

public interface ProductFactory {
    Small createSmall();
    Middle createMiddle();
    Big createBig();


}
