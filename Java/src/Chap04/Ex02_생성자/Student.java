package Chap04.Ex02_생성자;

// 학생
// - 변수     : 이름, 나이, 학번, 전공
// - 메소드   : 공부하기, 성적 평균 구하기
public class Student {

  // 변수
  String name;
  int age;
  String stdNo;
  String major;
  
  // 생성자
  // 기본 생성자
  // ctrl + .  : Generate Constructors...
  public Student() {
    this("이름없음", 0);
  }

  // 매개변수가 있는 생성자
  public Student(String name, int age) {
    this( name, age, "000000", "전공없음");
    // this.name = name;
    // this.age = age;
  }

  // 모든 매개변수가 있는 생성자
  public Student(String name, int age, String stdNo, String major) {
    this.name = name;
    this.age = age;
    this.stdNo = stdNo;
    this.major = major;
  }

  // 메소드
  // * 접근지정자 반환타입 메소드명(매개변수) { }

  // - 공부하기
  public void study(String subject) {
    System.out.println( subject + "(을/를) 공부합니다.");
  }

  // - 성적 평균 구하기
  public double average(int score1, int score2) {
    double average = 0.0;
    average = (double) ( score1 + score2 ) / 2;
    return average;
  }

  // 메소드 오버로딩
  public double average(int score1, int score2, int score3) {
    double average = 0.0;
    average = (double) ( score1 + score2 + score3 ) / 3;
    return average;
  }

  // 메소드 오버로딩
  public double average(int[] scores) {
    double average = 0.0;
    int sum = 0;
    // for (int i = 0; i < scores.length; i++) {
    //   sum += scores[i];
    // }
    for (int score : scores) {
      sum += score;
    }
    average = (double) sum / scores.length;
    return average;
  }

  

  
  
  
}
