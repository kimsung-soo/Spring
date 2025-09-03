package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoradServiceImpl  implements BoardService{
	final BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> selectBoardList(BoardVO board) {
		return boardMapper.selectBoardList(board);
	}

	@Override
	public int boardTotalCount(BoardVO board) {	
		return boardMapper.boardTotalCount(board);
	}

	@Override
	public BoardVO selectBoard(Long board) {		
		return boardMapper.selectBoard(board);
	}

}
