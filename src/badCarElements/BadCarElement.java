package badCarElements;

public abstract class BadCarElement {
    public abstract void driveGear();

    /*
    * 파킹 기어일 때 행위를 추가 하려면?
    * BadCarElement 클래스와 서브클래스를 전부 수정해야함.
    * => OCP 위반
    *
    * 만약 이게 18단까지 있는 트레일러 트럭이었다면?
    *
    * */

}
