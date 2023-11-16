package ex1.diagnosis.Cars;

public class Engine implements CarElement {

    String power = "Strong"    
    String restOil = "Full"

    @Override
    public void diagnosis() {
        System.out.println(this.restOil);
    }

    public String getPower() {
        return this.power;
    }    

}
