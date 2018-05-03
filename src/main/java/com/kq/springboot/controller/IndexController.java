package com.kq.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kq.springboot.dto.DtoResult;


@RestController
@RequestMapping(value="/index")
public class IndexController {
	
	@RequestMapping(value="/r")
	public DtoResult register() {
		DtoResult result = new DtoResult();
		System.out.println("IndexController register...");
		return result;
	}

}
