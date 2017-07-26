package kimhao.builderpattern;

/**
 * Author by KimHao
 * Created by kimha on 25/07/2017.
 */

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}