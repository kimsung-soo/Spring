package com.yedam.collect;

import lombok.Data;

@Data
public class EmpVO {
	// 필드 선언
	// empno, ename 생성자

	final private int empno;
	final private String ename;
	private String dept;

}
