package Chap04.Ex06_추상클래스;

// 추상 클래스
public abstract class Shape {

  Point point;

  // 넓이와 둘레를 구하는 추상메소드를 정의하시오.
  // * 추상 메소드 : abstract 접근지정자 반환타입 메소드명( 매개변수 );
  abstract double area();
  abstract double round();

  // getter, setter 를 정의하시오.
  public Point getPoint() {
    return point;
  }
  public void setPoint(Point point) {
    this.point = point;
  }

  
  
}
