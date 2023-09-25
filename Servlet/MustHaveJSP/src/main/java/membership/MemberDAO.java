package membership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.JDBCConnect;

public class MemberDAO {
	
	
    private JDBCConnect jdbcConnect;
    private Connection con;
    private PreparedStatement psmt;
    private ResultSet rs;

    ArrayList<MemberDTO> list = null;

    public MemberDAO() {
        
    }

    public MemberDAO(String drv, String url, String id, String pwd) {
        jdbcConnect = new JDBCConnect(drv, url, id, pwd);
    }

    public MemberDTO getMemberDTO(String id, String pass) {
        MemberDTO member = new MemberDTO();

        String query = "SELECT * FROM member WHERE id = ? AND pass = ?";

        try {
            con = jdbcConnect.getConnection(); // con 변수 초기화
            psmt = con.prepareStatement(query);
            psmt.setString(1, id);
            psmt.setString(2, pass);
            rs = psmt.executeQuery();

            while (rs.next()) {
                member.setId(rs.getString("id"));
                member.setPass(rs.getString("pass"));
                member.setName(rs.getString(3));
                member.setRegidate(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return member;
    }

    public List<MemberDTO> getAllMemberDTO() {
        List<MemberDTO> memberList = new ArrayList<>();

        String query = "SELECT * FROM member";

        try {
            con = jdbcConnect.getConnection();
            psmt = con.prepareStatement(query);
            rs = psmt.executeQuery();

            while (rs.next()) {
                MemberDTO dto = new MemberDTO();
                dto.setId(rs.getString("id"));
                dto.setPass(rs.getString("pass"));
                dto.setName(rs.getString(3));
                dto.setRegidate(rs.getString(4));

                memberList.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return memberList;
    }

    public int insertMemberDTO(MemberDTO member) {
        String id = member.getId();
        String pass = member.getPass();
        String name = member.getName();

        int result = 0;

        String sql = "INSERT INTO member (id, pass, name, regidate) VALUES (?, ?, ?, ?)";

        try {
            con = jdbcConnect.getConnection();
            psmt = con.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, pass);
            psmt.setString(3, name);
            psmt.setString(4, member.getRegidate());
            result = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return result;
    }

    public void updateMemberDTO(MemberDTO member) {
        String id = member.getId();
        String pass = member.getPass();
        String name = member.getName();

        String sql = "UPDATE member SET pass = ?, name = ? WHERE id = ?";

        try {
            con = jdbcConnect.getConnection();
            psmt = con.prepareStatement(sql);
            psmt.setString(1, pass);
            psmt.setString(2, name);
            psmt.setString(3, id);
            psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void deleteMemberDTO(String id) {
        String sql = "DELETE FROM member WHERE id = ?";

        try {
            con = jdbcConnect.getConnection();
            psmt = con.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
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
}
