package dongovi2020.admin.teacher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TeacherController {

	@RequestMapping("/teacher/teamList")
	public String teamList() throws Exception {
		return "teacher/teamList";
	}
	
	@RequestMapping("/teacher/teacherList")
	public String teacherList() throws Exception {
		return "teacher/teacherList";
	}
	
	@RequestMapping("/teacher/areaList")
	public String areaList() throws Exception {
		return "teacher/areaList";
	}
	
	@RequestMapping("/teacher/placeList")
	public String placeList() throws Exception {
		return "teacher/placeList";
	}
	
	@RequestMapping("/teacher/lessonFormList")
	public String lessonFormList() throws Exception {
		return "teacher/lessonFormList";
	}
	
	@RequestMapping("/teacher/lessonList")
	public String lessonList() throws Exception {
		return "teacher/lessonList";
	}
}
