package com.kq.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kq.springboot.dto.DtoResult;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping(value="/index")
public class IndexController {
	
	@RequestMapping(value="/r")
	public DtoResult register(HttpServletRequest request) {
		DtoResult result = new DtoResult();
		result.setResult(3);
		System.out.println("IndexController register...");

		request.getSession(true).setAttribute("login","true");

		return result;
	}


	@RequestMapping(value="/get/{id}")
	public DtoResult path(@PathVariable("id") String id) {
		DtoResult result = new DtoResult();
		result.setCode("10800000");
		result.setResult(id);
		return result;
	}

}
