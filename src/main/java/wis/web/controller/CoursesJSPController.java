package wis.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import wis.service.CourseService;

@Controller
public class CoursesJSPController {
    
	@Autowired
	CourseService courseService;
	
	@GetMapping({"/courseList"})
    public String showCourses(Model model) {
    	model.addAttribute("courses", courseService.findAll());
        return "courses";
    }
}
