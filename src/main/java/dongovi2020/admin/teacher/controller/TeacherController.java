package dongovi2020.admin.teacher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TeacherController {

	@RequestMapping("/teacher/teamList")
	public String team() throws Exception {
		return "teacher/teamList";
	}
	
	@RequestMapping("/teacher/teacherList")
	public String teacher() throws Exception {
		return "teacher/teacherList";
	}
}
