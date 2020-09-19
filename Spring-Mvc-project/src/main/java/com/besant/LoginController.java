package com.besant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	
	@RequestMapping(value = "/ourOwn", method = RequestMethod.GET)
	public String ourOwnPage() {
		return "ourOwnHtmlPage";
	}
	
	@RequestMapping(value = "/ourOwn2", method = RequestMethod.GET)
	public String ourOwnPage2() {
		return "ourOwnHtmlPage2";
	}
}

