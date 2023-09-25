package edu.pnu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.pnu.domain.Member;

public class MemberDAO {
	
	private String driver = "org.h2.Driver";
	private String url = "jdbc:h2:tcp://localhost/~/telephone";
	private String username = "scott";
	private String password = "tiger"; 
	
	private Connection con;
	
	
	public MemberDAO() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}
	
	public int insertMember(Member m) {
		String query = "insert into member(name, age, nickname) values (?,?,?)";
		try {
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, m.getName());
			psmt.setInt(2, m.getAge());
			psmt.setString(3, m.getNickname());
			int result = psmt.executeUpdate();	
			psmt.close();
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Member> getMembers(){
		List<Member> list = new ArrayList<>();
		String query = "select * from member";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				Member m = Member.builder()
						.id(rs.getLong("id"))
						.name(rs.getString("name"))
						.age(rs.getInt("age"))
						.nickname(rs.getString("nickname"))
						.build();
				list.add(m);
			}
			rs.close();
			stmt.close();
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Member getMember(Long id) {
		String query = "select * from member where id = ?";
		try {			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);			
			while(rs.next()) {
				Member m = Member.builder()
						.id(rs.getLong("id"))
						.name(rs.getString("name"))
						.age(rs.getInt("age"))
						.nickname(rs.getString("nickname"))
						.build();
				return m;
			}
			rs.close();
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
