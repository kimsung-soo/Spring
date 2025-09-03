package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.ReplyVO;

@Mapper
//등록 수정 삭제 => int or void 타입으로 
public interface ReplyMapper {
	
	//전체조회
	int insert (ReplyVO reply); //VO 값이 여러개일 경우 #{rno}, #{bno}, #{reply}
	 
	//수정
	int update (ReplyVO reply);
	
	//단건조회
	ReplyVO read (Long bno); //Long 값이 한개일 경우  #{rno}
	
	//삭제
	int delete (Long bno);
	
	//목록조회
	List<ReplyVO> getList(ReplyVO reply);
	
	// 댓글수 
	int getCountByBno (Long bno);
	
	
}
