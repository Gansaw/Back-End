package membership;

import java.util.List;

public class MemberDAOTest {
	
	private static MemberDAO memberDAO = new MemberDAO();
	
	public static void printAllMemberDTO(){
		
		List<MemberDTO> list = memberDAO.getAllMemberDTO();
		for(MemberDTO m : list)
			System.out.println(m);	
		
	}
	
	public static void insertMemberDTO() {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("Home");
		memberDTO.setPass("2468");
		memberDTO.setName("홍길동");		

		memberDAO.insertMemberDTO(memberDTO);
		
	}
	

	public static void main(String[] args) {
		
		printAllMemberDTO();
		System.out.println("-".repeat(80));
		insertMemberDTO();
		System.out.println("-".repeat(80));
		
		

	}

}
