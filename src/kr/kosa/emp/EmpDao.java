package kr.kosa.emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpDao {
   static {
      try{
    	  Class.forName("oracle.jdbc.driver.OracleDriver");
    	  System.out.println("����̹� Ŭ������ �ε�Ǿ����ϴ�.");
      }catch(ClassNotFoundException e) {
    	  System.out.println("����̹� Ŭ���� �ε� ����");
    	  e.printStackTrace();
      }
   }
   
   private String url = "jdbc:oracle:thin:@localhost:1521:xe";
   private String id = "hr";
   private String pw = "hr";
   
   public int getEmpCount() {
	   int count = 0;
	   // connection ����
	   Connection con = null;
	   try {
		   con = DriverManager.getConnection(url, id, pw);
		   System.out.println(con);
	   }catch(Exception e) {
//6qwe
	   }finally {
		   
	   }
	   // statement ����
	   
	   // SQL ���� ����
	   
	   // ������ռҺ�
	   
	   // Connection �ݱ�
	   return count;
   }
}