package carElements;

import visitors.Visitor;

public class Engine extends CarElement {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
