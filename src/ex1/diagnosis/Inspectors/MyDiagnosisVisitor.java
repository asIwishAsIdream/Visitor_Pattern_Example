package ex1.diagnosis.Inspectors;

import ex1.diagnosis.Cars.CarElement;
import ex1.diagnosis.Cars.Engine;
import ex1.diagnosis.Cars.HeadLight;
import ex1.diagnosis.Cars.Tire;

public class MyDiagnosisVisitor implements Visitor{
    @Override
    public void visit(CarElement carElement) {
        System.out.println(carElement.problem());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println(engine.problem());
    }

    @Override
    public void visit(HeadLight headLight) {
        System.out.println(headLight.problem());
    }

    @Override
    public void visit(Tire tire) {
        System.out.println(tire.problem());
    }
}
