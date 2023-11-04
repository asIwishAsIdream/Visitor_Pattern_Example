package carElements;

import visitors.Visitor;

public abstract class CarElement {
    public abstract void accept(Visitor v);

}
