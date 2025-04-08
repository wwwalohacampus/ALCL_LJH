package Chap04.Ex08_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class AutoClose {

  public static void main(String[] args) {
    // AutoClose
    // try ( 자동으로 자원해제할 객체 생성 ) {  }
    // : finally 구문에서 close() 하지 않아도, 자동으로 자원해제 해준다.
    // * AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원해제 가능
    try (
      FileInputStream fis = new FileInputStream("test.txt");
      InputStreamReader in = new InputStreamReader(fis, "UTF-8");
    ) {
      int read = 0;
      while( (read = in.read() ) != -1 ) {
        System.out.print( (char) read );
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      System.err.println("파일을 찾을 수 없습니다.");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      System.err.println("지원하지 않은 인코딩 타입입니다.");
    } catch (IOException e) {
      e.printStackTrace();
      System.err.println("입출력 관련 예외가 발생했습니다.");
    }
  }

}

