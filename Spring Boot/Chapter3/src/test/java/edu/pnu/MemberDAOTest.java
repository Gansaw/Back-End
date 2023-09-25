package edu.pnu;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import edu.pnu.dao.MemberDAO;
import edu.pnu.domain.Member;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
public class MemberDAOTest {

	@Test
	@Order(1)
	public void insertMemberTest() {
		MemberDAO memberDao = new MemberDAO();

		for (int i = 1; i <= 10; i++) {
//			Builder 이용
			memberDao.insertMember(
						Member.builder()
						.name("name" + i)
						.age(20 + i)
						.nickname("nickname" + i)
						.build()
					);
//			기본생성자 이용
//			Member m = new Member();
//						m.setName("Name" + i);
//						m.setAge(20 + i);
//						m.setNickname("Nickname" + i);
//						memberDao.insertMember(m);
			
//			파라미터가 필요한 생성자를 이용
//			memberDao.insertMember(new Member(-1L,"name" + i, 20+i, "nickname" + i));
		}
	}
	
	@Test
	@Order(2)
	public void selectAllMemberTest() {
		MemberDAO memberDao = new MemberDAO();
		
		List<Member> list = memberDao.getMembers();
		for (Member m : list) {
			System.out.println(m);
		}
	}
}
