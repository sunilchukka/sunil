package com.org.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LaunchController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String launchWebSite()
	{
		System.out.println("inside LaunchController");
		return "index.html";
	}

}
