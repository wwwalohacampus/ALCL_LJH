package Chap04.Ex06_추상클래스;

public class Rectangle extends Shape {

  double width, height;

  public Rectangle() {
    this(0.0, 0.0);
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  double area() {
    // 사각형의 넓이 = (가로) x (세로)
    return width * height;
  }

  @Override
  double round() {
    // 사각형의 둘레 = 2 * (a+b)
    return 2 * (width + height);
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "Rectangle [width=" + width + ", height=" + height + "]";
  }

    
  
}
