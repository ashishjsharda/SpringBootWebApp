package com.spring.coursewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller Class
 * @author ashish
 *
 */
@Controller
public class CoursesController {
	
	@RequestMapping("/courses")
	public String courses() {
		return "courses.jsp";
	}

}
