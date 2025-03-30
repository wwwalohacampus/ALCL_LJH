package Chap04.Ex01_클래스;

public class Main {

  public static void main(String[] args) {
    // 객체 생성
    // 클래스타입 객체명 = new 클래스명();
    Person person = new Person();

    // (.) : 접근 연산자
    person.name = "김철수";
    person.age = 20;

    System.out.println("이름 : " + person.name);
    System.out.println("나이 : " + person.age);
    person.eat("맥도날드");
    person.work("코딩", 10);

  }
  
}
