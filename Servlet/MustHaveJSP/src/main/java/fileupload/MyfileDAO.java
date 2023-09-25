package fileupload;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.JDBCConnect;

public class MyfileDAO {

	private JDBCConnect jdbcConnect;
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;

	public MyfileDAO() {
		jdbcConnect = new JDBCConnect();
	}

	public int insertFile(MyfileDTO dto) {
		int result = 0;

		String sql = "INSERT INTO myfile (name, title, cate, ofile, sfile) VALUES (?, ?, ?, ?, ?)";

		try {
			con = jdbcConnect.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getCate());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());

			result = psmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("INSERT 중 예외 발생");
			e.printStackTrace();
		}

		return result;
	}

	public List<MyfileDTO> myFileList() {
		List<MyfileDTO> fileList = new ArrayList<>();

		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM myfile ORDER BY idx DESC";
		try {
			con = jdbcConnect.getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				MyfileDTO dto = new MyfileDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setCate(rs.getString(4));
				dto.setOfile(rs.getString(5));
				dto.setSfile(rs.getString(6));
				dto.setPostdate(rs.getString(7));

				fileList.add(dto);
			}
		} catch (Exception e) {
			System.out.println("SELECT 시 예외 발생");
			e.printStackTrace();
		}

		return fileList;
	}

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyfileDAO dao = new MyfileDAO();

		MyfileDTO dto = new MyfileDTO();
		dto.setName("name1");
		dto.setTitle("title1");
		dto.setCate("cate1");
		dto.setOfile("ofile1");
		dto.setSfile("sfile1");

		dao.insertFile(dto);
		System.out.println("DB Input!!");
	}
}
