package Chap04.Ex06_추상클래스;

public class Circle extends Shape {

  double radius;

  public Circle() {
    this(0);
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    // 원의 넓이 = (원주율) x (반지름) x (반지름)
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  double round() {
    return 2 * Math.PI * radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle [radius=" + radius + "]";
  }

  
  
}
