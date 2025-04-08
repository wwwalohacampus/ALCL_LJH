package Chap04.Ex08_예외처리;

import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a : ");
    int a = sc.nextInt();
    System.out.print("b : ");
    int b = sc.nextInt();
    try {
      // 예외 발생 가능성이 있는 문장
      int result = a / b;
      System.out.println("result : " + result);
    } catch (Exception e) {
      // 예외 발생 시, 실행할 예외 처리 문장
      System.err.println("예외 발생");
      System.err.println("0 으로 나눌 수 없습니다.");
    } finally {
      // 예외 발생과 무관하게 실행하는 문장
      System.out.println("예외 처리 완료");
    }
    sc.close();
  }
}
