package com.sist.model;

import javax.servlet.http.HttpServletRequest;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("main.do") //사용자가 main.do를 호출하면 이 메서드를 사용 
	public String main_page(HttpServletRequest req)
	{
		return "";
	}
}
