package ex01;

import java.sql.Connection;

public class DBConnectionTest {

	public static void main(String[] args) {
		// mysql서버와 연결 테스트
		// 워크벤치의 Test_Connection과 같은 기능 만들기
		try ( // mysql 시도 후 성공할때
				// DbConfig.getConnection() : mysql 서버에 연결시도
				// 성공하면 Connetion 객체를 돌려줌
				Connection connection = DBConfig.getConnection()) {
				System.out.println("MySQL 연결에 성공했습니다!");
				// getCatalog : 연결된 mysql서버의 데이터베이스 알려줌
				System.out.println("연결된 DB: " + connection.getCatalog());
		} catch (Exception e) {
				// 사용자 id, password 오류 또는 mysql 서버가 바쁠때
				System.out.println("MySQL 연결에 실패했습니다.");
				System.out.println("오류 내용: " + e.getMessage());
		}
	}
}
