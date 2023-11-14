package ex1.diagnosis.Cars;

import ex1.diagnosis.Inspectors.Visitor;

import java.util.Arrays;
import java.util.List;

public class Car {
    private final List<CarElement> elements = Arrays.asList(
            new Engine(),
            new Tire(),
            new HeadLight()
    );

    public List<CarElement> getElements() {
        return elements;
    }

    public void accept(Visitor visitor) {
        for(CarElement element : elements) {
            visitor.visit(element);
        }
    }


}
