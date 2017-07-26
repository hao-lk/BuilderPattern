package kimhao.builderpattern;

/**
 * Author by KimHao
 * Created by kimha on 25/07/2017.
 */

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}