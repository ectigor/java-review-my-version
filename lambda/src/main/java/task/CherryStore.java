package task;

import java.util.ArrayList;
import java.util.List;

public class CherryStore {
    public static void main(String[] args) {

List<Cherry> invent = new ArrayList<>();

invent.add(new Cherry(3233,Color.RED));
invent.add(new Cherry(33,Color.GREEN));
invent.add(new Cherry(3,Color.RED));
invent.add(new Cherry(133,Color.GREEN));
invent.add(new Cherry(233,Color.GREEN));

List<Cherry> green = filter(invent,new GreenCherryTest());
        System.out.println("green = " + green);


    }
public static List<Cherry> filter(List<Cherry> invent,CherryPick cherryPick){
        List<Cherry> result = new ArrayList<>();

    for (Cherry cherry : invent) {
        if (cherryPick.test(cherry)){
            result.add(cherry);
        }

    }
    return result;
}

}