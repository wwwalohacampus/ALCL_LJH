package DAO;

import java.util.ArrayList;
import java.util.List;

import DTO.Board;

/**
 * 데이터 접근 객체
 * - 게시글 데이터를 접근
 */
public class BoardDAO extends JDBConnection {

  /**
   * 데이터 목록
   * @return List<Board> 게시글 목록
   */
  public List<Board> list() {
    // 게시글 목록을 담을 컬렉션 객체 생성
    List<Board> boardList = new ArrayList<Board>();

    // SQL 작성
    String sql = " SELECT * "
               + " FROM board ";

    try {
      // 1. SQL 실행 객체 생성 - Statement (stmt)
      stmt = con.createStatement();

      // 2. SQL 실행 요청 -> 결과 ResultSet (rs)
      rs = stmt.executeQuery(sql);

      // 3. 조회된 결과를 리스트(boardList)에 추가
      while( rs.next() ) {      // next(): 조회 결과의 다음 데이터로 이동
        Board board = new Board();

        // 결과 데이터 가져오기
        // rs.getXXX("컬럼명")  : 해당 컬럼의 데이터를 반환
        board.setNo( rs.getInt("no") );
        board.setTitle( rs.getString("title") );
        board.setWriter( rs.getString("writer") );
        board.setContent( rs.getString("content") );
        board.setCreatedAt( rs.getTimestamp("created_at") );
        board.setUpdatedAt( rs.getTimestamp("updated_at") );

        // 게시글 목록에 추가
        boardList.add(board);
      }
      
    } catch (Exception e) {
      System.err.println("게시글 목록 조회 시, 예외 발생");
    }
    // 4. 게시글 목록 반환
    return boardList;
  }

  /**
   * 데이터 조회
   * @param no
   * @return Board 게시글 정보
   */
  public Board select(int no) {
    // TODO: 게시글 정보 객체 생성
    Board board = new Board();

    // SQL 작성
    String sql = " SELECT * "
               + " FROM board "
               + " WHERE no = ? ";      
    
    try {
      // SQL 실행 객체 생성 
      psmt = con.prepareStatement(sql);
  
      // ? 동적 파라미터 바인딩
      // * pmst.setXXX( 순서번호, 매핑할 값 );
      psmt.setInt(1, no);
  
      // SQL 실행 요청
      rs = psmt.executeQuery();
  
      // TODO: 조회 결과 1건 가져오기
      if( rs.next() ) {
        board.setNo( rs.getInt("no") );
        board.setTitle( rs.getString("title") );
        board.setWriter( rs.getString("writer") );
        board.setContent( rs.getString("content") );
        board.setCreatedAt( rs.getTimestamp("created_at") );
        board.setUpdatedAt( rs.getTimestamp("updated_at") );
      }
      
    } catch (Exception e) {
      System.err.println("게시글 조회 시, 예외 발생");
      e.printStackTrace();
    }
    // TODO: 게시글 정보 1건 반환
    return board;
  }
  
}
