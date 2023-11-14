package ex1.diagnosis.Inspectors;

import ex1.diagnosis.Cars.Car;
import ex1.diagnosis.Cars.CarElement;

import java.util.List;

public class CarInspector {

    // Solution #1
    public void diagnosis(Car car) {
        List<CarElement> elements = car.getElements();
        for (CarElement element : elements) {
            element.expireDate();
        }
    }

    public void monitor(Car car) {
        List<CarElement> elements = car.getElements();
        for (CarElement element : elements) {
            element.status();
        }
    }

    // Solution #2
    public void diagnosisByVisitor(Car car) {
        car.accept(new MyDiagnosisVisitor());
    }

    public void monitorByVisitor(Car car) {
        car.accept((new MyMonitorVisitor()));
    }
}
