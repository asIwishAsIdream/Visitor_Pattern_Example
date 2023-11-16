


public class MonitorSW {
  
  public void getEachStatus(CarElement carElement) {
    if (carElement instanceof Engine){
      carElement.getPower()
    }
    else if (carElement instanceof Lights){
      carElement.getBrightness()
    }
    else if (carElement instanceof Tire){
      carElement.getChangedDate()
    }
  } 
}



public class Diagnosis {
  
  public void getProblem(CarElement carElement) {
     carElement.getProblem()
  } 
}
