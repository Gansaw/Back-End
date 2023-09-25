package edu.pnu;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.querydsl.core.BooleanBuilder;

import edu.pnu.domain.Board;
import edu.pnu.domain.QBoard;
import edu.pnu.persistence.DynamicBoardRepository;

@SpringBootTest
public class DynamicQueryTest {

	@Autowired
	private DynamicBoardRepository boardRepo;

//	private void test(String searchCondition, String searchKeyword) {
//		BooleanBuilder builder = new BooleanBuilder();
//		QBoard qboard = QBoard.board;
//		
//		if(searchCondition.equals("TITLE")){
//			builder.and(qboard.title.like("%" + searchKeyword + "%"));
//		}else if(searchCondition.equals("CONTENT")) {
//			builder.and(qboard.content.like("%" + searchKeyword + "%"));
//		}
//		
//		Iterable<Board> list = boardRepo.findAll(builder);
//		for(Board b : list) {
//			System.out.println("--->" + b);
//		}
//		
//	}

	@Test
	private void test1(Map<String, String> map) {
		BooleanBuilder builder = new BooleanBuilder();
		QBoard qboard = QBoard.board;

		for (String searchCondition : map.keySet()) {
			String searchKeyword = map.get(searchCondition);

			if (searchCondition.equals("title")) {
				builder.and(qboard.title.like("%" + searchKeyword + "%"));
			} else if (searchCondition.equals("content")) {
				builder.or(qboard.content.like("%" + searchKeyword + "%"));
			}
		}

		Iterable<Board> list = boardRepo.findAll(builder);
		for (Board b : list) {
			System.out.println("--->" + b);
		}
	}

	@Test
	public void testDynamicQuery() {
		Random rand = new Random(100);
		Map<String, String> map = new HashMap<>();
		for (int i = 1; i <= 100; i++) {
			map.put("title", "title" + i);
			map.put("writer", "writer" + i);
			map.put("content", "content" + i);
			map.put("cnt", rand.toString());
			test1(map);			
		}
		
	} 
}
