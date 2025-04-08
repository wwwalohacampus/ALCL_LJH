package lombok.basic;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person("홍길동", 20);
    Person person3 = new Person("홍길동", 20, 170.0, 60.0);

    person1.setName("홍길동");
    person1.setAge(20);

    System.out.println( person1.getName() );
    System.out.println( person1.getAge() );

    System.out.println( person1.toString() );


  }
}
