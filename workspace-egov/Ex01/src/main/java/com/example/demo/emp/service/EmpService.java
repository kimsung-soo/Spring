package com.example.demo.emp.service;

import java.util.List;

//use case diagram
public interface EmpService {

	// 건수조회
		Long selectCount(EmpVO empVO);
		
		// 전체조회
		List<EmpVO> selectEmp(EmpVO empVO);
		
		// 단건조회
		EmpVO selectEmpById(Long employeeId);
		
		//등록
		int insertEmp(EmpVO empVO);
		
		// 수정
		
		// 삭제
		
		// 퇴사
	
	
}
