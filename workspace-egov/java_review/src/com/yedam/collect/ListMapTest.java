package com.yedam.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class ListMapTest {

	@Test
	public void test1() {
		//Map : 테이블 1개 -> VO
		//테이블 조인 select -> Map
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> map = new HashMap<>();
		map.put("empno","100");
		map.put("ename","홍길동");
		map.put("dname","인사");
		
		list.add(map);
	}
}
