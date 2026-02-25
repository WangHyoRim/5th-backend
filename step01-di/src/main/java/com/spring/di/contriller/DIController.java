package com.spring.di.contriller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.di.service.DIService;

import lombok.RequiredArgsConstructor;
//@RequiredArgsConstructor
@Component
public class DIController {

	//세터 주입 v1
	private DIService diService;
	@Autowired
	public void setDiService(DIService diService) {
		this.diService = diService;
	}
	
	//필드 주입 v1
	//@Autowired
	//private DIService diService;
	
	//생성자 주입 v2
	//private final DIService diService;
	
	//생성자 주입 v1
	/*private DIService diService;
	@Autowired
	public DIController(DIService diservice) {
		System.out.println("DIController 생성자");
		this.diService = diservice;
		System.out.println("Controller ===> Service : " + diService);
	}*/

}
