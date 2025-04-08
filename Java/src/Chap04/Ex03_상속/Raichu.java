package Chap04.Ex03_상속;

// 상속
// - 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {
  
  public Raichu() {
    super(300, "메가전기");
  }
  
  public Raichu(int energy) {
    super(energy, "메가전기");
  }

  public Raichu(int energy, String type) {
    super(energy, type);
  }

  @Override
  public String aAttack() {
    return "백만볼트";
  }

  @Override
  public String bAttack() {
    return "볼트체인지";
  }

  public String cAttack() {
    return "아이언테일";
  }

  


}
