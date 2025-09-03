package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class SampleHotel {
	// 1.필드 주입
	
	// 2.생성자 @RequiredArgsConstructor + final
		final Chef chef;
		Date date;
	
	// 3.setter(@Setter(onMehod_+{@Autowired})
//@Setter(onMethod_ = { @Autowired })
	//Chef chef;
	
	
	
}
