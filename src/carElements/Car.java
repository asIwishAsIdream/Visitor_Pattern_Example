package carElements;

import visitors.Visitor;

import java.util.Arrays;
import java.util.List;

public class Car extends CarElement{

    // e = { :ElementA, :ElementB }
    private List<CarElement> e = Arrays.asList(
            new Engine(),
            new Tire());


    @Override
    public void accept(Visitor v) {
        e.forEach( x -> x.accept(v));
    }
}
