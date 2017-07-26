package kimhao.builderpattern;

/**
 * Author by KimHao
 * Created by kimha on 25/07/2017.
 */

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}