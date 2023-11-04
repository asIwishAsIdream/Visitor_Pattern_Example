package visitors;

import carElements.Engine;
import carElements.Tire;

public class ParkingVisitor extends Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Engine Keeps Brrrring.");
    }

    @Override
    public void visit(Tire tire) {
        System.out.println("Tire Must Stop.");
    }
}
