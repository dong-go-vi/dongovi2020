package dongovi2020.admin.teacher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TeacherController {

	@RequestMapping("/teacher/team")
	public String team() throws Exception {
		return "teacher/team";
	}
	
	@RequestMapping("/teacher/teacher")
	public String teacher() throws Exception {
		return "teacher/teacher";
	}
}
