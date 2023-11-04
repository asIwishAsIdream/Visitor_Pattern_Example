package carElements;

import visitors.Visitor;

public class Tire extends CarElement {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
