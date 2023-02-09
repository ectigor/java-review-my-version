package task;

public class GreenCherryTest implements CherryPick{


    @Override
    public boolean test(Cherry cherry) {
        return cherry.getColor().equals(Color.GREEN);
    }
}
