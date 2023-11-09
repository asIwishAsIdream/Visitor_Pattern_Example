import badCarElements.BadEcu;
import carElements.Ecu;
import visitors.DrivingVisitor;
import visitors.ParkingVisitor;

public class Client {
    public static void main(String[] args) {
        fixedCar();
        badCar();
    }

    private static void fixedCar() {
        Ecu ecu = new Ecu();
        DrivingVisitor dv = new DrivingVisitor();
        ParkingVisitor pv = new ParkingVisitor();

        System.out.println("Driving Gear :");
        ecu.changeGear(dv);

        System.out.println();

        System.out.println("Parking Gear :");
        ecu.changeGear(pv);
    }

    private static void badCar() {
        BadEcu badEcu = new BadEcu();

        System.out.println("Driving Gear :");
        badEcu.onDriveGear();
    }
}