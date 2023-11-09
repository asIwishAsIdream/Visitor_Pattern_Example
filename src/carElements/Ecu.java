package carElements;

import visitors.Visitor;

import java.util.Arrays;
import java.util.List;

public class Ecu {

    // elements = { :Engine, :Tire }
    private List<CarElement> elements = Arrays.asList(
            new Engine(),
            new Tire());


    public void changeGear(Visitor v) {
        elements.forEach(x -> x.accept(v));
    }
}
