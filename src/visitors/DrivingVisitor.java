package visitors;

import carElements.Engine;
import carElements.Tire;

public class DrivingVisitor extends Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Engine Goes Brrrr.");
    }

    @Override
    public void visit(Tire tire) {
        System.out.println("Tire Goes Spinnn.");
    }
}
