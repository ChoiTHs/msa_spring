package edu.kosa.dao_di;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import edu.kosa.model.UserVO;

public class UserDAO {

	@Autowired
	private ConnectionMaker connectionMaker; // has-a

//	public UserDAO(ConnectionMaker connectionMaker) { // DI - constructor
//		this.connectionMaker = connectionMaker;
//	}

	public UserDAO() {
	}

//	public void setConnectionMaker(ConnectionMaker connectionMaker) { // DI - setter method
//		this.connectionMaker = connectionMaker;
//	}

	// 3. DML명령어
	// insert
	public void insert(UserVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = connectionMaker.makeConnection(); // db connect

			String sql = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPassword());
			int result = pstmt.executeUpdate();
			System.out.println(result + " 개 입력 성공!!! connectionMaker");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end try

	} // end insert()

	// selectAll
	public void selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = connectionMaker.makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM USERS");

			System.out.println("\nID \t  Name \t   PWD");
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String pwd = rs.getString("password");
				System.out.println(id + "\t" + name + "\t" + pwd);
			} // while end

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // try end

	} // end selectAll()

	// selectById - 실습 과제
	public void selectById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM USERS WHERE ID = ?";
			conn = connectionMaker.makeConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			System.out.println("\nID \t  Name \t   PWD");
			while (rs.next()) {
				String Did = rs.getString("id");
				String Dname = rs.getString("name");
				String Dpwd = rs.getString("password");
				System.out.println(Did + "\t" + Dname + "\t" + Dpwd);
			} // while end

		} catch (Exception e) {e.printStackTrace();}
	}

	// updateById
	public void updateById(String id, String name, String pwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "UPDATE USERS SET NAME = ?, PASSWORD = ? WHERE ID = ?";
			conn = connectionMaker.makeConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pwd);
			pstmt.setString(3, id);
			rs = pstmt.executeQuery();

			selectById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// deleteById - 실습 과제
	public void deleteById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "DELETE FROM USERS WHERE ID = ?";
			conn = connectionMaker.makeConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			System.out.println(id + "is drop");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// menu
	public void menu() {
		System.out.println("선택하세요: \n1.Insert ");
		System.out.println("2.SelectAll \n3.SelectById \n4.Update \n5.Delete ");
	}
}
