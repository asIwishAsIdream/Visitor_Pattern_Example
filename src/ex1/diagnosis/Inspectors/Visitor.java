package ex1.diagnosis.Inspectors;

import ex1.diagnosis.Cars.CarElement;
import ex1.diagnosis.Cars.Engine;
import ex1.diagnosis.Cars.HeadLight;
import ex1.diagnosis.Cars.Tire;

public interface Visitor {
    public void visit(CarElement carElement);
    public void visit(Engine engine);
    public void visit(HeadLight headLight);
    public void visit(Tire tire);
}
