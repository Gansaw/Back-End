package edu.pnu;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import edu.pnu.domain.Board;
import edu.pnu.persistence.BoardRepository;

@SpringBootTest
public class QueryMethodTest {
	@Autowired
	private BoardRepository boardRepo;
	
	public void dataPrepare() {
		Random rd = new Random();
		for(int i = 1; i < 101; i++) {
			boardRepo.save(Board.builder()
					.title("title"+i)
					.writer("writer"+i)
					.content("content"+i)
					.createDate(new Date())
					.cnt(rd.nextLong(0,101))
					.build());
		}
	}
	
	@Test
	public void testFindByTitle() {
	    int pageNumber = 0; // 페이지 번호 (0부터 시작)
	    int pageSize = 10; // 페이지당 결과 수

	    Pageable paging = PageRequest.of(pageNumber, pageSize);
		List<Board> boardlist = boardRepo.findByTitleLike("content10", paging);		
		System.out.println("검색결과");
		for(Board board : boardlist) {
			System.out.println("--->"+board.toString());
		}
	}
}
	