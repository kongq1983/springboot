package com.kq.springboot.controller;

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
		result.setResult(2);
		System.out.println("IndexController register...");

		request.getSession(true).setAttribute("login","true");

		return result;
	}

}
