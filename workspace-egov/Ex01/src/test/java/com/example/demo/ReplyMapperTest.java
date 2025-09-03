package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyVO;

@SpringBootTest
public class ReplyMapperTest {
	@Autowired ReplyMapper replyMapper;
	
	@Ignore
	@Test
	public void insert() {
		//given
		ReplyVO reply = new ReplyVO();
		reply.setBno(1L); //게시글번호
		reply.setReplyer("park"); //작성자
		reply.setReply("첫번째 댓글...");//댓글내용
		//when
		int result =replyMapper.insert(reply);
		//then
		assertEquals(result, 1);
	}
	
	
	//게시글 댓글 목록 조회
		@Test
	public void getList() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(1L);
		vo.setFirst(1);
		vo.setLast(10);
		List<ReplyVO> list = replyMapper.getList(vo);
		list.forEach(System.out::print);
		//list.forEach(reply -> System.out.println(reply));
		
	}
}
