package com.example.demo.board.service;

import java.util.List;

public interface BoardService {
	
		// 전체조회
		List<BoardVO> selectBoardList(BoardVO board);

		// 카운트
		int boardTotalCount(BoardVO board);
		
		//단건조회
		BoardVO selectBoard(Long board);
	}


