package Chap05.Collection.List;

import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    // Vector 생성
    // - 학생 목록
    Vector<String> studentList = new Vector<String>();

    // 요소 추가 - add()
    studentList.add("학생1");
    studentList.add("학생2");
    studentList.add("학생3");
    studentList.add("학생4");
    studentList.add("학생5");
    
    System.out.println("::::: 학생 목록 :::::");
    System.out.println( studentList );
    System.out.println("--------------------");

    // 요소 제거 - remove() 
    studentList.remove("학생4");          // 객체 요소(인스턴스)로 제거
    studentList.remove(1);            // index 로 제거

    // 요소 접근 - get()
    String firstStudent = studentList.get(0);
    String secondStudent = studentList.get(1);
    System.out.println("첫 번째 학생 : " + firstStudent);
    System.out.println("두 번째 학생 : " + secondStudent);

    // 요소 개수 - size()
    int size = studentList.size();
    System.out.println("남은 학생 수 : " + size);

    // 모든 요소 제거 - clear()
    studentList.clear();
    System.out.println("::::: 모든 요소 제거 :::::");
    System.out.println(studentList);
    System.out.println("-------------------------");

    // 요소 전체 추가 - addAll()
    Vector<String> studentList2 = new Vector<String>();
    studentList2.add("학생10");
    studentList2.add("학생11");
    studentList2.add("학생12");
    studentList.addAll(studentList2);

    System.out.println("::::: 요소 전체 추가 :::::");
    for (int i = 0; i < studentList.size(); i++) {
      String student = studentList.get(i);
      System.out.print(student);
      if( i < studentList.size()-1 ) System.out.print(", ");
    }
    System.out.println();

    for (String student : studentList2) {
      System.out.print(student + " ");
    }    
    System.out.println();

    // 다른 컬렉션을 인자로 생성할 수 있다.
    Vector<String> studentList3 = new Vector<>(studentList2);
    studentList3.add("테스트");
    for (String student : studentList3) {
      System.out.print(student + " ");
    }
    System.out.println();
  }
  
}





