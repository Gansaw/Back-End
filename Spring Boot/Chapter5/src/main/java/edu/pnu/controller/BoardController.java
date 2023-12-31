package edu.pnu.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.pnu.domain.Board;
import edu.pnu.persistence.BoardRepository;

@RestController
public class BoardController {

	@Autowired
	BoardRepository boardRepo;
	
	@GetMapping("/getBoardList")
	public List<Board> getBoardList(){
		return boardRepo.findAll();
	}
	
	@PostMapping("/board")
	public Board insertBoard(Board board) {
		if (board.getCreateDate() == null)
			board.setCreateDate(new Date());
		return boardRepo.save(board);
	}
	@PostMapping("/boardjson")
	public Board insertJsonBoard(@RequestBody Board board) {
		if (board.getCreateDate() == null)
			board.setCreateDate(new Date());
		return boardRepo.save(board);
	}
	
	@GetMapping("/board")
	public Board getBoard(Long id) {
		return boardRepo.findById(id).get();
	}
	
	@PutMapping("/board")
	public Board updateBoard(Board board) {
		return boardRepo.save(board);
	}
	
	@DeleteMapping("/board")
	public String deleteBoard(Long id) {
		boardRepo.deleteById(id);
		return String.format("seq가 %d인 데이터가 삭제되었습니다.", id);
	}
}
