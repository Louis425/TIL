package com.mbti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB implements DBINFO {

	public DB(String name, String gender, String age, String mbti, String type) {

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String spl = " INSERT INTO MEMBER(name,gender,age,mbti,type) " + " VALUES (?, ?, ?, ?, ?) ";

		PreparedStatement pstm = null;

		try {
			// 3. Query준비
			pstm = con.prepareStatement(spl);
			pstm.setString(1, name);
			pstm.setString(2, gender);
			pstm.setString(3, age);
			pstm.setString(4, mbti);
			pstm.setString(5, type);

			// 4. Query 실행 및 리턴
			int res = pstm.executeUpdate();
//			if (res > 0) {
//				System.out.println("입력 성공");
//			} else {
//				System.out.println("입력 실패");
//			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {

			// 5. DB종료
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
