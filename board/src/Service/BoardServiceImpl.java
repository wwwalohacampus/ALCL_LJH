package Service;

import java.util.List;

import DAO.BoardDAO;
import DTO.Board;

public class BoardServiceImpl implements BoardService {

  private BoardDAO boardDAO = new BoardDAO();

  @Override
  public List<Board> list() {
    // DAO 객체로 게시글 목록을 요청하고 List<Board>
    List<Board> boardList = boardDAO.list();
    // 게시글 목록 데이터 반환
    return boardList;
  }

  @Override
  public Board select(int no) {
    // 게시글 번호 no 를 DB 로 넘겨주고 게시글 정보 요청
    Board board = boardDAO.select(no);

    // 게시글 정보 반환
    return board;
  }

  @Override
  public int insert(Board board) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insert'");
  }

  @Override
  public int update(Board board) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public int delete(int no) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }
  
}
