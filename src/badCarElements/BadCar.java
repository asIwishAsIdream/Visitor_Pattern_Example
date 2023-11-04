package badCarElements;

import java.util.Arrays;
import java.util.List;

public class BadCar extends BadCarElement {

    // e = { :BadEngine, :BadTire }
    private List<BadCarElement> e = Arrays.asList(
            new BadEngine(),
            new BadTire());

    @Override
    public void driveGear() {
        e.forEach(BadCarElement::driveGear);
    }
}
