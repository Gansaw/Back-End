package edu.pnu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import edu.pnu.domain.Member;

public class MemberDAO {

	private String driver = "org.h2.Driver";
	private String url = "jdbc:h2:tcp://localhost/~/mission2";
	private String username = "scott";
	private String password = "tiger";

	private Connection con;

	public MemberDAO() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Member getMember(Long id) {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(String.format("select * from member where id = %d", id));

			while (rs.next()) {
				Member m = Member.builder()
						.id(rs.getLong("id"))
						.pass(rs.getString("pass"))
						.name(rs.getString("name"))
						.regidate(rs.getDate("regidate"))
						.build();
				return m;
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Member> getMembers() {
		List<Member> list = new ArrayList<>();
		try {			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from member order by id");

			while(rs.next()) {
				Member m = Member.builder()
						.id(rs.getLong("id"))
						.pass(rs.getString("pass"))
						.name(rs.getString("name"))
						.regidate(rs.getDate("regidate"))
						.build();
				list.add(m);								
			}

			rs.close();
			stmt.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int insertMember(Member member) { 
		String sql = "insert into member (pass,name) values (?,?)";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, member.getPass());
			psmt.setString(2, member.getName());
			int result = psmt.executeUpdate();			
			psmt.close();
			return result;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
		

	public int updateMember(Member member) {
		String sql = "update member set pass = ?, name = ? where id = ?";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);			
			psmt.setString(1, member.getPass());
			psmt.setString(2, member.getName());
			psmt.setLong(3, member.getId());
			int result = psmt.executeUpdate();
			psmt.close();
			return result;
		}catch(Exception e) {
			e.printStackTrace();	
		}				
		return 0;
	}

	public int deleteMember(Long id) {
		String sql = "delete from member where id = ?";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setLong(1, id);
			int result = psmt.executeUpdate();			
			psmt.close();
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
}