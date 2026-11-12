package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	private static final String DB_URL = 
			// 자바와 데이터베이스가 네트워크 연결하여
			// 통신하는 것이므로 통신규칙이 필요
			// jdbc:mysql: = db와 통신하는 네트워크 프로토콜
			// jdbc:mysql://db호스트(localhost):포트(3306)
			//   / db_uri =/ 데이터베이스명(monster_lab)
			// mysql 전용옵션 =
			// ?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
			"jdbc:mysql://localhost:3306/monster_lab"
	        + "?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
	
	
		private static final String DB_USER = "root";
		private static final String DB_PASSWORD = "admin1234";
		
		// 진짜로 자바가 mysql 서버에 연결함
		public static Connection getConnection() throws SQLException {
				// mysql connector/J를 이용해서 진짜 mysql연결상태를 얻음
				// 이것을 Connection이라고 함
			return DriverManager.getConnection(
			DB_URL, DB_USER, DB_PASSWORD
			);
		}
}