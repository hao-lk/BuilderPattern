package kimhao.builderpattern;

/**
 * Author by KimHao
 * Created by kimha on 25/07/2017.
 */

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}