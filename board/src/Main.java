import java.util.List;
import java.util.Scanner;

import DTO.Board;
import Service.BoardService;
import Service.BoardServiceImpl;

public class Main {

  static Scanner sc = new Scanner(System.in);                   // 입력 객체
  static List<Board> boardList = null;                          // 게시글 목록
  static BoardService boardService = new BoardServiceImpl();    // 비즈니스 로직 객체

  public static void main(String[] args) {
    List<Board> boardList = boardService.list();
    for (Board board : boardList) {
      System.out.println(board);
    }
    
    Board board = boardService.select(5);
    System.out.println(":::::::::: 5번 글 :::::::::::");
    System.out.println(board);
  }
  
}
