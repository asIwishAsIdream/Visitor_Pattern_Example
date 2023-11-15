package ex1.diagnosis.Cars;

import java.util.Arrays;
import java.util.List;

public class Client {
    List<Object> elements = Array.asList{
        new Engine(),
        new Lights(),
        new Tire();
    }

    Monitor monitor = new Monitor();
    for( CarElement element : elements )
    {
        monitor.getStatus(element);
    }
}
