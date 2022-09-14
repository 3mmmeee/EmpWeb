package kr.kosa.emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpDao {
   static {
      try{
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
    	  System.out.println("드라이버 클래스가 로드되었습니다.");
      }catch(ClassNotFoundException e) {
    	  System.out.println("드라이버 클래스 로드 실패");
    	  e.printStackTrace();
      }
   }
   
   private String url = "jdbc:oracle:thin:@localhost:1521:xe";
   private String id = "hr";
   private String pw = "hr";
   
   public int getEmpCount() {
	   int count = 0;
	   // connection 생성
	   Connection con = null;
	   try {
		   con = DriverManager.getConnection(url, id, pw);
		   System.out.println(con);
	   }catch(Exception e) {
//6qwe
	   }finally {
		   
	   }
	   // statement 생성
	   
	   // SQL 쿼리 전송
	   
	   // 결과집합소비
	   
	   // Connection 닫기
	   return count;
   }
}