package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Lazy
@Scope("singleton")
@Component
//@RequiredArgsConstructor
public class SamsungTV implements TV {

	
	@Setter(onMethod_ = {@Autowired}  )
	 Speaker speaker;
	
	
	Date date;
	

	@Override
	public void powerOn() {
		System.out.println("삼성 TV--전원 on");
	}
	
	
	
	@Override
	public void powerOff() {
		System.out.println("삼성 TV--전원 off");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}