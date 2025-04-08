package Chap04.Ex06_추상클래스;

public class Point {

  // 멤버 변수
  int x, y;

  public Point() {
    this(0, 0);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point [x=" + x + ", y=" + y + "]";
  }
  
}
