package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.BoardVO;

@Mapper
public interface BoardMapper {
	// 전체조회
	List<BoardVO> selectBoardList(BoardVO board);

	// 카운트
	int boardTotalCount(BoardVO board);
	
	//단건조회
	BoardVO selectBoard(Long board);
}
