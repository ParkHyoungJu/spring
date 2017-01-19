package com.gura.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		/*
		 * 	리턴되는 data type 과 메소드명은 상황에 맞게 구성할수 있다.
		 * 	-리턴 type 을 String 으로 한다는 것의 의미
		 * 	단, @ResponseBody 어노테이션이 없다는 가정 하에서
		 * 	1. forwrad 이동 정보를 리턴해준다.
		 * 	2. redirect 이동 정보를 리턴해준다.
		 * 		"redirect:요청경로"
		 * 
		 */
		return "home";
	}
	
}
