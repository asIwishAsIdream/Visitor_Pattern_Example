package badCarElements;

import java.util.Arrays;
import java.util.List;

public class BadEcu {

    // e = { :BadEngine, :BadTire }
    private List<BadCarElement> elements = Arrays.asList(
            new BadEngine(),
            new BadTire());


    public void onDriveGear() {
        elements.forEach(BadCarElement::onDriveGear);
    }
}
