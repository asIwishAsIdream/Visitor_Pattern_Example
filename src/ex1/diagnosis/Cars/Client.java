package ex1.diagnosis.Cars;

import java.util.Arrays;
import java.util.List;

public class Client {
  CarElement engine = new Engine();
  CarElement lights = new Lights();
  CarElement tire = new Tire();

  Monitor monitor = new Monitor();
  List<Object> elements = Arrays.asList(
    monitor.getStatus(engine)
    monitor.getStatus(lights)
    monitor.getStatus(tire)
  )
}
