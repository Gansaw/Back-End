package edu.pnu.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pnu.domain.Board;
import edu.pnu.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepo;

	@Override
	public List<Board> getBoardList() {
		return boardRepo.findAll();
	}

	@Override
	public void insertBoard(Board board) {
		board.setCnt(0L);
		board.setCreateDate(new Date());
		boardRepo.save(board);
	}

//	@Override
//	public Board getBoard(Board board) {		
//		return boardRepo.findById(board.getSeq()).get();
//	}

	@Override
	public Board getBoard(Board board) {
		Board clickBoard = boardRepo.findById(board.getSeq()).get();
		clickBoard.setCnt(clickBoard.getCnt() + 1);
		boardRepo.save(clickBoard);
		return clickBoard;
	}

	@Override
	public void updateBoard(Board board) {
		Board findBoard = boardRepo.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepo.save(findBoard);
	}

	@Override
	public void deleteBoard(Board board) {
		boardRepo.deleteById(board.getSeq());
	}

}
