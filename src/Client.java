import badCarElements.BadCar;
import carElements.Car;
import visitors.DrivingVisitor;
import visitors.ParkingVisitor;

public class Client {
    public static void main(String[] args) {
//        fixedCar();
        badCar();
    }

    private static void fixedCar() {
        Car car = new Car();
        DrivingVisitor dv = new DrivingVisitor();
        ParkingVisitor pv = new ParkingVisitor();

        System.out.println("Driving Gear :");
        car.accept(dv);

        System.out.println();

        System.out.println("Parking Gear :");
        car.accept(pv);
    }

    private static void badCar() {
        BadCar badCar = new BadCar();

        System.out.println("Driving Gear :");
        badCar.driveGear();
    }
}