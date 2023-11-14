package ex1.diagnosis.Cars;

import java.util.Arrays;
import java.util.List;

public class Client {
  CarElement engine = new Engine();
  CarElement lights = new Lights();
  CarElement tire = new Tire();

  Monitor monitor = new Monitor();
  
  // 상태(Status)를 체크하는 elements 리스트 생성
  List<Object> statusElements = Arrays.asList(
      monitor.getStatus(engine),
      monitor.getStatus(lights),
      monitor.getStatus(tire)
  );
  
  // 문제(Diagnosis)를 체크하는 elements 리스트 생성
  Diagnosis diagnosis = new Diagnosis();
  
  List<Object> problemElements = Arrays.asList(
      monitor.getProblem(engine),
      monitor.getProblem(lights),
      monitor.getProblem(tire)
  );
}
