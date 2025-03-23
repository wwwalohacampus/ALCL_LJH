package Chap03;

import java.util.Scanner;

public class Ex08_Array {

  public static void main(String[] args) {
    // 배열 선언
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    // * foreach 문
    // for( 자료형 반복요소명 : 배열 ) { }
    // : 배열 또는 컬렉션의 모든 요소를 순서대로 전부 반복하는 반복문
    for (int i : arr) {
      System.out.print(i + " ");
    }

    sc.close();
  }
  
}
