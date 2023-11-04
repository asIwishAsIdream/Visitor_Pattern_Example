package visitors;

import carElements.Engine;
import carElements.Tire;

public abstract class Visitor {
    public abstract void visit(Engine engine);
    public abstract void visit(Tire tire);

    /*
    * 새로운 기어를 추가할 때,
    * 새로운 Visitor를 만들기만 하면 됨!
    * => 수정 없이 확장으로만 요구사항 변화에 대처.
    * */
}
