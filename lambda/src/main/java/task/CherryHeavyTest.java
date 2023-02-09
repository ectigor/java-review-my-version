package task;

public class CherryHeavyTest implements CherryPick{
    @Override
    public boolean test(Cherry cherry) {
        return cherry.getWeight() > 200;
    }
}
